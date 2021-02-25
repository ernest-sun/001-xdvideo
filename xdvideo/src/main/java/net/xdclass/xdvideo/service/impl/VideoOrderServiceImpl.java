package net.xdclass.xdvideo.service.impl;

import net.xdclass.xdvideo.dto.VideoOrderDto;
import net.xdclass.xdvideo.mapper.UserMapper;
import net.xdclass.xdvideo.mapper.VideoMapper;
import net.xdclass.xdvideo.mapper.VideoOrderMapper;
import net.xdclass.xdvideo.model.User;
import net.xdclass.xdvideo.model.Video;
import net.xdclass.xdvideo.model.VideoOrder;
import net.xdclass.xdvideo.service.VideoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoOrderServiceImpl implements VideoOrderService {

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private VideoOrderMapper videoOrderMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public VideoOrder save(VideoOrderDto videoOrderDto) {
        //查找视频信息
        Video video =  videoMapper.selectById(videoOrderDto.getVideoId());

        //查找用户信息
        User user = userMapper.selectById(videoOrderDto.getUserId());


        //生成订单


        //生成签名


        //统一下单


        //获取codeurl


        //生成二维码



        return null;
    }
}
