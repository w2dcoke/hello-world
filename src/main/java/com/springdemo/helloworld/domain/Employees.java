package com.springdemo.helloworld.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @TableName employees
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employees implements Serializable {
    /**
     * 
     */
    private Integer empNo;

    /**
     * 
     */
    private Date birthDate;

    /**
     * 
     */
    private String firstName;

    /**
     * 
     */
    private String lastName;

    /**
     * 
     */
    private Object gender;

    /**
     * 
     */
    private Date hireDate;

    private static final long serialVersionUID = 1L;
}