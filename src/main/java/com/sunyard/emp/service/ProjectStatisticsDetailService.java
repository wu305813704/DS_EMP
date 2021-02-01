package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.ProjectStatisticsDetail;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 项目统计详情
 *
 * @author KouKi
 * @version 2021-02-01 18:47:04
 */
public interface ProjectStatisticsDetailService extends IService<ProjectStatisticsDetail> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param projectStatisticsDetail 查询条件
    * @return 根据查询条件查出的项目统计详情列表
    */
    IPage<ProjectStatisticsDetail> queryList(Page<ProjectStatisticsDetail> page, ProjectStatisticsDetail projectStatisticsDetail);
}

