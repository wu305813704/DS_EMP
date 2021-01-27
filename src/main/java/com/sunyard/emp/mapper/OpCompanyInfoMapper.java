package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.OpCompanyInfo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-21 16:48:14
 */
@Mapper
@Repository
public interface OpCompanyInfoMapper extends BaseMapper<OpCompanyInfo> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param opCompanyInfo 查询条件
     * @return 根据查询条件查出的对外投资企业信息列表
     */
    IPage<OpCompanyInfo> query(Page<OpCompanyInfo> page, @Param("opCompanyInfo") OpCompanyInfo opCompanyInfo);
}
