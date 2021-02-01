package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.ProjectProgressMapper;
import com.sunyard.emp.entity.ProjectProgress;
import com.sunyard.emp.service.ProjectProgressService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 项目进度详情
 *
 * @author KouKi
 * @version 2021-02-01 18:51:33
 */
@Transactional
@Service("projectProgressService")
@AllArgsConstructor
public class ProjectProgressServiceImpl extends ServiceImpl<ProjectProgressMapper, ProjectProgress> implements ProjectProgressService {

    private final ProjectProgressMapper dao;

    @Override
    public IPage<ProjectProgress> queryList(Page<ProjectProgress> page, ProjectProgress projectProgress){
        return dao.query(page,projectProgress);
    }

}
