package com.huyg.autodemo.api.service.impl;

import com.huyg.autodemo.api.entity.Child;
import com.huyg.autodemo.api.mapper.ChildMapper;
import com.huyg.autodemo.api.service.IChildService;
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
public class ChildServiceImpl extends ServiceImpl<ChildMapper, Child> implements IChildService {

}
