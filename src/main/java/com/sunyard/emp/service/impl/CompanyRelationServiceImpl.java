package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanyRelationMapper;
import com.sunyard.emp.entity.CompanyRelation;
import com.sunyard.emp.service.CompanyRelationService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业关系
 *
 * @author KouKi
 * @version 2021-01-26 16:51:12
 */
@Transactional
@Service("companyRelationService")
@AllArgsConstructor
public class CompanyRelationServiceImpl extends ServiceImpl<CompanyRelationMapper, CompanyRelation> implements CompanyRelationService {

    private final CompanyRelationMapper dao;

    @Override
    public IPage<CompanyRelation> queryList(Page<CompanyRelation> page, CompanyRelation companyRelation){
        return dao.query(page,companyRelation);
    }

}
