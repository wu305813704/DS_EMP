package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.ProjectBigData;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 项目大数据
 *
 * @author KouKi
 * @version 2021-02-02 15:18:16
 */
@Mapper
@Repository
public interface ProjectBigDataMapper extends BaseMapper<ProjectBigData> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param projectBigData 查询条件
     * @return 根据查询条件查出的项目大数据列表
     */
    IPage<ProjectBigData> query(Page<ProjectBigData> page, @Param("projectBigData") ProjectBigData projectBigData);
}
