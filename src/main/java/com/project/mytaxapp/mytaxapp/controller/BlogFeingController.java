package com.project.mytaxapp.mytaxapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogFeingController {

	 @GetMapping("blog")
	 public List<ResponsePost> getBlogComment(){
	 return blogFeing.getPosts().getBody();
	 }
	
}
