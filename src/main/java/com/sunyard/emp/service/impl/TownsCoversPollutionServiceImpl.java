package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.TownsCoversPollutionMapper;
import com.sunyard.emp.entity.TownsCoversPollution;
import com.sunyard.emp.service.TownsCoversPollutionService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 排污企业分布
 *
 * @author KouKi
 * @version 2021-02-01 13:06:54
 */
@Transactional
@Service("townsCoversPollutionService")
@AllArgsConstructor
public class TownsCoversPollutionServiceImpl extends ServiceImpl<TownsCoversPollutionMapper, TownsCoversPollution> implements TownsCoversPollutionService {

    private final TownsCoversPollutionMapper dao;

    @Override
    public IPage<TownsCoversPollution> queryList(Page<TownsCoversPollution> page, TownsCoversPollution townsCoversPollution){
        return dao.query(page,townsCoversPollution);
    }

}
