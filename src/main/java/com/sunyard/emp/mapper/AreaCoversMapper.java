package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.AreaCovers;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 占地分析
 *
 * @author KouKi
 * @version 2021-02-01 12:59:26
 */
@Mapper
@Repository
public interface AreaCoversMapper extends BaseMapper<AreaCovers> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param areaCovers 查询条件
     * @return 根据查询条件查出的占地分析列表
     */
    IPage<AreaCovers> query(Page<AreaCovers> page, @Param("areaCovers") AreaCovers areaCovers);
}
