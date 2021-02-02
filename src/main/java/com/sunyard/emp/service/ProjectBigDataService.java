package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.ProjectBigData;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 项目大数据
 *
 * @author KouKi
 * @version 2021-02-02 11:32:39
 */
public interface ProjectBigDataService extends IService<ProjectBigData> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param projectBigData 查询条件
    * @return 根据查询条件查出的项目大数据列表
    */
    IPage<ProjectBigData> queryList(Page<ProjectBigData> page, ProjectBigData projectBigData);
}

