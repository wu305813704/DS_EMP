package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.TownsInfo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 乡镇信息
 *
 * @author KouKi
 * @version 2021-01-27 16:21:55
 */
@Mapper
@Repository
public interface TownsInfoMapper extends BaseMapper<TownsInfo> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param townsInfo 查询条件
     * @return 根据查询条件查出的乡镇信息列表
     */
    IPage<TownsInfo> query(Page<TownsInfo> page, @Param("townsInfo") TownsInfo townsInfo);
}
