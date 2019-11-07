package com.lannis.mybatisplus.controller;

import com.lannis.mybatisplus.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackgeName: com.lannis.mybatisplus.controller
 * @ClassName: TestController
 * @Author: Lannis
 * Date: 2019-11-07 10:30
 * project name: mybatisplus
 * @Version:
 * @Description: Test控制层
 */
@RestController
public class TestController {
    //原始写法，但是在Idea中不推荐，换成下面的写法
    @Autowired
    private ITestService testService;

//    private ITestService testService;
//
//    @Autowired
//    private TestController(ITestService testService) {
//        this.testService = testService;
//    }

    @RequestMapping("/test")
    public String sayHelloWorld() {
        return testService.list().toString();
    }
}
