package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.TownsCovers;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 区域分析
 *
 * @author KouKi
 * @version 2021-02-01 13:03:06
 */
public interface TownsCoversService extends IService<TownsCovers> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param townsCovers 查询条件
    * @return 根据查询条件查出的区域分析列表
    */
    IPage<TownsCovers> queryList(Page<TownsCovers> page, TownsCovers townsCovers);
}

