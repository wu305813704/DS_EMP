package com.sunyard.emp.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.math.BigDecimal;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 企业基本信息
 *
 * @author KouKi
 * @version 2021-02-02 11:23:05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("company_info")
@ApiModel(description = "企业基本信息实体")
public class CompanyInfo extends Model<CompanyInfo> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 企业名称
     */
    @ApiModelProperty(value = "企业名称")
    private String comName;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private String status;
    /**
     * 法人姓名
     */
    @ApiModelProperty(value = "法人姓名")
    private String legalName;
    /**
     * 法人身份证
     */
    @ApiModelProperty(value = "法人身份证")
    private String legalCardNo;
    /**
     * 公司类型
     */
    @ApiModelProperty(value = "公司类型")
    private String comType;
    /**
     * 公司地址
     */
    @ApiModelProperty(value = "公司地址")
    private String comAddress;
    /**
     * 经度
     */
    @ApiModelProperty(value = "经度")
    private String lng;
    /**
     * 纬度
     */
    @ApiModelProperty(value = "纬度")
    private String lat;
    /**
     * 注册号
     */
    @ApiModelProperty(value = "注册号")
    private String regNo;
    /**
     * 注册资本(万元)
     */
    @ApiModelProperty(value = "注册资本(万元)")
    private BigDecimal regAmt;
    /**
     * 成立时间
     */
    @ApiModelProperty(value = "成立时间")
    private LocalDateTime regTime;
    /**
     * 登记机关
     */
    @ApiModelProperty(value = "登记机关")
    private String regOrg;
    /**
     * 经营范围
     */
    @ApiModelProperty(value = "经营范围")
    private String bizScope;
    /**
     * 行业类型
     */
    @ApiModelProperty(value = "行业类型")
    private String industryType;
    /**
     * 乡镇
     */
    @ApiModelProperty(value = "乡镇")
    private String towns;
    /**
     * 占地面积(亩)
     */
    @ApiModelProperty(value = "占地面积(亩)")
    private BigDecimal mu;
    /**
     * 营业额
     */
    @ApiModelProperty(value = "营业额")
    private BigDecimal turnover;
    /**
     * 是否是规上企业(1-是2-否)
     */
    @ApiModelProperty(value = "是否是规上企业(1-是2-否)")
    private String comGs;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private LocalDateTime createTime;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private LocalDateTime updateTime;

    /**
     * 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
