package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.OpCompanyInfoMapper;
import com.sunyard.emp.entity.OpCompanyInfo;
import com.sunyard.emp.service.OpCompanyInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-21 16:48:14
 */
@Transactional
@Service("opCompanyInfoService")
@AllArgsConstructor
public class OpCompanyInfoServiceImpl extends ServiceImpl<OpCompanyInfoMapper, OpCompanyInfo> implements OpCompanyInfoService {

    private final OpCompanyInfoMapper dao;

    @Override
    public IPage<OpCompanyInfo> queryList(Page<OpCompanyInfo> page, OpCompanyInfo opCompanyInfo){
        return dao.query(page,opCompanyInfo);
    }

}
