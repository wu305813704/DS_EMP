package com.sunyard.emp.entity;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

@Data
public class PageAndWrapper<T> {
    private Page<T> page;
    private QueryWrapper<T> queryWrapper;
}
