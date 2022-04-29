package com.springdemo.helloworld.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @TableName dept_emp
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptEmp implements Serializable {
    /**
     * 
     */
    private Integer empNo;

    /**
     * 
     */
    private String deptNo;

    /**
     * 
     */
    private Date fromDate;

    /**
     * 
     */
    private Date toDate;

    private static final long serialVersionUID = 1L;
}