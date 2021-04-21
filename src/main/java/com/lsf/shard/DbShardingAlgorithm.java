package com.lsf.shard;

import com.lsf.shard.entity.DbGroup;
import com.lsf.shard.entity.DbTableRelBO;
import com.lsf.shard.entity.ShardStrategyBO;
import com.lsf.shard.utils.IdGenerator;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program:
 * @description:
 * @author: 梁胜芳
 * @create: 2021-04-20
 */
public class DbShardingAlgorithm implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(final Collection<String> dbNames, final PreciseShardingValue<Long> shardingValue) {
        String db = "";
        ShardStrategyBO shardStrategy = ShardStrategyBO.getShardStrategy();
        List<DbTableRelBO> allDbTb = shardStrategy.getDbTableList();
        LocalDateTime createdTime = IdGenerator.timestamp(shardingValue.getValue());
        DbGroup dbGroup = shardStrategy.getDbGroups().stream().filter(i -> i.getStartTime().isBefore(createdTime) && i.getEndTime().isAfter(createdTime)).findFirst().get();
        List<DbTableRelBO> dbTableRelList = allDbTb.stream().filter(i-> i.getStartTime().isBefore(createdTime) && i.getEndTime().isAfter(createdTime)).collect(
                Collectors.toList());
        String hashValue = String.valueOf(shardingValue.getValue() % dbGroup.getTbCount());
        Optional<DbTableRelBO> optional = dbTableRelList.stream().filter(i -> i.getHashValue().indexOf(hashValue) != -1).findFirst();
        if (optional.isPresent()) {
            DbTableRelBO dbTableRelBO = optional.get();
            db = dbTableRelBO.getDbName();
        }
        if (db != "") {
            return db;
        }
        throw new UnsupportedOperationException("分库无法判定的值: " + shardingValue.getValue());
    }
}