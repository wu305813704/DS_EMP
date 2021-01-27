package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.OpCompanyInfoLegalMapper;
import com.sunyard.emp.entity.OpCompanyInfoLegal;
import com.sunyard.emp.service.OpCompanyInfoLegalService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 法人对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-22 16:54:59
 */
@Transactional
@Service("opCompanyInfoLegalService")
@AllArgsConstructor
public class OpCompanyInfoLegalServiceImpl extends ServiceImpl<OpCompanyInfoLegalMapper, OpCompanyInfoLegal> implements OpCompanyInfoLegalService {

    private final OpCompanyInfoLegalMapper dao;

    @Override
    public IPage<OpCompanyInfoLegal> queryList(Page<OpCompanyInfoLegal> page, OpCompanyInfoLegal opCompanyInfoLegal){
        return dao.query(page,opCompanyInfoLegal);
    }

}
