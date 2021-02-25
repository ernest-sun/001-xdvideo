package net.xdclass.xdvideo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import net.xdclass.xdvideo.dto.SaveVideoDto;
import net.xdclass.xdvideo.mapper.VideoMapper;
import net.xdclass.xdvideo.model.Video;
import net.xdclass.xdvideo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:VideoServiceImpl
 * Package:net.xdclass.xdvideo.service.impl
 * Description:
 *
 * @Date:2021/2/23 17:00
 * @Author:sunzheng@bmrj.com
 */
@Service
@Slf4j
@SuppressWarnings("all")
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {
        return videoMapper.selectList(null);
    }

    @Override
    public Video findById(int id) {
        return videoMapper.selectById(id);
    }

    @Override
    public int updateById(Video video) {
        return videoMapper.updateById(video);
    }

    @Override
    public int save(SaveVideoDto saveVideoDto) {
        Video video = paseToVideo(saveVideoDto);
        if (video != null) {
            videoMapper.insert(video);
        }else {
            return -1;
        }
        return videoMapper.insert(video);
    }

    private Video paseToVideo(SaveVideoDto saveVideoDto) {
        if (saveVideoDto.getCoverImg() != null && saveVideoDto.getPrice() != null && saveVideoDto.getTitle() != null) {
            Video video = new Video();
            video.setCoverImg(saveVideoDto.getCoverImg());
            video.setOnline(saveVideoDto.getOnline());
            video.setPoint(saveVideoDto.getPoint());
            video.setPrice(saveVideoDto.getPrice());
            video.setSummary(saveVideoDto.getSummary());
            video.setTitle(saveVideoDto.getTitle());
            video.setViewNum(saveVideoDto.getViewNum());
            return video;
        }else {
            return null;
        }
    }

    @Override
    public int deleteById(int id) {
        QueryWrapper<Video> qw = new QueryWrapper<>();
        qw.eq("id", id);
        return videoMapper.delete(qw);
    }

    public Page<Video> findByPage(Map<String, Object> map, Integer page, Integer size) {
        QueryWrapper<Video> qw = new QueryWrapper<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            qw.eq(map.get(key) != null, key, map.get(key));

        }

        Page<Video> videoPage = new Page<>(page, size);

        IPage<Video> iPage = videoMapper.selectPage(videoPage, qw);

        List<Video> list = iPage.getRecords();

        videoPage.setRecords(list);

        return videoPage;

    }
}