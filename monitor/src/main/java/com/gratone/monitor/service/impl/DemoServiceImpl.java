package com.gratone.monitor.service.impl;

import com.gratone.monitor.bean.DemoInfo;
import com.gratone.monitor.mapper.DemoInfoMapper;
import com.gratone.monitor.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wts on 2018/10/24.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoInfoMapper demoInfoMapper;

    @Override
    public List<DemoInfo> demoInfoList() {
        return demoInfoMapper.selectAll();
    }
}
