package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.TownsInfo;
import com.sunyard.emp.service.TownsInfoService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 乡镇信息
 *
 * @author KouKi
 * @version  2021-01-27 16:21:55
 */
@Api(tags = "乡镇信息")
@RestController
@RequestMapping("/townsInfo")
public class TownsInfoController {

    @Autowired
    private TownsInfoService townsInfoService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的乡镇信息分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "乡镇信息条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<TownsInfo> pageAndWrapper = PageAndWrapperUtil.getPage(params, TownsInfo.class);
        return new CommonResponse(townsInfoService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  townsInfo 查询条件
      * @return 根据查询条件查出的乡镇信息列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "乡镇信息条件查询列表")
    public CommonResponse list(@RequestBody TownsInfo townsInfo) {
        return new CommonResponse(townsInfoService.list(new QueryWrapper<>(townsInfo)));
    }

    /**
     * 信息
     * @param id 要查询的乡镇信息id
     * @return CommonResponse 根据id查询的乡镇信息信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "乡镇信息根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        TownsInfo townsInfo = townsInfoService.getById(id);
        return new CommonResponse<>(townsInfo);
    }

    /**
     * 保存
     * @param townsInfo 需要新增的乡镇信息信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "乡镇信息保存")
    public CommonResponse save(@RequestBody TownsInfo townsInfo) {
        return new CommonResponse<>(townsInfoService.save(townsInfo));
    }

    /**
     * 修改
     * @param townsInfo 需要更新的乡镇信息信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "乡镇信息修改")
    public CommonResponse update(@RequestBody TownsInfo townsInfo) {
        return new CommonResponse<>(townsInfoService.updateById(townsInfo));
    }

    /**
     * 删除
     * @param id 需要删除的乡镇信息id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "乡镇信息根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(townsInfoService.removeById(id));
    }

}
