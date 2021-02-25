package net.xdclass.xdvideo.service;

import net.xdclass.xdvideo.dto.VideoOrderDto;
import net.xdclass.xdvideo.model.VideoOrder;

/**
 * 订单接口
 */
public interface VideoOrderService {

    /**
     * 下单接口
     * @param videoOrderDto
     * @return
     */
    VideoOrder save(VideoOrderDto videoOrderDto);

}
