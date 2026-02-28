package com.jesi.jobpulse.controller; //定义类所在的包

//倒入springweb相关的注解和类
//@RestController → 把类标记为 REST 控制器 == > 处理 HTTP 请求并返回响应
//  @RestController 是 @Controller 和 @ResponseBody 的组合注解，
//  表示该类中的方法返回的结果直接作为 HTTP 响应体，而不是视图名称。
//@GetMapping → 映射 HTTP GET 请求
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //因为有@RestController注解，所以这个类是一个REST控制器，可以处理HTTP请求并返回响应
public class HelloController {

    @GetMapping("/") // 这个注解表示当收到一个HTTP GET请求，路径为"/"时，调用home()方法
    //也可以写成，@RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "JobPulse is running";
    }
}

