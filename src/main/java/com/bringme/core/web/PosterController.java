package com.bringme.core.web;

import com.bringme.core.dao.PosterMapper;
import com.bringme.core.dto.Poster;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("poster")
public class PosterController {

    @Autowired
    private PosterMapper posterMapper;

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping(value = "/{id}", method = GET)
    public Poster home(@PathVariable String id) {
        return posterMapper.findById(id);
    }
}