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
 * 项目进度详情
 *
 * @author KouKi
 * @version 2021-02-01 18:51:33
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("project_progress")
@ApiModel(description = "项目进度详情实体")
public class ProjectProgress extends Model<ProjectProgress> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @JsonSerialize(using = ToStringSerializer.class)
    @ApiModelProperty(value = "")
    private Long id;
    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String name;
    /**
     *
     */
    @ApiModelProperty(value = "")
    private String progress;
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
