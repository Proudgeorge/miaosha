package com.miaoshaproject.error;

/**
 * @author simba@onlying.cn
 * @date 2019/7/4 23:08
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
