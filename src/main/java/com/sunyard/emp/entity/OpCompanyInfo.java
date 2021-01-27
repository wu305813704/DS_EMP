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
 * 对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-21 16:48:14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("op_company_info")
@ApiModel(description = "对外投资企业信息实体")
public class OpCompanyInfo extends Model<OpCompanyInfo> {
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
     * 注册号
     */
    @ApiModelProperty(value = "注册号")
    private String regNo;
    /**
     * 投资企业名称
     */
    @ApiModelProperty(value = "投资企业名称")
    private String opComName;
    /**
     * 投资企业注册资本(万元)
     */
    @ApiModelProperty(value = "投资企业注册资本(万元)")
    private BigDecimal opRegAmt;
    /**
     * 投资企业注册币种
     */
    @ApiModelProperty(value = "投资企业注册币种")
    private String opRegCurrency;
    /**
     * 投资企业法人姓名
     */
    @ApiModelProperty(value = "投资企业法人姓名")
    private String opLegalName;

    /**
     * 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
