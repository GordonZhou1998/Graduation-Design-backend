package com.neusoft.zywlzl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
    private Integer hospitalId;

    private String hospitalName;

    private String hospitalDetail;

    private String hospitalPhone;
}