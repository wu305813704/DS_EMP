package com.sunyard.emp.utils;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunyard.emp.entity.PageAndWrapper;

import java.util.List;
import java.util.Map;

public class PageAndWrapperUtil {

    public static <T> PageAndWrapper<T> getPage(Map<String, Object> params, Class<T> clazz) {
        long pageNum = Long.parseLong(params.getOrDefault("pageNum", 1L).toString());
        long pageSize = Long.parseLong(params.getOrDefault("pageSize", 10L).toString());
        Page<T> page = new Page<>(pageNum, pageSize);
        PageAndWrapper<T> pageAndWrapper = new PageAndWrapper<>();
        pageAndWrapper.setPage(page);
        try {
            T t = JSON.parseObject(JSON.toJSONString(params), clazz);
            QueryWrapper<T> queryWrapper = new QueryWrapper<>(t);
            pageAndWrapper.setQueryWrapper(queryWrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageAndWrapper;
    }

    public static Page getPage(Object params) {
        Object pageNum = BeanUtil.getProperty(params, "pageNum");
        Object pageSize = BeanUtil.getProperty(params, "pageSize");
        Page page = new Page(pageNum == null ? 1L : Long.parseLong(pageNum.toString()),
                pageSize == null ? 10L : Long.parseLong(pageSize.toString()));

        return page;
    }


    /**
     * @DESCRIPTION 响应前端需要的Page类
     */
    public static <T> Page<T> getPage(List<T> dataList, long pageCurrent, long pageSize, long total) {
        Page<T> page = new Page<>(pageCurrent, pageSize, total);
        page.setRecords(dataList);
        return page;
    }
}
