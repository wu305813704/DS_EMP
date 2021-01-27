package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.CompanyRelation;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 企业关系
 *
 * @author KouKi
 * @version 2021-01-26 16:51:12
 */
public interface CompanyRelationService extends IService<CompanyRelation> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param companyRelation 查询条件
    * @return 根据查询条件查出的企业关系列表
    */
    IPage<CompanyRelation> queryList(Page<CompanyRelation> page, CompanyRelation companyRelation);
}

