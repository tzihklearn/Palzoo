package com.sipc.loginserver.pojo.param;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SignInParam {
    private String code;

    public SignInParam() {

    }
}
