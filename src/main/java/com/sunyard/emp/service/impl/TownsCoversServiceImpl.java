package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.TownsCoversMapper;
import com.sunyard.emp.entity.TownsCovers;
import com.sunyard.emp.service.TownsCoversService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 区域分析
 *
 * @author KouKi
 * @version 2021-02-01 13:03:06
 */
@Transactional
@Service("townsCoversService")
@AllArgsConstructor
public class TownsCoversServiceImpl extends ServiceImpl<TownsCoversMapper, TownsCovers> implements TownsCoversService {

    private final TownsCoversMapper dao;

    @Override
    public IPage<TownsCovers> queryList(Page<TownsCovers> page, TownsCovers townsCovers){
        return dao.query(page,townsCovers);
    }

}
