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
 * 占地分析
 *
 * @author KouKi
 * @version 2021-02-01 12:59:26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("area_covers")
@ApiModel(description = "占地分析实体")
public class AreaCovers extends Model<AreaCovers> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 乡镇
     */
    @ApiModelProperty(value = "乡镇")
    private String towns;
    /**
     * 国有出让
     */
    @ApiModelProperty(value = "国有出让")
    private Integer gycr;
    /**
     * 农村集体
     */
    @ApiModelProperty(value = "农村集体")
    private Integer ncjt;
    /**
     * 其他用地
     */
    @ApiModelProperty(value = "其他用地")
    private Integer other;
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
