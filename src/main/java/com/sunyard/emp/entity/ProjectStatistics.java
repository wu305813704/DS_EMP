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
 * 项目统计
 *
 * @author KouKi
 * @version 2021-02-01 18:40:49
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("project_statistics")
@ApiModel(description = "项目统计实体")
public class ProjectStatistics extends Model<ProjectStatistics> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 项目总数
     */
    @ApiModelProperty(value = "项目总数")
    private Integer projectTotal;
    /**
     * 筹建项目
     */
    @ApiModelProperty(value = "筹建项目")
    private Integer projectCj;
    /**
     * 施工项目
     */
    @ApiModelProperty(value = "施工项目")
    private Integer projectSg;
    /**
     * 收尾项目
     */
    @ApiModelProperty(value = "收尾项目")
    private Integer projectSw;
    /**
     * 停缓项目
     */
    @ApiModelProperty(value = "停缓项目")
    private String projectTh;
    /**
     * 投产项目
     */
    @ApiModelProperty(value = "投产项目")
    private String projectTc;
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
