package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.TownsRevenue;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 乡镇亩均税收
 *
 * @author KouKi
 * @version 2021-02-01 12:21:19
 */
@Mapper
@Repository
public interface TownsRevenueMapper extends BaseMapper<TownsRevenue> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param townsRevenue 查询条件
     * @return 根据查询条件查出的乡镇亩均税收列表
     */
    IPage<TownsRevenue> query(Page<TownsRevenue> page, @Param("townsRevenue") TownsRevenue townsRevenue);
}
