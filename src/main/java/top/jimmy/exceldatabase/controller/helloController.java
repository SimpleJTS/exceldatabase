package top.jimmy.exceldatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.jimmy.exceldatabase.service.uploadService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : jimmy
 * @Description:
 * @date : 2019/8/13 0013
 */
@Controller
@RequestMapping("/user")
public class helloController {

    @Autowired
    private uploadService uploadService;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam(value = "file",required = false)MultipartFile file ,
                         HttpServletRequest request, HttpServletResponse response){
        String result = uploadService.readExcleFile(file);
        return result;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
