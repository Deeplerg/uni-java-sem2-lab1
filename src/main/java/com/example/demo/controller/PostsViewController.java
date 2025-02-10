package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostsViewController {
    @Autowired
    private final PostService postService;

    public PostsViewController(PostService postService) {
        this.postService = postService;
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("appName", "Моё супер приложение");
        mav.addObject("posts    ", postService.listAllPosts());
        return mav;
    }

    @ResponseBody
    @RequestMapping(path = "/post/{id}", method = RequestMethod.GET)
    public String single(@PathVariable("id") Long id) {
        return "Здесь будет страница поста №" + id;
    }
}
