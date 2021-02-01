package com.sunyard.emp.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CompanyDetail extends CompanyInfo{
    /**
     * 企业对外投资
     */
    private List<OpCompanyInfo> opCompanyInfos;
    /**
     * 法人对外投资
     */
    private List<OpCompanyInfoLegal> opCompanyInfoLegals;
    /**
     * 销售趋势
     */
    private List<CompanySellInfo> companySellInfos;
    /**
     * 风险信息
     */
    private RiskInfo riskInfo;
    /**
     * 关系网络
     */
    private Map<String, List<CompanyRelation>> companyRelation;
    /**
     * 利润趋势
     */
    private List<CompanyProfitInfo> companyProfitInfos;
}
