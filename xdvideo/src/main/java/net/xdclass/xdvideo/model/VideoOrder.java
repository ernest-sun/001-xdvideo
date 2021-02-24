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
@TableName("video_order")
public class VideoOrder implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户标示
     */
    private String openid;

    /**
     * 订单唯一标识
     */
    private String outTradeNo;

    /**
     * 0表示未支付，1表示已支付
     */
    private Integer state;

    /**
     * 订单生成时间
     */
    private Date createTime;

    /**
     * 支付回调时间
     */
    private Date notifyTime;

    /**
     * 支付金额，单位分
     */
    private Integer totalFee;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 微信头像
     */
    private String headImg;

    /**
     * 视频主键
     */
    private Integer videoId;

    /**
     * 视频名称
     */
    private String videoTitle;

    /**
     * 视频图片
     */
    private String videoImg;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户ip地址
     */
    private String ip;

    /**
     * 0表示未删除，1表示已经删除
     */
    private Integer del;


}
