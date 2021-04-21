//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.lsf.shard.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
 * @program:
 * @description:
 * @author: 梁胜芳
 * @create: 2021-04-20
 */
public class IdGenerator {
    private static SnowflakeId snowflakeId = new SnowflakeId();

    public IdGenerator() {
    }

    public static String nextStrId() {
        return String.valueOf(snowflakeId.nextId());
    }

    public static long nextId() {
        return snowflakeId.nextId();
    }

    public static LocalDateTime timestamp(long snowId) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(snowflakeId.timestamp(snowId)), ZoneId.systemDefault());
    }
}
