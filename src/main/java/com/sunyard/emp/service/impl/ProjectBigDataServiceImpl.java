package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.ProjectBigDataMapper;
import com.sunyard.emp.entity.ProjectBigData;
import com.sunyard.emp.service.ProjectBigDataService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 项目大数据
 *
 * @author KouKi
 * @version 2021-02-02 15:18:16
 */
@Transactional
@Service("projectBigDataService")
@AllArgsConstructor
public class ProjectBigDataServiceImpl extends ServiceImpl<ProjectBigDataMapper, ProjectBigData> implements ProjectBigDataService {

    private final ProjectBigDataMapper dao;

    @Override
    public IPage<ProjectBigData> queryList(Page<ProjectBigData> page, ProjectBigData projectBigData){
        return dao.query(page,projectBigData);
    }

}
