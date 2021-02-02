package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.ProjectInvestProportion;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 投资来源占比
 *
 * @author KouKi
 * @version 2021-02-01 18:56:10
 */
public interface ProjectInvestProportionService extends IService<ProjectInvestProportion> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param projectInvestProportion 查询条件
    * @return 根据查询条件查出的投资来源占比列表
    */
    IPage<ProjectInvestProportion> queryList(Page<ProjectInvestProportion> page, ProjectInvestProportion projectInvestProportion);
}

