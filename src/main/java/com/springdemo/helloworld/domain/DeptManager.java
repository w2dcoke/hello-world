package com.springdemo.helloworld.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName dept_manager
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DeptManager implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer empNo;
    private String deptNo;
    private Date fromDate;
    private Date toDate;
}