package com.sjh.memories_back.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name="user")
@Table(name="user")
public class UserEntity {
    
    private String userId;
    private String userPassword;
    private String joinType;
    private String snsId;
    private String name;
    private String address;
    private String detailAdress;
    private String profileImage;
    private Integer age;
    
}
