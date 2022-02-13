package com.feng.service.impl;

import com.feng.entity.Blog;
import com.feng.mapper.BlogMapper;
import com.feng.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lastfeng
 * @since 2022-02-13
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
