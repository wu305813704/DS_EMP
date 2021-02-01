package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.ProjectStatisticsDetailMapper;
import com.sunyard.emp.entity.ProjectStatisticsDetail;
import com.sunyard.emp.service.ProjectStatisticsDetailService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 项目统计详情
 *
 * @author KouKi
 * @version 2021-02-01 18:47:04
 */
@Transactional
@Service("projectStatisticsDetailService")
@AllArgsConstructor
public class ProjectStatisticsDetailServiceImpl extends ServiceImpl<ProjectStatisticsDetailMapper, ProjectStatisticsDetail> implements ProjectStatisticsDetailService {

    private final ProjectStatisticsDetailMapper dao;

    @Override
    public IPage<ProjectStatisticsDetail> queryList(Page<ProjectStatisticsDetail> page, ProjectStatisticsDetail projectStatisticsDetail){
        return dao.query(page,projectStatisticsDetail);
    }

}
