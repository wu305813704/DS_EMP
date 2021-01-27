package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.CompanySellInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 企业销售表
 *
 * @author KouKi
 * @version 2021-01-26 16:15:45
 */
public interface CompanySellInfoService extends IService<CompanySellInfo> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param companySellInfo 查询条件
    * @return 根据查询条件查出的企业销售表列表
    */
    IPage<CompanySellInfo> queryList(Page<CompanySellInfo> page, CompanySellInfo companySellInfo);
}

