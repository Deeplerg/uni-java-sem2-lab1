package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> list = new ArrayList<Post>();
        list.add(new Post("Random post 1", 7));
        list.add(new Post("Random post 2", 9));
        list.add(new Post("Random post 3", 11));
        return list;
    }
}
