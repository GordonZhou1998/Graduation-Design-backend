package com.neusoft.zywlzl.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Integer commentId;

    private String commentDetail;

    private LocalDateTime commentTime;
}