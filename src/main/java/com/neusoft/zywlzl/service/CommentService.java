package com.neusoft.zywlzl.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.neusoft.zywlzl.model.Comment;
import com.neusoft.zywlzl.mapper.CommentMapper;

import java.util.List;

@Service
public class CommentService{

    @Resource
    private CommentMapper commentMapper;

    
    public int deleteByPrimaryKey(Integer commentId) {
        return commentMapper.deleteByPrimaryKey(commentId);
    }

    
    public int insert(Comment record) {
        return commentMapper.insert(record);
    }

    
    public int insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    
    public Comment selectByPrimaryKey(Integer commentId) {
        return commentMapper.selectByPrimaryKey(commentId);
    }

    
    public int updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Comment record) {
        return commentMapper.updateByPrimaryKey(record);
    }

    public List<Comment> selectAll() {  //查询所有评论
        return commentMapper.selectAll();
    }
}
