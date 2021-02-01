package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.ProjectStatisticsMapper;
import com.sunyard.emp.entity.ProjectStatistics;
import com.sunyard.emp.service.ProjectStatisticsService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 项目统计
 *
 * @author KouKi
 * @version 2021-02-01 18:40:49
 */
@Transactional
@Service("projectStatisticsService")
@AllArgsConstructor
public class ProjectStatisticsServiceImpl extends ServiceImpl<ProjectStatisticsMapper, ProjectStatistics> implements ProjectStatisticsService {

    private final ProjectStatisticsMapper dao;

    @Override
    public IPage<ProjectStatistics> queryList(Page<ProjectStatistics> page, ProjectStatistics projectStatistics){
        return dao.query(page,projectStatistics);
    }

}
