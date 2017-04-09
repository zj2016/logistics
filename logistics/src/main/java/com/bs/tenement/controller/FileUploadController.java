package com.bs.tenement.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bs.tenement.rest.RestResult;
import com.bs.tenement.utils.DateUtils;


@RestController
@RequestMapping("/upload")
public class FileUploadController {

	@RequestMapping
	public RestResult upload(@RequestParam("img") MultipartFile file, HttpServletRequest request){
		
		File folder = new File("/home/img");
		//File folder = new File("C://bs/img");
		if(!folder.exists()){
			folder.mkdirs();
		}
		
		Random random = new Random();
		String name = DateUtils.getNowDateTimeYMDHMS() + random.nextInt(1000);
		File img = null;
		System.out.println(file.getOriginalFilename());
		try {
			img = new File(folder + "/" + name + "." + file.getOriginalFilename().split("\\.")[1]);
			if(!img.exists()){
				img.createNewFile();
			}
			
			FileOutputStream fos = new FileOutputStream(img);
			fos.write(file.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(request.getScheme() + " " + request.getServerName() + " " + request.getServerPort() + " " + request.getContextPath());
		String imgURL = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/img/" + img.getName();
		return RestResult.success().setResponse(imgURL);
	}
	
}
