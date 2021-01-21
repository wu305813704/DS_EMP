package com.sunyard.emp.codegen.service;

import com.sunyard.emp.codegen.entity.GenConfig;

/**
 * @date 2018/7/29
 */
public interface UserGeneratorService {
	/**
	 * 生成代码
	 *
	 * @param tableNames 表名称
	 * @return
	 */
	byte[] generatorCode(GenConfig tableNames);

}
