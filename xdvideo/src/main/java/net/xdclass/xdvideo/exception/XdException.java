package net.xdclass.xdvideo.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ClassName:XdException
 * Package:net.xdclass.xdvideo.exception
 * Description:自定义异常类
 *
 * @Date:2021/2/25 13:41
 * @Author:sunzheng@bmrj.com
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class XdException extends RuntimeException {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 异常消息
     */
    private String msg;

    public XdException() {
        super();
    }

    public XdException(String message, Integer code, String msg) {
        super(message);
        this.code = code;
        this.msg = msg;
    }
}
