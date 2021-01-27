package com.sunyard.emp.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 法人对外投资企业信息
 *
 * @author KouKi
 * @version 2021-01-22 16:54:59
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("op_company_info_legal")
@ApiModel(description = "法人对外投资企业信息实体")
public class OpCompanyInfoLegal extends Model<OpCompanyInfoLegal> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
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
     * 投资企业名称
     */
    @ApiModelProperty(value = "投资企业名称")
    private String opComName;
    /**
     * 法定代表人姓名
     */
    @ApiModelProperty(value = "法定代表人姓名")
    private String opLegalNae;
    /**
     * 企业(机构)类型
     */
    @ApiModelProperty(value = "企业(机构)类型")
    private String opComType;
    /**
     * 注册号
     */
    @ApiModelProperty(value = "注册号")
    private String opRegNo;
    /**
     * 企业状态
     */
    @ApiModelProperty(value = "企业状态")
    private String opStatus;
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
