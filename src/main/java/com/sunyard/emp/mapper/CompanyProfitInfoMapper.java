package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.CompanyProfitInfo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 企业利润
 *
 * @author KouKi
 * @version 2021-01-26 17:11:18
 */
@Mapper
@Repository
public interface CompanyProfitInfoMapper extends BaseMapper<CompanyProfitInfo> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param companyProfitInfo 查询条件
     * @return 根据查询条件查出的企业利润列表
     */
    IPage<CompanyProfitInfo> query(Page<CompanyProfitInfo> page, @Param("companyProfitInfo") CompanyProfitInfo companyProfitInfo);
}
