package com.feng.mapper;

import com.feng.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lastfeng
 * @since 2022-02-13
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
