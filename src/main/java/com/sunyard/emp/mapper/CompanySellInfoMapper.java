package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.CompanySellInfo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 企业销售表
 *
 * @author KouKi
 * @version 2021-01-26 16:15:45
 */
@Mapper
@Repository
public interface CompanySellInfoMapper extends BaseMapper<CompanySellInfo> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param companySellInfo 查询条件
     * @return 根据查询条件查出的企业销售表列表
     */
    IPage<CompanySellInfo> query(Page<CompanySellInfo> page, @Param("companySellInfo") CompanySellInfo companySellInfo);
}
