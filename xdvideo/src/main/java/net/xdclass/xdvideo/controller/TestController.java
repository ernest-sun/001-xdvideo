package net.xdclass.xdvideo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.xdclass.xdvideo.config.WeChatConfig;
import net.xdclass.xdvideo.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/video")
@Api(tags = "视频管理模块", value = "视频管理信息")
public class TestController {

	@Autowired
	private WeChatConfig weChatConfig;

/*	@ApiOperation("测试配置文件")
	@GetMapping("/test_config")
	public String testConfig(){
		System.out.println("wxappid=" + weChatConfig.getAppId());
		return "hello xdclass.net";
	}*/

}
