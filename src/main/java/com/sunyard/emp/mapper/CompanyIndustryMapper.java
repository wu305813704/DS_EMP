package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.CompanyIndustry;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 企业行业分布
 *
 * @author KouKi
 * @version 2021-02-01 12:27:01
 */
@Mapper
@Repository
public interface CompanyIndustryMapper extends BaseMapper<CompanyIndustry> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param companyIndustry 查询条件
     * @return 根据查询条件查出的企业行业分布列表
     */
    IPage<CompanyIndustry> query(Page<CompanyIndustry> page, @Param("companyIndustry") CompanyIndustry companyIndustry);
}
