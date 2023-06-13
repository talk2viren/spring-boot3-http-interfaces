package com.example.springheader.service;

import com.example.springheader.model.Post;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface JsonPlaceholderService {

    @GetExchange("/posts")
    List<Post> findAll();
}
