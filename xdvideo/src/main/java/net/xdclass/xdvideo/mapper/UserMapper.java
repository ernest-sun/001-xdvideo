package net.xdclass.xdvideo.mapper;

import net.xdclass.xdvideo.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 光影
 * @since 2021-02-23
 */
public interface UserMapper extends BaseMapper<User> {

    User findByopenid(@Param("openid") String openid);

}
