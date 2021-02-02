package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.ProjectInvestProportion;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 投资来源占比
 *
 * @author KouKi
 * @version 2021-02-01 18:56:10
 */
@Mapper
@Repository
public interface ProjectInvestProportionMapper extends BaseMapper<ProjectInvestProportion> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param projectInvestProportion 查询条件
     * @return 根据查询条件查出的投资来源占比列表
     */
    IPage<ProjectInvestProportion> query(Page<ProjectInvestProportion> page, @Param("projectInvestProportion") ProjectInvestProportion projectInvestProportion);
}
