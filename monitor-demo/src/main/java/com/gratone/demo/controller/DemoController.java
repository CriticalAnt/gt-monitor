package com.gratone.demo.controller;

import com.gratone.bean.DemoInfo;
import com.gratone.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wts on 2018/10/24.
 */

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("demoInfoList")
    public ResponseEntity<List<DemoInfo>> demoInfoList() {
        List<DemoInfo> demoInfoList = demoService.demoInfoList();
        System.out.println("调用成功！");
        return ResponseEntity.ok(demoInfoList);
    }
}