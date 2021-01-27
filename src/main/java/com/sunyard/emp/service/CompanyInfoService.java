package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.CompanyInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 企业基本信息
 *
 * @author KouKi
 * @version 2021-01-27 16:26:39
 */
public interface CompanyInfoService extends IService<CompanyInfo> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param companyInfo 查询条件
    * @return 根据查询条件查出的企业基本信息列表
    */
    IPage<CompanyInfo> queryList(Page<CompanyInfo> page, CompanyInfo companyInfo);
}

