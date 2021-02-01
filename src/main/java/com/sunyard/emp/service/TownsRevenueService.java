package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.TownsRevenue;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 乡镇亩均税收
 *
 * @author KouKi
 * @version 2021-02-01 17:44:06
 */
public interface TownsRevenueService extends IService<TownsRevenue> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param townsRevenue 查询条件
    * @return 根据查询条件查出的乡镇亩均税收列表
    */
    IPage<TownsRevenue> queryList(Page<TownsRevenue> page, TownsRevenue townsRevenue);
}

