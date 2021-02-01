package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunyard.emp.entity.*;
import com.sunyard.emp.service.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.CompanyInfoMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 企业基本信息
 *
 * @author KouKi
 * @version 2021-01-27 16:26:39
 */
@Transactional
@Service("companyInfoService")
@AllArgsConstructor
public class CompanyInfoServiceImpl extends ServiceImpl<CompanyInfoMapper, CompanyInfo> implements CompanyInfoService {

    private final CompanyInfoMapper dao;
    private final OpCompanyInfoService opCompanyInfoService;
    private final OpCompanyInfoLegalService opCompanyInfoLegalService;
    private final CompanySellInfoService companySellInfoService;
    private final RiskInfoService riskInfoService;
    private final CompanyRelationService companyRelationService;
    private final CompanyProfitInfoService companyProfitInfoService;

    @Override
    public IPage<CompanyInfo> queryList(Page<CompanyInfo> page, CompanyInfo companyInfo){
        return dao.query(page,companyInfo);
    }

    @Override
    public CompanyDetail companyDetail(String regNo) {
        CompanyInfo companyInfo = getOne(Wrappers.<CompanyInfo>lambdaQuery().eq(CompanyInfo::getRegNo, regNo));
        CompanyDetail companyDetail = new CompanyDetail();
        BeanUtils.copyProperties(companyInfo, companyDetail);
        //企业对外投资信息
        List<OpCompanyInfo> opCompanyInfos = opCompanyInfoService.list(Wrappers.<OpCompanyInfo>lambdaQuery().eq(OpCompanyInfo::getRegNo, regNo));
        companyDetail.setOpCompanyInfos(opCompanyInfos);
        //法人对外投资信息
        List<OpCompanyInfoLegal> opCompanyInfoLegals = opCompanyInfoLegalService.list(Wrappers.<OpCompanyInfoLegal>lambdaQuery().eq(OpCompanyInfoLegal::getOpRegNo, regNo));
        companyDetail.setOpCompanyInfoLegals(opCompanyInfoLegals);
        //销售趋势
        List<CompanySellInfo> companySellInfos = companySellInfoService.list(Wrappers.<CompanySellInfo>lambdaQuery()
                .eq(CompanySellInfo::getRegNo, regNo)
        .last("limit 9"));
        companyDetail.setCompanySellInfos(companySellInfos);
        //风险信息
        RiskInfo riskInfo = riskInfoService.getOne(Wrappers.<RiskInfo>lambdaQuery().eq(RiskInfo::getRegNo, regNo));
        companyDetail.setRiskInfo(riskInfo);
        //关系网络
        List<CompanyRelation> companyRelations = companyRelationService.list(Wrappers.<CompanyRelation>lambdaQuery().eq(CompanyRelation::getRegNo, regNo));
        Map<String, List<CompanyRelation>> collect = companyRelations.parallelStream().collect(Collectors.groupingBy(companyRelation -> companyRelation.getType()));
        companyDetail.setCompanyRelation(collect);
        //利润趋势
        List<CompanyProfitInfo> companyProfitInfos = companyProfitInfoService.list(Wrappers.<CompanyProfitInfo>lambdaQuery().eq(CompanyProfitInfo::getRegNo, regNo));
        companyDetail.setCompanyProfitInfos(companyProfitInfos);
        return companyDetail;
    }

    @Override
    public Map<String, Long> industryType() {
        List<CompanyInfo> list = list();
        return list.parallelStream().collect(Collectors.groupingBy(CompanyInfo::getIndustryType, Collectors.counting()));
    }

}
