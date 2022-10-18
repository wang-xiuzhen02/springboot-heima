package com.wxz.heima.controller;


import com.wxz.heima.entity.Test;
import com.wxz.heima.entity.User;
import com.wxz.heima.service.TestService;
import com.wxz.heima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
//@CrossOrigin    //允许跨域
public class   TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private TestService testService;

    private static final String UPLOADED_FOLDER  = System.getProperty("user.dir")+"/upload/";

    @RequestMapping (value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello wxz....";
    }

    @RequestMapping (value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(@RequestParam("username") String username){
        return "hello "+username;
    }
    /**
     * json requestbody
     *
     * resultful风格
     * post     /user           @ResponseBody
     * put      /user
     * get      /user/id        @PathVariable
     * delete    /user/id
     *
     * Swagger
     */



//    上传文件
    @RequestMapping(value = "file",method = RequestMethod.POST)
    public String upload(MultipartFile file){
        System.out.println(file.getName());
        return "success";
    }

//    修改文件
    @RequestMapping(value = "file",method = RequestMethod.PUT)
    public void saveFile(MultipartFile file) throws IOException {
        File upDir = new File(UPLOADED_FOLDER);
        if(upDir.exists()){
            upDir.mkdir();
        }
        File f = new File(UPLOADED_FOLDER + file.getOriginalFilename());
        file.transferTo(f);
    }

//    获取所有user的信息和他的tests
    @GetMapping("/user")
    public List<User> getAllUserAndTest(){
        List<User> userList = userService.getUserAndTest();
        return userList;
    }

//    查询所有test和他的user
    @GetMapping("/test")
    public List<Test> getAllTestAndUser(){
        List<Test> testList = testService.getTestAndUser();
        return testList;
    }

    @RequestMapping("testGit")
    public String testGit(){
        return "test git";
    }

    @RequestMapping("testGithotFix")
    public String testGithotFix(){
        System.out.println("push test");
        return "test git master....hotFix";
    }



}
