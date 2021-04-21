//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.lsf.shard.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.net.NetworkInterface;
/**
 * @program:
 * @description:
 * @author: 梁胜芳
 * @create: 2021-04-20
 */
public class SnowflakeId {
    private static final Logger logger = LoggerFactory.getLogger(SnowflakeId.class);
    private final long twepoch = 1420041600000L;
    private final long workerIdBits = 5L;
    private final long datacenterIdBits = 5L;
    private final long maxWorkerId = 31L;
    private final long maxDatacenterId = 31L;
    private final long sequenceBits = 12L;
    private final long workerIdShift = 12L;
    private final long datacenterIdShift = 17L;
    private final long timestampLeftShift = 22L;
    private final long sequenceMask = 4095L;
    private long workerId;
    private long datacenterId;
    private long sequence = 0L;
    private long lastTimestamp = -1L;

    public SnowflakeId() {
        this.datacenterId = getDatacenterId(31L);
        this.workerId = getMaxWorkerId(this.datacenterId, 31L);
    }

    public SnowflakeId(long workerId, long datacenterId) {
        if (workerId <= 31L && workerId >= 0L) {
            if (datacenterId <= 31L && datacenterId >= 0L) {
                this.workerId = workerId;
                this.datacenterId = datacenterId;
            } else {
                throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", 31L));
            }
        } else {
            throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", 31L));
        }
    }

    public synchronized long nextId() {
        long timestamp = this.timeGen();
        if (timestamp < this.lastTimestamp) {
            throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", this.lastTimestamp - timestamp));
        } else {
            if (this.lastTimestamp == timestamp) {
                this.sequence = this.sequence + 1L & 4095L;
                if (this.sequence == 0L) {
                    timestamp = this.tilNextMillis(this.lastTimestamp);
                }
            } else {
                this.sequence = 0L;
            }

            this.lastTimestamp = timestamp;
            return timestamp - 1420041600000L << 22 | this.datacenterId << 17 | this.workerId << 12 | this.sequence;
        }
    }

    protected static long getDatacenterId(long maxDatacenterId) {
        long id = 0L;

        try {
            InetAddress ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            if (network == null) {
                id = 1L;
            } else {
                byte[] mac = network.getHardwareAddress();
                if (null != mac) {
                    id = (255L & (long)mac[mac.length - 1] | 65280L & (long)mac[mac.length - 2] << 8) >> 6;
                    id %= maxDatacenterId + 1L;
                }
            }
        } catch (Exception var7) {
            logger.warn(" getDatacenterId: {}", var7.getMessage());
        }

        return id;
    }

    protected static long getMaxWorkerId(long datacenterId, long maxWorkerId) {
        StringBuilder mpid = new StringBuilder();
        mpid.append(datacenterId);
        String name = ManagementFactory.getRuntimeMXBean().getName();
        if (name == null || name == "") {
            mpid.append(name.split("@")[0]);
        }

        return (long)(mpid.toString().hashCode() & '\uffff') % (maxWorkerId + 1L);
    }

    protected long tilNextMillis(long lastTimestamp) {
        long timestamp;
        for(timestamp = this.timeGen(); timestamp <= lastTimestamp; timestamp = this.timeGen()) {
            ;
        }

        return timestamp;
    }

    protected long timeGen() {
        return System.currentTimeMillis();
    }

    /**
     * 从雪花id中计算出规定起始时间戳的时间戳
     * 起始时间戳见EPOCH字段
     *
     * @param snowId 雪花算法生成的id
     * @return
     */
    public long timestamp(long snowId) {
        return (snowId  >> 22) + 1420041600000L;
    }

}
