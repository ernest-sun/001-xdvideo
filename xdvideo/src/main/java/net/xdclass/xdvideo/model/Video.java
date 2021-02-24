package net.xdclass.xdvideo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author 光影
 * @since 2021-02-23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("video")
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 视频标题
     */
    private String title;

    /**
     * 概述
     */
    private String summary;

    /**
     * 封面图
     */
    private String coverImg;

    /**
     * 观看数
     */
    private Integer viewNum;

    /**
     * 价格,分
     */
    private Integer price;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 0表示未上线，1表示上线
     */
    private Integer online;

    /**
     * 默认8.7，最高10分
     */
    private Double point;


}
