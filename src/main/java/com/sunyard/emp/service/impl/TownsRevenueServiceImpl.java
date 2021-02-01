package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.TownsRevenueMapper;
import com.sunyard.emp.entity.TownsRevenue;
import com.sunyard.emp.service.TownsRevenueService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 乡镇亩均税收
 *
 * @author KouKi
 * @version 2021-02-01 12:21:19
 */
@Transactional
@Service("townsRevenueService")
@AllArgsConstructor
public class TownsRevenueServiceImpl extends ServiceImpl<TownsRevenueMapper, TownsRevenue> implements TownsRevenueService {

    private final TownsRevenueMapper dao;

    @Override
    public IPage<TownsRevenue> queryList(Page<TownsRevenue> page, TownsRevenue townsRevenue){
        return dao.query(page,townsRevenue);
    }

}
