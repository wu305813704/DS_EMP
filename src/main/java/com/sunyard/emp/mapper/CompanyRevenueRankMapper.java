package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.CompanyRevenueRank;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 企业税收排名
 *
 * @author KouKi
 * @version 2021-02-01 12:35:05
 */
@Mapper
@Repository
public interface CompanyRevenueRankMapper extends BaseMapper<CompanyRevenueRank> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param companyRevenueRank 查询条件
     * @return 根据查询条件查出的企业税收排名列表
     */
    IPage<CompanyRevenueRank> query(Page<CompanyRevenueRank> page, @Param("companyRevenueRank") CompanyRevenueRank companyRevenueRank);
}
