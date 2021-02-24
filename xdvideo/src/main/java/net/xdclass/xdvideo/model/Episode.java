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
@TableName("episode")
public class Episode implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 集标题
     */
    private String title;

    /**
     * 第几集
     */
    private Integer num;

    /**
     * 时长 分钟，单位
     */
    private String duration;

    /**
     * 封面图
     */
    private String coverImg;

    /**
     * 视频id
     */
    private Integer videoId;

    /**
     * 集概述
     */
    private String summary;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 章节主键id
     */
    private Integer chapterId;


}
