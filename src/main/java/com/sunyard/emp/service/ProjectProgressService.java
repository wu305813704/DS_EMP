package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.ProjectProgress;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 项目进度详情
 *
 * @author KouKi
 * @version 2021-02-01 18:51:33
 */
public interface ProjectProgressService extends IService<ProjectProgress> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param projectProgress 查询条件
    * @return 根据查询条件查出的项目进度详情列表
    */
    IPage<ProjectProgress> queryList(Page<ProjectProgress> page, ProjectProgress projectProgress);
}

