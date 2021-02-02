package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.ProjectInvestProportionMapper;
import com.sunyard.emp.entity.ProjectInvestProportion;
import com.sunyard.emp.service.ProjectInvestProportionService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 投资来源占比
 *
 * @author KouKi
 * @version 2021-02-01 18:56:10
 */
@Transactional
@Service("projectInvestProportionService")
@AllArgsConstructor
public class ProjectInvestProportionServiceImpl extends ServiceImpl<ProjectInvestProportionMapper, ProjectInvestProportion> implements ProjectInvestProportionService {

    private final ProjectInvestProportionMapper dao;

    @Override
    public IPage<ProjectInvestProportion> queryList(Page<ProjectInvestProportion> page, ProjectInvestProportion projectInvestProportion){
        return dao.query(page,projectInvestProportion);
    }

}
