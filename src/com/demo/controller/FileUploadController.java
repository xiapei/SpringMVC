package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/8/7 10:27
 * 文件上传测试类
 */
@Controller
public class FileUploadController {

    @Value("${filePath}")
    private String basePath;

    @RequestMapping("/upload")
    public String upload(@RequestParam(value = "filePath") MultipartFile filePath, Model model){

        try {
            filePath.transferTo(new File(basePath+filePath.getOriginalFilename()));
            model.addAttribute("msg","文件上传成功");
        } catch (IOException e) {
            model.addAttribute("msg","文件上传失败");
            e.printStackTrace();
        }
        return "upload";
    }
}
