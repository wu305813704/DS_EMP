package com.sunyard.emp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;import org.springframework.stereotype.Service;
import com.sunyard.emp.mapper.TownsInfoMapper;
import com.sunyard.emp.entity.TownsInfo;
import com.sunyard.emp.service.TownsInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
/**
 * 乡镇信息
 *
 * @author KouKi
 * @version 2021-01-27 16:21:55
 */
@Transactional
@Service("townsInfoService")
@AllArgsConstructor
public class TownsInfoServiceImpl extends ServiceImpl<TownsInfoMapper, TownsInfo> implements TownsInfoService {

    private final TownsInfoMapper dao;

    @Override
    public IPage<TownsInfo> queryList(Page<TownsInfo> page, TownsInfo townsInfo){
        return dao.query(page,townsInfo);
    }

}
