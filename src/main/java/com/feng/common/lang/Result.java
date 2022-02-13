package com.feng.common.lang;

import lombok.Data;

/**
 * @Author lastfeng
 * @Date 2022/2/13 22:45
 * @Description TODO
 * @Version 1.0
 **/
@Data
public class Result {

    private int code; // 200是正常,非200表示异常
    private String msg;
    private Object data;

    public static Result succ(int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail(String msg,Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

}
