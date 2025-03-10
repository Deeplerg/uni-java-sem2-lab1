package com.example.demo.controller;

import com.example.demo.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LikesController {
    @Autowired
    private LikeService likeService;

    @ResponseBody
    @RequestMapping(path = "/post/{id}/like", method = RequestMethod.POST)
    public String like(@PathVariable("id") Long id) {
        int likes = likeService.like(id);
        return "" + likes;
    }
}
