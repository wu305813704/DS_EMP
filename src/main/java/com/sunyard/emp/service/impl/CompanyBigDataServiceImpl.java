package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanyBigDataMapper;
import com.sunyard.emp.entity.CompanyBigData;
import com.sunyard.emp.service.CompanyBigDataService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业大数据
 *
 * @author KouKi
 * @version 2021-02-01 12:54:11
 */
@Transactional
@Service("companyBigDataService")
@AllArgsConstructor
public class CompanyBigDataServiceImpl extends ServiceImpl<CompanyBigDataMapper, CompanyBigData> implements CompanyBigDataService {

    private final CompanyBigDataMapper dao;

    @Override
    public IPage<CompanyBigData> queryList(Page<CompanyBigData> page, CompanyBigData companyBigData){
        return dao.query(page,companyBigData);
    }

}
