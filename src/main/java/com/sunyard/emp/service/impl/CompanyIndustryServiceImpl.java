package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanyIndustryMapper;
import com.sunyard.emp.entity.CompanyIndustry;
import com.sunyard.emp.service.CompanyIndustryService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业行业分布
 *
 * @author KouKi
 * @version 2021-02-01 12:27:01
 */
@Transactional
@Service("companyIndustryService")
@AllArgsConstructor
public class CompanyIndustryServiceImpl extends ServiceImpl<CompanyIndustryMapper, CompanyIndustry> implements CompanyIndustryService {

    private final CompanyIndustryMapper dao;

    @Override
    public IPage<CompanyIndustry> queryList(Page<CompanyIndustry> page, CompanyIndustry companyIndustry){
        return dao.query(page,companyIndustry);
    }

}
