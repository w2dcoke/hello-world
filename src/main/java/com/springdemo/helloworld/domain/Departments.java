package com.springdemo.helloworld.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @TableName departments
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Departments implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private String deptNo;
    /**
     *
     */
    private String deptName;
}