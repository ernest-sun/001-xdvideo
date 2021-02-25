package net.xdclass.xdvideo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.xdclass.xdvideo.dto.SaveVideoDto;
import net.xdclass.xdvideo.model.Video;
import net.xdclass.xdvideo.service.VideoService;
import net.xdclass.xdvideo.util.JsonData;
import net.xdclass.xdvideo.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/video")
@Api(tags = "视频管理模块", value = "视频管理信息")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @ApiOperation("查询视频列表")
    @GetMapping("/list")
    public JsonData list() {
        List<Video> videoList = videoService.findAll();
        return JsonData.buildSuccess(videoList);
    }


    @ApiOperation("分页查询视频列表")
    @PostMapping(value = "/search/{page}/{size}")
    public JsonData findByPage(
            @ApiParam(name = "page", value = "当前页码", example = "1")
            @PathVariable Integer page,
            @ApiParam(name = "size", value = "每页显示的页数", example = "3")
            @PathVariable Integer size,
            @ApiParam(name = "map", value = "分页的条件", example = "")
            @RequestBody Map<String, Object> map) {
        Page<Video> videoPage = videoService.findByPage(map, page, size);

        PageResult<Video> pageResult = new PageResult<>(videoPage.getTotal(), videoPage.getRecords());

        return JsonData.buildSuccess(pageResult);

    }

    @ApiOperation("根据id查询视频")
    @GetMapping(value = "/{videoId}")
    public JsonData findById(
            @ApiParam(name = "videoId", value = "视频id", example = "1")
            @PathVariable int videoId) {

        Video video = videoService.findById(videoId);
        return JsonData.buildSuccess(video);
    }

    @ApiOperation("新增视频")
    @PostMapping("/save")
    public JsonData save(@RequestBody SaveVideoDto saveVideoDto) {

        int rows = videoService.save(saveVideoDto);

        return rows == 1 ? JsonData.buildSuccess() : JsonData.buildError("添加失败，请重试！");
    }

    @ApiOperation("根据Id删除视频")
    @DeleteMapping("/delete/{videoId}")
    public JsonData delById(
            @ApiParam(name = "videoId", value = "视频id", example = "1")
            @PathVariable int videoId) {
        videoService.deleteById(videoId);

        return JsonData.buildSuccess();
    }

    @ApiOperation("根据视频id修改视频")
    @PutMapping(value = "/update/{videoId}")
    public JsonData update(
            @ApiParam(name = "videoId", value = "视频id", example = "1")
            @PathVariable int videoId,
            @ApiParam(name = "video", value = "视频对象", example = "")
            @RequestBody Video video) {
        video.setId(videoId);
        int rows = videoService.updateById(video);
        return rows == 1 ? JsonData.buildSuccess() : JsonData.buildError("修改失败");
    }
}