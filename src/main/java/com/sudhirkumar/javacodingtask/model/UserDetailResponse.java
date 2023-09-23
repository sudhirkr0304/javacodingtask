package com.sudhirkumar.javacodingtask.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailResponse {

    String name;


    String email;

    String username;

    Role role;
}
