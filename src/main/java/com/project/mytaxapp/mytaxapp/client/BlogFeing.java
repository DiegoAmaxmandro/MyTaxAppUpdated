package com.project.mytaxapp.mytaxapp.client;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.mytaxapp.mytaxapp.dto.ResponsePost;

@FeignClient(value = "blog", url = "http://localhost:8082/blog/getPosts")
public interface BlogFeing {

@GetMapping
ResponseEntity<List<ResponsePost>> getPosts();