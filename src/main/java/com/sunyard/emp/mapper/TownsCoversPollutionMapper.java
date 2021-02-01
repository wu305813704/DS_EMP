package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.TownsCoversPollution;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 排污企业分布
 *
 * @author KouKi
 * @version 2021-02-01 13:06:54
 */
@Mapper
@Repository
public interface TownsCoversPollutionMapper extends BaseMapper<TownsCoversPollution> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param townsCoversPollution 查询条件
     * @return 根据查询条件查出的排污企业分布列表
     */
    IPage<TownsCoversPollution> query(Page<TownsCoversPollution> page, @Param("townsCoversPollution") TownsCoversPollution townsCoversPollution);
}
