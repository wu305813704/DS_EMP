package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.TownsCoversPollution;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 排污企业分布
 *
 * @author KouKi
 * @version 2021-02-01 13:06:54
 */
public interface TownsCoversPollutionService extends IService<TownsCoversPollution> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param townsCoversPollution 查询条件
    * @return 根据查询条件查出的排污企业分布列表
    */
    IPage<TownsCoversPollution> queryList(Page<TownsCoversPollution> page, TownsCoversPollution townsCoversPollution);
}

