package com.termwork.customer.DTO;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonInclude;

public class ResultJson {
    @JSONField(name = "status")
    private int status;

    @JSONField(name = "message")
    private String message;

    @JSONField(name = "data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public ResultJson(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResultJson(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}