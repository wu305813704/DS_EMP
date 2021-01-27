package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.OpCompanyInfoLegal;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 法人对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-22 16:54:59
 */
@Mapper
@Repository
public interface OpCompanyInfoLegalMapper extends BaseMapper<OpCompanyInfoLegal> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param opCompanyInfoLegal 查询条件
     * @return 根据查询条件查出的法人对外投资企业信息列表
     */
    IPage<OpCompanyInfoLegal> query(Page<OpCompanyInfoLegal> page, @Param("opCompanyInfoLegal") OpCompanyInfoLegal opCompanyInfoLegal);
}
