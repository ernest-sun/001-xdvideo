package net.xdclass.xdvideo.exception;

import lombok.extern.slf4j.Slf4j;
import net.xdclass.xdvideo.util.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:XdExceptionHandler
 * Package:net.xdclass.xdvideo.exception
 * Description:异常处理控制器
 *
 * @Date:2021/2/25 13:58
 * @Author:sunzheng@bmrj.com
 */
@ControllerAdvice
@Slf4j
public class XdExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonData handler(Exception e) {

        log.info("[ 系统异常 ]{}", e.getMessage());

        if (e instanceof XdException) {
            XdException xdException = (XdException) e;
            return JsonData.buildError(xdException.getCode(), xdException.getMsg());
        }else {
            return JsonData.buildError("全局异常，未知错误");
        }
    }
}
