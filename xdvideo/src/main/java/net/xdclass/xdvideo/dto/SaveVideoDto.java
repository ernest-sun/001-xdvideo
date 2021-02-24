package net.xdclass.xdvideo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * ClassName:SaveVideoDto
 * Package:net.xdclass.xdvideo.dto
 * Description:
 *
 * @Date:2021/2/24 10:25
 * @Author:sunzheng@bmrj.com
 */
@Data
@ApiModel(value = "新增视频请求模型")
public class SaveVideoDto {

    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 视频标题
     */
    @ApiModelProperty(value = "标题", required = true, example = "java程序设计")
    private String title;

    /**
     * 概述
     */
    @ApiModelProperty(value = "概述", required = true, example = "")
    private String summary;

    /**
     * 封面图
     */
    @ApiModelProperty(value = "封面图", required = true, example = "")
    private String coverImg;

    /**
     * 观看数
     */
    @ApiModelProperty(value = "观看数", required = true, example = "")
    private Integer viewNum;

    /**
     * 价格,分
     */
    @ApiModelProperty(value = "价格,分", required = true, example = "")
    private Integer price;

    /**
     * 0表示未上线，1表示上线
     */
    @ApiModelProperty(value = "0表示未上线，1表示上线", required = true, example = "1")
    private Integer online;

    /**
     * 默认8.7，最高10分
     */
    @ApiModelProperty(value = "评分，默认8.7，最高10分", required = true, example = "8.7")
    private Double point;
}
