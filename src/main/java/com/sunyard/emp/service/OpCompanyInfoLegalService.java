package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.OpCompanyInfoLegal;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 法人对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-22 16:54:59
 */
public interface OpCompanyInfoLegalService extends IService<OpCompanyInfoLegal> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param opCompanyInfoLegal 查询条件
    * @return 根据查询条件查出的法人对外投资企业信息列表
    */
    IPage<OpCompanyInfoLegal> queryList(Page<OpCompanyInfoLegal> page, OpCompanyInfoLegal opCompanyInfoLegal);
}

