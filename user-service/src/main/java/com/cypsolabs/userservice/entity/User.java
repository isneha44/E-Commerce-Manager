package com.cypsolabs.userservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(value = "tbl_user")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String contact;
    private String email;
    private String username;
    private String password;
}
