package com.ulyssesss.dubbo.provider.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentVO implements Serializable {

    private Integer id;
    private String name;
    private List<String> hobbies;
}
