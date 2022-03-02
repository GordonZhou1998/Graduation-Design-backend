package com.neusoft.zywlzl.controller;

import com.neusoft.zywlzl.model.CnMedInfo;
import com.neusoft.zywlzl.model.CnMedInfoCategory;
import com.neusoft.zywlzl.model.Comment;
import com.neusoft.zywlzl.service.CnMedInfoCategoryService;
import com.neusoft.zywlzl.service.CnMedInfoService;
import com.neusoft.zywlzl.service.CommentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    @PostMapping("/comment/searchbyid")
    public Comment searchById(int id) {
        CommentService commentService = new CommentService();
        return commentService.selectByPrimaryKey(id);
    }

    @PostMapping("/comment/insert")
    public int insert(Comment comment) {
        CommentService commentService = new CommentService();
        return commentService.insert(comment);
    }

    @PostMapping("/comment/delete")
    public int delete(int id) {
        CommentService commentService = new CommentService();
        return commentService.deleteByPrimaryKey(id);
    }

    @PostMapping("/comment/update")
    public int update(Comment comment) {
        CommentService commentService = new CommentService();
        return commentService.updateByPrimaryKey(comment);
    }
}
