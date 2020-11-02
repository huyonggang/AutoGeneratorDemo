package com.huyg.autodemo.api.service.impl;

import com.huyg.autodemo.api.entity.Expert;
import com.huyg.autodemo.api.mapper.ExpertMapper;
import com.huyg.autodemo.api.service.IExpertService;
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
public class ExpertServiceImpl extends ServiceImpl<ExpertMapper, Expert> implements IExpertService {

}
