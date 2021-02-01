package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.TownsCovers;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 区域分析
 *
 * @author KouKi
 * @version 2021-02-01 13:03:06
 */
@Mapper
@Repository
public interface TownsCoversMapper extends BaseMapper<TownsCovers> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param townsCovers 查询条件
     * @return 根据查询条件查出的区域分析列表
     */
    IPage<TownsCovers> query(Page<TownsCovers> page, @Param("townsCovers") TownsCovers townsCovers);
}
