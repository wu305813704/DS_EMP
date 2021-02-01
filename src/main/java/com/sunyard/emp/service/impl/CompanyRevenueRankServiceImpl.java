package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanyRevenueRankMapper;
import com.sunyard.emp.entity.CompanyRevenueRank;
import com.sunyard.emp.service.CompanyRevenueRankService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业税收排名
 *
 * @author KouKi
 * @version 2021-02-01 12:35:05
 */
@Transactional
@Service("companyRevenueRankService")
@AllArgsConstructor
public class CompanyRevenueRankServiceImpl extends ServiceImpl<CompanyRevenueRankMapper, CompanyRevenueRank> implements CompanyRevenueRankService {

    private final CompanyRevenueRankMapper dao;

    @Override
    public IPage<CompanyRevenueRank> queryList(Page<CompanyRevenueRank> page, CompanyRevenueRank companyRevenueRank){
        return dao.query(page,companyRevenueRank);
    }

}
