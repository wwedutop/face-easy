package com.face.bean.result;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author tanyongpeng
 * <p>des</p>
 **/
@Data
public class FaceResult {

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 状态码
     */
    private int code;

    /**
     * 验证人姓名
     */
    private String name;

    /**
     * 返回token
     */
    private String token;

    /**
     * 相似度
     */
    private Float score;

    public static final Integer SUCCESS_CODE = 200;
    public static final Integer SATISFY_SCORE = 80;
    public static final Integer FACE_ERROR = -1;
    public static final Integer NOT_FOUND_FACE = -2;
    public static final Integer NULL_ERROR = -3;
    public static final Integer FORBIDDEN_FACE = -4;


    public FaceResult setCode(int code) {
        this.code = code;
        return this;
    }

    public FaceResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public FaceResult setScore(Float score) {
        this.score = score;
        return this;
    }

    public static FaceResult error(int code, String msg){
        return new FaceResult().setCode(code).setMsg(msg);
    }

    public static FaceResult error(int code,String msg,Float score){
        return new FaceResult().setCode(code).setMsg(msg).setScore(score);
    }

    public static FaceResult error(int code){
        return new FaceResult().setCode(code);
    }
}