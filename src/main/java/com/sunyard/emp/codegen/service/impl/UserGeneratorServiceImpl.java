package com.sunyard.emp.codegen.service.impl;

import cn.hutool.core.io.IoUtil;
import com.sunyard.emp.codegen.entity.GenConfig;
import com.sunyard.emp.codegen.mapper.UserGeneratorMapper;
import com.sunyard.emp.codegen.service.UserGeneratorService;
import com.sunyard.emp.codegen.util.GenUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/**
 * 代码生成器
 *
 * @date 2018-07-30
 */
@Service
@AllArgsConstructor
public class UserGeneratorServiceImpl implements UserGeneratorService {
	@Autowired
	private UserGeneratorMapper userGeneratorMapper;

	/**
	 * 生成代码
	 *
	 * @param genConfig 生成配置
	 * @return
	 */
	@Override
	public byte[] generatorCode(GenConfig genConfig) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		ZipOutputStream zip = new ZipOutputStream(outputStream);

		//查询表信息
		Map<String, String> table = queryTable(genConfig.getTableName());
		//查询列信息
		List<Map<String, String>> columns = queryColumns(genConfig.getTableName());
		//生成代码
		GenUtils.generatorCode(genConfig, table, columns, zip);
		IoUtil.close(zip);
		return outputStream.toByteArray();
	}

	private Map<String, String> queryTable(String tableName) {
		return userGeneratorMapper.queryTable(tableName);
	}

	private List<Map<String, String>> queryColumns(String tableName) {
		return userGeneratorMapper.queryColumns(tableName);
	}
}
