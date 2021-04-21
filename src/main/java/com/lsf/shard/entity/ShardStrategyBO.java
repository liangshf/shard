package com.lsf.shard.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @program:
 * @description: 分片策略
 * @author: 梁胜芳
 * @create: 2021-04-20
 */
@Data
public class ShardStrategyBO {
    private List<DbGroup> dbGroups = new ArrayList<>();

    private List<DbTableRelBO> dbTableList = new ArrayList<>(32);

    private ShardStrategyBO(){
    }

    private static class ShardStrategy {
        private static ShardStrategyBO getShardStrategy(){

            ShardStrategyBO shardStrategyBO = new ShardStrategyBO();
            DbGroup dbGroup = new DbGroup();
            dbGroup.setTbCount(10);
            dbGroup.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbGroup.setEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            shardStrategyBO.getDbGroups().add(dbGroup);
            DbGroup dbGroup1 = new DbGroup();
            dbGroup1.setTbCount(9);
            dbGroup1.setStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbGroup1.setEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            shardStrategyBO.getDbGroups().add(dbGroup1);
            buildShardTB0(shardStrategyBO);
            buildShardTB1(shardStrategyBO);
            buildShardTB2(shardStrategyBO);
            buildShardTB3(shardStrategyBO);
            buildShardTB4(shardStrategyBO);
            buildShardTB5(shardStrategyBO);
            buildShardTB6(shardStrategyBO);
            buildShardTB7(shardStrategyBO);
            buildShardTB8(shardStrategyBO);
            buildShardTB9(shardStrategyBO);
            buildShardTB10(shardStrategyBO);
            buildShardTB11(shardStrategyBO);
            buildShardTB12(shardStrategyBO);
            buildShardTB13(shardStrategyBO);
            buildShardTB14(shardStrategyBO);
            buildShardTB15(shardStrategyBO);
            buildShardTB16(shardStrategyBO);
            buildShardTB17(shardStrategyBO);
            buildShardTB18(shardStrategyBO);
            return shardStrategyBO;
        }

        private static void buildShardTB0(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard0");
            dbTableRelBO.setDbHashId(1L);
            dbTableRelBO.setHashValue("0,1,2");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade10");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB1(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard1");
            dbTableRelBO.setDbHashId(1L);
            dbTableRelBO.setHashValue("0,1,2");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(10000000L);
            dbTableRelBO.setEndBusId(25000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2021, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade10");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB2(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard2");
            dbTableRelBO.setDbHashId(1L);
            dbTableRelBO.setHashValue("0,1,2");
            dbTableRelBO.setStartTime(LocalDateTime.of(2021, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(25000000L);
            dbTableRelBO.setEndBusId(40000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade10");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB3(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard3");
            dbTableRelBO.setDbHashId(2L);
            dbTableRelBO.setHashValue("3,4,5");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade11");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB4(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard4");
            dbTableRelBO.setDbHashId(2L);
            dbTableRelBO.setHashValue("3,4,5");
            dbTableRelBO.setStartTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2021, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(10000000L);
            dbTableRelBO.setEndBusId(25000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade11");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB5(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard5");
            dbTableRelBO.setDbHashId(2L);
            dbTableRelBO.setHashValue("3,4,5");
            dbTableRelBO.setStartTime(LocalDateTime.of(2021, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(20222, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(25000000L);
            dbTableRelBO.setEndBusId(40000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade11");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB6(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard6");
            dbTableRelBO.setDbHashId(3L);
            dbTableRelBO.setHashValue("6,7,8,9");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade12");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB7(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard7");
            dbTableRelBO.setDbHashId(3L);
            dbTableRelBO.setHashValue("6,7,8,9");
            dbTableRelBO.setStartTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2021, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(10000000L);
            dbTableRelBO.setEndBusId(20000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade12");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB8(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard8");
            dbTableRelBO.setDbHashId(3L);
            dbTableRelBO.setHashValue("6,7,8,9");
            dbTableRelBO.setStartTime(LocalDateTime.of(2021, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2021, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(20000000L);
            dbTableRelBO.setEndBusId(30000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade12");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB9(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard9");
            dbTableRelBO.setDbHashId(3L);
            dbTableRelBO.setHashValue("6,7,8,9");
            dbTableRelBO.setStartTime(LocalDateTime.of(2021, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(30000000L);
            dbTableRelBO.setEndBusId(40000000L);
            dbTableRelBO.setGroupId(1L);
            dbTableRelBO.setGroupStartBusId(1L);
            dbTableRelBO.setGroupEndBusId(40000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade12");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB10(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard10");
            dbTableRelBO.setDbHashId(4L);
            dbTableRelBO.setHashValue("0,1,2");
            dbTableRelBO.setStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2022, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(40000000L);
            dbTableRelBO.setEndBusId(50000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade20");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB11(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard11");
            dbTableRelBO.setDbHashId(4L);
            dbTableRelBO.setHashValue("0,1,2");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade20");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB12(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard12");
            dbTableRelBO.setDbHashId(4L);
            dbTableRelBO.setHashValue("0,1,2");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade20");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB13(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard13");
            dbTableRelBO.setDbHashId(5L);
            dbTableRelBO.setHashValue("3,4,5");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade21");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB14(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard14");
            dbTableRelBO.setDbHashId(5L);
            dbTableRelBO.setHashValue("3,4,5");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade21");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB15(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard15");
            dbTableRelBO.setDbHashId(5L);
            dbTableRelBO.setHashValue("3,4,5");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade21");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB16(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard16");
            dbTableRelBO.setDbHashId(6L);
            dbTableRelBO.setHashValue("6,7,8");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade22");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB17(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard17");
            dbTableRelBO.setDbHashId(6L);
            dbTableRelBO.setHashValue("6,7,8");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade22");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
        private static void buildShardTB18(ShardStrategyBO shardStrategyBO) {
            DbTableRelBO dbTableRelBO = new DbTableRelBO();
            dbTableRelBO.setTableName("order_info_shard18");
            dbTableRelBO.setDbHashId(6L);
            dbTableRelBO.setHashValue("6,7,8");
            dbTableRelBO.setStartTime(LocalDateTime.of(2017, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setEndTime(LocalDateTime.of(2020, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setStartBusId(1L);
            dbTableRelBO.setEndBusId(10000000L);
            dbTableRelBO.setGroupId(2L);
            dbTableRelBO.setGroupStartBusId(40000000L);
            dbTableRelBO.setGroupEndBusId(80000000L);
            dbTableRelBO.setGroupStartTime(LocalDateTime.of(2022, 01, 01 ,00 , 00, 00));
            dbTableRelBO.setGroupEndTime(LocalDateTime.of(2023, 06, 01 ,00 , 00, 00));
            dbTableRelBO.setDbName("retailtrade22");
            shardStrategyBO.getDbTableList().add(dbTableRelBO);
        }
    }

    public static ShardStrategyBO getShardStrategy() {
        return ShardStrategy.getShardStrategy();
    }


}