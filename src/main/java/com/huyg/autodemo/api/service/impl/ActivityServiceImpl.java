package com.huyg.autodemo.api.service.impl;

import com.huyg.autodemo.api.entity.Activity;
import com.huyg.autodemo.api.mapper.ActivityMapper;
import com.huyg.autodemo.api.service.IActivityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huyg
 * @since 2020-11-02
 */
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements IActivityService {

}
