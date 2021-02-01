package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.RiskInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 企业风险信息
 *
 * @author KouKi
 * @version 2021-01-31 13:53:15
 */
public interface RiskInfoService extends IService<RiskInfo> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param riskInfo 查询条件
    * @return 根据查询条件查出的企业风险信息列表
    */
    IPage<RiskInfo> queryList(Page<RiskInfo> page, RiskInfo riskInfo);
}

