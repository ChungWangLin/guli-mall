package com.jones.common.pojo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    private Object data;
    private String code;
    private String message;

    public static Result success() {
        Result result = new Result();
        result.setCode("20000");
        result.setMessage("成功！");
        return result;
    }

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode("20000");
        result.setMessage("成功！");
        result.setData(data);
        return result;
    }

    public static Result failed(String message) {
        Result result = new Result();
        result.setCode("40000");
        result.setMessage(message);
        return result;
    }

    public static Result failed() {
        Result result = new Result();
        result.setCode("50000");
        return result;
    }
}
