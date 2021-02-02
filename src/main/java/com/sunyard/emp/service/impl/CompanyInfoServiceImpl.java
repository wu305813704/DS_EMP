package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanyInfoMapper;
import com.sunyard.emp.entity.CompanyInfo;
import com.sunyard.emp.service.CompanyInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业基本信息
 *
 * @author KouKi
 * @version 2021-02-02 11:23:05
 */
@Transactional
@Service("companyInfoService")
@AllArgsConstructor
public class CompanyInfoServiceImpl extends ServiceImpl<CompanyInfoMapper, CompanyInfo> implements CompanyInfoService {

    private final CompanyInfoMapper dao;

    @Override
    public IPage<CompanyInfo> queryList(Page<CompanyInfo> page, CompanyInfo companyInfo){
        return dao.query(page,companyInfo);
    }

}
