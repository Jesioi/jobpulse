package com.jesi.jobpulse.controller;

import com.jesi.jobpulse.entity.JobApplication;
import com.jesi.jobpulse.repository.JobApplicationRepository;
import org.springframework.web.bind.annotation.*; //导入Spring Web相关的注解和类

import java.util.List; //导入Java的List接口


@RestController
@RequestMapping("/applications")
public class JobApplicationController {

    private final JobApplicationRepository repo; //

    public JobApplicationController(JobApplicationRepository repo) { //constructor
        this.repo = repo;
    }

    @PostMapping //处理post请求，创建资源，出发一次“动作”
    public JobApplication create(@RequestBody JobApplication app) {
        // 新增时防止前端乱传 id
        app.setId(null);
        return repo.save(app);
    }

    @GetMapping //处理get请求，读取查询
    public List<JobApplication> list() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public JobApplication getById(@PathVariable long id){ ///处理get请求，读取查询
        //findById方法返回一个Optional对象，如果找到了对应的JobApplication，就返回它；
        // 如果没有找到，就抛出一个RuntimeException，提示找不到对应的JobApplication。
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Job application not found with id: " + id));

    }
}
