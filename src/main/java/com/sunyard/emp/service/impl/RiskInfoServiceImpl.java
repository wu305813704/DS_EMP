package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.RiskInfoMapper;
import com.sunyard.emp.entity.RiskInfo;
import com.sunyard.emp.service.RiskInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 企业风险信息
 *
 * @author KouKi
 * @version 2021-01-31 13:53:15
 */
@Transactional
@Service("riskInfoService")
@AllArgsConstructor
public class RiskInfoServiceImpl extends ServiceImpl<RiskInfoMapper, RiskInfo> implements RiskInfoService {

    private final RiskInfoMapper dao;

    @Override
    public IPage<RiskInfo> queryList(Page<RiskInfo> page, RiskInfo riskInfo){
        return dao.query(page,riskInfo);
    }

}
