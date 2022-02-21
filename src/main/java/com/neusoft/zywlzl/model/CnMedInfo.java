package com.neusoft.zywlzl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CnMedInfo {
    private Integer medInfoId;

    private String medInfoTitle;

    private String medInfoDetail;

    private Integer medInfoCommentId;

    private String medInfoCommentDetail;

    private Integer medInfoCategoryId;
}