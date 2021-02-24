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
@TableName("comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 内容
     */
    private String content;

    private Integer userId;

    /**
     * 用户头像
     */
    private String headImg;

    /**
     * 昵称
     */
    private String name;

    /**
     * 评分，10分满分
     */
    private Double point;

    /**
     * 点赞数
     */
    private Integer up;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 视频id
     */
    private Integer videoId;


}
