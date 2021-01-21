package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.CompanyInfo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 企业基本信息
 *
 * @author KouKi
 * @version 2021-01-21 14:27:44
 */
@Mapper
@Repository
public interface CompanyInfoMapper extends BaseMapper<CompanyInfo> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param companyInfo 查询条件
     * @return 根据查询条件查出的企业基本信息列表
     */
    IPage<CompanyInfo> query(Page<CompanyInfo> page, @Param("companyInfo") CompanyInfo companyInfo);
}
