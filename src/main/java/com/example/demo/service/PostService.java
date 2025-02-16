package com.example.demo.service;

import com.example.demo.model.Post;
import com.sun.source.tree.ArrayAccessTree;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        posts.add(new Post("Random post 1", new Date(2024, 10, 15, 14, 00)));
        posts.add(new Post("Random post 2", new Date(2024, 10, 15, 15, 17)));
        posts.add(new Post("Random post 3", new Date(2024, 11, 12, 17, 35)));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
