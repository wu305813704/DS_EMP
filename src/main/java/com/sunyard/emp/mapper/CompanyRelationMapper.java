package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.CompanyRelation;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 关系网络
 *
 * @author KouKi
 * @version 2021-02-01 12:04:21
 */
@Mapper
@Repository
public interface CompanyRelationMapper extends BaseMapper<CompanyRelation> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param companyRelation 查询条件
     * @return 根据查询条件查出的关系网络列表
     */
    IPage<CompanyRelation> query(Page<CompanyRelation> page, @Param("companyRelation") CompanyRelation companyRelation);
}
