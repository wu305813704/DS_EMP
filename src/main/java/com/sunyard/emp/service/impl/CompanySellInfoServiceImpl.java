package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanySellInfoMapper;
import com.sunyard.emp.entity.CompanySellInfo;
import com.sunyard.emp.service.CompanySellInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业销售表
 *
 * @author KouKi
 * @version 2021-01-26 16:15:45
 */
@Transactional
@Service("companySellInfoService")
@AllArgsConstructor
public class CompanySellInfoServiceImpl extends ServiceImpl<CompanySellInfoMapper, CompanySellInfo> implements CompanySellInfoService {

    private final CompanySellInfoMapper dao;

    @Override
    public IPage<CompanySellInfo> queryList(Page<CompanySellInfo> page, CompanySellInfo companySellInfo){
        return dao.query(page,companySellInfo);
    }

}
