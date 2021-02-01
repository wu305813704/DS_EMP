package com.sunyard.emp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunyard.emp.entity.RiskInfo;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 企业风险信息
 *
 * @author KouKi
 * @version 2021-01-31 13:53:15
 */
@Mapper
@Repository
public interface RiskInfoMapper extends BaseMapper<RiskInfo> {
    /**
     * 带分页和查询条件的查询
     * @param page 分页参数
     * @param riskInfo 查询条件
     * @return 根据查询条件查出的企业风险信息列表
     */
    IPage<RiskInfo> query(Page<RiskInfo> page, @Param("riskInfo") RiskInfo riskInfo);
}
