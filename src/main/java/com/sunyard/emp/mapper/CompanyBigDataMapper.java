package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.CompanyBigData;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 企业大数据
 *
 * @author KouKi
 * @version 2021-02-01 12:54:11
 */
@Mapper
@Repository
public interface CompanyBigDataMapper extends BaseMapper<CompanyBigData> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param companyBigData 查询条件
     * @return 根据查询条件查出的企业大数据列表
     */
    IPage<CompanyBigData> query(Page<CompanyBigData> page, @Param("companyBigData") CompanyBigData companyBigData);
}
