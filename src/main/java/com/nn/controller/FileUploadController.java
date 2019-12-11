package com.nn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
public class FileUploadController {

    @RequestMapping("upload")
    public String upload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) throws IOException {
        System.out.println("文件描述:"+ desc);

        // 获取到 文件输入流
        InputStream inputStream = file.getInputStream();
        String originalFilename = file.getOriginalFilename(); // 获取 上传文件的原始 名称
        OutputStream outputStream = new FileOutputStream("F:\\"+originalFilename);
        byte[] buff = new byte[1024];
        int len = -1;
        while ((len = inputStream.read(buff))!=-1){
            outputStream.write(buff,0,len);
        }
        inputStream.close();
        outputStream.close();

        System.out.println("上传成功");

        return "success";
    }
}
