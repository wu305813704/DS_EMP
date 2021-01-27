package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanyProfitInfoMapper;
import com.sunyard.emp.entity.CompanyProfitInfo;
import com.sunyard.emp.service.CompanyProfitInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业利润
 *
 * @author KouKi
 * @version 2021-01-26 17:11:18
 */
@Transactional
@Service("companyProfitInfoService")
@AllArgsConstructor
public class CompanyProfitInfoServiceImpl extends ServiceImpl<CompanyProfitInfoMapper, CompanyProfitInfo> implements CompanyProfitInfoService {

    private final CompanyProfitInfoMapper dao;

    @Override
    public IPage<CompanyProfitInfo> queryList(Page<CompanyProfitInfo> page, CompanyProfitInfo companyProfitInfo){
        return dao.query(page,companyProfitInfo);
    }

}
