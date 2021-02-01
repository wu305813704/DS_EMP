package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.AreaCovers;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 占地分析
 *
 * @author KouKi
 * @version 2021-02-01 12:59:26
 */
public interface AreaCoversService extends IService<AreaCovers> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param areaCovers 查询条件
    * @return 根据查询条件查出的占地分析列表
    */
    IPage<AreaCovers> queryList(Page<AreaCovers> page, AreaCovers areaCovers);
}

