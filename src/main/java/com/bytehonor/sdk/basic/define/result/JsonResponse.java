package com.bytehonor.sdk.basic.define.result;

import java.util.ArrayList;
import java.util.List;

/**
 * Standard Json Response
 * 
 * @author lijianqiang
 *
 * @param <T>
 */
public final class JsonResponse<T> {

    private Integer code;

    private String message;

    private List<String> trace = new ArrayList<String>();

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<String> getTrace() {
        return trace;
    }

    public void setTrace(List<String> trace) {
        this.trace = trace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[code:").append(this.code).append(", message:").append(this.message).append("]");
        return sb.toString();
    }

}
