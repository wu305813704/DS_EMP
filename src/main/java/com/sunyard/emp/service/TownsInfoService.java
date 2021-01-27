package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.TownsInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 乡镇信息
 *
 * @author KouKi
 * @version 2021-01-27 16:21:55
 */
public interface TownsInfoService extends IService<TownsInfo> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param townsInfo 查询条件
    * @return 根据查询条件查出的乡镇信息列表
    */
    IPage<TownsInfo> queryList(Page<TownsInfo> page, TownsInfo townsInfo);
}

