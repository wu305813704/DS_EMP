package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.ProjectStatistics;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 项目统计
 *
 * @author KouKi
 * @version 2021-02-01 18:40:49
 */
public interface ProjectStatisticsService extends IService<ProjectStatistics> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param projectStatistics 查询条件
    * @return 根据查询条件查出的项目统计列表
    */
    IPage<ProjectStatistics> queryList(Page<ProjectStatistics> page, ProjectStatistics projectStatistics);
}

