package com.lsf.shard.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program:
 * @description:
 * @author: 梁胜芳
 * @create: 2021-04-20
 */
@Data
public class DbGroupHash implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dbhash分组主键
     */
	private Long id;
	
    /**
     * db分组主键
     */
	private Long groupId;
	
    /**
     * db名称
     */
	private String dbName;
	
    /**
     * hash值分布(0,1,2)
     */
	private String hashValue;
}
