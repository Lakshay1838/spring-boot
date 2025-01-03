package com.example.practice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Data
@Document(collection = "user_data")
public class User {
//    account
//    name
//    phone
//    idtype
//    idvalue
//    acctype

    @Id
    private Long id;
    private String name;
    private String phone;
//    private String idType;
//    private Long idValue;
//    private String accountType;
}
