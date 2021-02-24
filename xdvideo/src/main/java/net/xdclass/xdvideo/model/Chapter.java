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
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@TableName("chapter")
public class Chapter implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 视频主键
     */
    private Integer videoId;

    /**
     * 章节名称
     */
    private String title;

    /**
     * 章节顺序
     */
    private Integer ordered;

    /**
     * 创建时间
     */
    private Date createTime;


}
