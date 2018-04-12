package com.lk1314.webservice;

import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * @Author: william
 * @Date: 2018/4/11 16:18
 */

@Component("JobService")
@WebService
public class JobServiceImpl implements JobService {

    public String getJob() {
        return "JEE研发工程师|Android研发工程师|数据库工程师|前端工程师|测试工程师|运维工程师";
    }
}

