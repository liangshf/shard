package com.lsf.shard.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @program:
 * @description:
 * @author: 梁胜芳
 * @create: 2021-04-20
 */
@Data
public class DbTableRel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * table分组主键
     */
	private Long id;
	
    /**
     * table名称
     */
	private String tableName;
	
    /**
     * dbhash分组主键
     */
	private Long dbHashId;
	
    /**
     * 业务主键开始范围
     */
	private Long startBusId;
	
    /**
     * 业务主键结束范围
     */
	private Long endBusId;
	
    /**
     * 开始时间
     */
	private LocalDateTime startTime;
	
    /**
     * 结束时间
     */
	private LocalDateTime endTime;
}
