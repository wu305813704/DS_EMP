package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.CompanyBigData;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 企业大数据
 *
 * @author KouKi
 * @version 2021-02-01 12:54:11
 */
public interface CompanyBigDataService extends IService<CompanyBigData> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param companyBigData 查询条件
    * @return 根据查询条件查出的企业大数据列表
    */
    IPage<CompanyBigData> queryList(Page<CompanyBigData> page, CompanyBigData companyBigData);
}

