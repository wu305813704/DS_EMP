package com.sunyard.emp.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sunyard.emp.entity.CompanyRevenueRank;
import com.sunyard.emp.service.CompanyRevenueRankService;
import com.sunyard.emp.entity.CommonResponse;
import com.sunyard.emp.entity.PageAndWrapper;
import com.sunyard.emp.utils.PageAndWrapperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Map;

/**
 * 企业税收排名
 *
 * @author KouKi
 * @version  2021-02-01 17:45:49
 */
@Api(tags = "企业税收排名")
@RestController
@RequestMapping("/companyRevenueRank")
public class CompanyRevenueRankController {

    @Autowired
    private CompanyRevenueRankService companyRevenueRankService;

    /**
    *  带查询条件和分页的列表
    * @param params 参数
    * @return 根据查询条件查出的企业税收排名分页列表
    */
    @PostMapping("/page")
    @ApiOperation(value = "企业税收排名条件分页列表")
    public CommonResponse page(@RequestBody Map<String, Object> params) {
        PageAndWrapper<CompanyRevenueRank> pageAndWrapper = PageAndWrapperUtil.getPage(params, CompanyRevenueRank.class);
        return new CommonResponse(companyRevenueRankService.page(pageAndWrapper.getPage(), pageAndWrapper.getQueryWrapper()));
    }

    /**
      * 带查询条件的列表
      * @param  companyRevenueRank 查询条件
      * @return 根据查询条件查出的企业税收排名列表
      */
    @PostMapping("/list")
    @ApiOperation(value = "企业税收排名条件查询列表")
    public CommonResponse list(@RequestBody CompanyRevenueRank companyRevenueRank) {
        return new CommonResponse(companyRevenueRankService.list(new QueryWrapper<>(companyRevenueRank)));
    }

    /**
     * 信息
     * @param id 要查询的企业税收排名id
     * @return CommonResponse 根据id查询的企业税收排名信息
     */
    @GetMapping("/{id}")
    @ApiOperation(value = "企业税收排名根据id查询信息")
    public CommonResponse info(@PathVariable("id") Long id) {
        CompanyRevenueRank companyRevenueRank = companyRevenueRankService.getById(id);
        return new CommonResponse<>(companyRevenueRank);
    }

    /**
     * 保存
     * @param companyRevenueRank 需要新增的企业税收排名信息
     * @return CommonResponse 是否新增成功
     */
    @PostMapping
    @ApiOperation(value = "企业税收排名保存")
    public CommonResponse save(@RequestBody CompanyRevenueRank companyRevenueRank) {
        return new CommonResponse<>(companyRevenueRankService.save(companyRevenueRank));
    }

    /**
     * 修改
     * @param companyRevenueRank 需要更新的企业税收排名信息
     * @return CommonResponse 是否修改成功
     */
    @PutMapping
    @ApiOperation(value = "企业税收排名修改")
    public CommonResponse update(@RequestBody CompanyRevenueRank companyRevenueRank) {
        return new CommonResponse<>(companyRevenueRankService.updateById(companyRevenueRank));
    }

    /**
     * 删除
     * @param id 需要删除的企业税收排名id
     * @return CommonResponse 是否删除成功
     */
    @DeleteMapping("/{id}")
    @ApiOperation(value = "企业税收排名根据id删除")
    public CommonResponse delete(@PathVariable Long id) {
        return new CommonResponse<>(companyRevenueRankService.removeById(id));
    }

}
