package net.xdclass.xdvideo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.xdclass.xdvideo.dto.SaveVideoDto;
import net.xdclass.xdvideo.model.Video;

import java.util.List;
import java.util.Map;

/**
 * ClassName:VideoService
 * Package:net.xdclass.xdvideo.service
 * Description:
 *
 * @Date:2021/2/23 16:59
 * @Author:sunzheng@bmrj.com
 */
public interface VideoService {

    List<Video> findAll();

    Video findById(int id);

    Page<Video> findByPage(Map<String, Object> map, Integer page, Integer size);

    int updateById(Video video);

    int deleteById(int id);

    int save(SaveVideoDto saveVideoDto);
}
