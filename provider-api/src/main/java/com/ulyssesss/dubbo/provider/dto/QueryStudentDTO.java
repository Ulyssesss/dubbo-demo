package com.ulyssesss.dubbo.provider.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryStudentDTO implements Serializable {

    private Integer id;
    private String name;
}
