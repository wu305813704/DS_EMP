package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.ProjectStatistics;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 项目统计
 *
 * @author KouKi
 * @version 2021-02-01 18:40:49
 */
@Mapper
@Repository
public interface ProjectStatisticsMapper extends BaseMapper<ProjectStatistics> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param projectStatistics 查询条件
     * @return 根据查询条件查出的项目统计列表
     */
    IPage<ProjectStatistics> query(Page<ProjectStatistics> page, @Param("projectStatistics") ProjectStatistics projectStatistics);
}
