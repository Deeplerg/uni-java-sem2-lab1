package com.example.demo.service;

import com.example.demo.model.Post;
import com.sun.source.tree.ArrayAccessTree;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {
    private List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        posts.add(new Post(0L, "Random post 1", new Date(2024, 10, 15, 14, 00)));
        posts.add(new Post(1L, "Random post 2", new Date(2024, 10, 15, 15, 17)));
        posts.add(new Post(2L, "Random post 3", new Date(2024, 11, 12, 17, 35)));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        Long maxId = posts.getLast().getId(); // won't work properly if we remove posts

        var post = new Post(maxId + 1, text, new Date());
        posts.add(post);
    }
}
