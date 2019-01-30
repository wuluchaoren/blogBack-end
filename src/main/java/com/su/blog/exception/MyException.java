package com.su.blog.exception;

/**
 * Description: 自定义错误类型
 *
 * @Author: Tianyu Su
 * @Date: 2019/1/30
 */

public class MyException extends Exception {
    /**
     * 不知名错误
     */
    public static final Integer ERROR = 400;

    /**
     * id格式错误
     */
    public static final Integer ID_FORMAT_ERROR = 401;
    /**
     * 需要权限错误
     */
    public static final Integer AUTHORIZATION_ERROR = 403;
    /**
     * 资源没找到错误
     */
    public static final Integer NOT_FOUND_ERROR = 404;

    private int stateCode;

    private Object object;

    public MyException(String info, int stateCode) {
        super(info);
        this.stateCode = stateCode;
    }

    public int getStateCode() {
        return stateCode;
    }
    public Object getObject() {
        return object;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
