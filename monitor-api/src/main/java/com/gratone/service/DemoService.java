package com.gratone.service;

import com.gratone.bean.DemoInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wts on 2018/10/24.
 */
@Service
public interface DemoService {
    public List<DemoInfo> demoInfoList();
}
