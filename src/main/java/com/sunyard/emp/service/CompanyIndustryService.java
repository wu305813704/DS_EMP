package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.CompanyIndustry;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 企业行业分布
 *
 * @author KouKi
 * @version 2021-02-01 12:27:01
 */
public interface CompanyIndustryService extends IService<CompanyIndustry> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param companyIndustry 查询条件
    * @return 根据查询条件查出的企业行业分布列表
    */
    IPage<CompanyIndustry> queryList(Page<CompanyIndustry> page, CompanyIndustry companyIndustry);
}

