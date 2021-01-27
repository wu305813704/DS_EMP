package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.OpCompanyInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-21 16:48:14
 */
public interface OpCompanyInfoService extends IService<OpCompanyInfo> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param opCompanyInfo 查询条件
    * @return 根据查询条件查出的对外投资企业信息列表
    */
    IPage<OpCompanyInfo> queryList(Page<OpCompanyInfo> page, OpCompanyInfo opCompanyInfo);
}

