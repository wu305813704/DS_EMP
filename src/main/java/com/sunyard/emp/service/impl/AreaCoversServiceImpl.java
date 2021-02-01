package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.AreaCoversMapper;
import com.sunyard.emp.entity.AreaCovers;
import com.sunyard.emp.service.AreaCoversService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 占地分析
 *
 * @author KouKi
 * @version 2021-02-01 12:59:26
 */
@Transactional
@Service("areaCoversService")
@AllArgsConstructor
public class AreaCoversServiceImpl extends ServiceImpl<AreaCoversMapper, AreaCovers> implements AreaCoversService {

    private final AreaCoversMapper dao;

    @Override
    public IPage<AreaCovers> queryList(Page<AreaCovers> page, AreaCovers areaCovers){
        return dao.query(page,areaCovers);
    }

}
