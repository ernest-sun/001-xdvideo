package net.xdclass.xdvideo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import net.xdclass.xdvideo.mapper.VideoMapper;
import net.xdclass.xdvideo.model.User;
import net.xdclass.xdvideo.model.Video;
import net.xdclass.xdvideo.util.JwtUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class XdvideoApplicationTests {

	@Autowired
	private VideoMapper videoMapper;

	@Test
	void testPage() {
		QueryWrapper<Video> qw = new QueryWrapper<>();
		qw.eq("id", 4);

		Page<Video> page = new Page<>(1, 3);
		IPage<Video> iPage = videoMapper.selectPage(page, null);

		log.info("总条数:{}", iPage.getTotal());
		log.info("总页数:{}", iPage.getPages());
		log.info("数据:{}", iPage.getRecords());
	}

	@Test
	void testGeneJWT() {
		User user = new User();
		user.setId(999);
		user.setHeadImg("www.xdclass.net");
		user.setName("孙政");

		String token = JwtUtils.geneJsonWebToken(user);
		System.out.println(token);
	}

	@Test
	void testCheck() {
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ4ZGNsYXNzIiwiaWQiOjk5OSwibmFtZSI6IuWtmeaUvyIsImltZyI6Ind3dy54ZGNsYXNzLm5ldCIsImlhdCI6MTYxNDE1MTUzOSwiZXhwIjoxNjE0NzU2MzM5fQ.BLycbb5GmmYlYD9XzuH3ABYvI93YrFSaEcqQyVdOVmE";
		Claims claims = JwtUtils.checkJWT(token);

		if (claims != null) {
			Integer id = (Integer) claims.get("id");
			String img = (String) claims.get("img");
			String name = (String) claims.get("name");

			System.out.println(id + name + img);
		}
	}

}
