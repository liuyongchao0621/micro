package com.shine.micro.model;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Role {

    private Long id;

    private String roleName;

    private String note;

}
