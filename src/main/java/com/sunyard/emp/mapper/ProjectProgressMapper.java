package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.ProjectProgress;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 项目进度详情
 *
 * @author KouKi
 * @version 2021-02-01 18:51:33
 */
@Mapper
@Repository
public interface ProjectProgressMapper extends BaseMapper<ProjectProgress> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param projectProgress 查询条件
     * @return 根据查询条件查出的项目进度详情列表
     */
    IPage<ProjectProgress> query(Page<ProjectProgress> page, @Param("projectProgress") ProjectProgress projectProgress);
}
