package com.doj.doj.model.dto.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterDTO implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
