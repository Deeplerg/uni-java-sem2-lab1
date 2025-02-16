package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> list = new ArrayList<Post>();
        list.add(new Post("Random post 1", new Date(2024, 10, 15, 14, 00)));
        list.add(new Post("Random post 2", new Date(2024, 10, 15, 15, 17)));
        list.add(new Post("Random post 3", new Date(2024, 11, 12, 17, 35)));
        return list;
    }
}
