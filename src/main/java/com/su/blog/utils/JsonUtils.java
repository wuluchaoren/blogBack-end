package com.su.blog.utils;

import com.su.blog.exception.MyException;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Description:
 *
 * @Author: Tianyu Su
 * @Date: 2019/1/30
 */
public class JsonUtils {

    /**
     * Description: String格式转Timestamp
     *
     * @Author: Tianyu Su
     * @Time: 2019/1/30
     */
    public static Timestamp StringToTimestamp(String s) throws MyException {
        try {
            return Timestamp.valueOf(s);
        }catch (Exception e){
            throw new MyException("转Timestamp错误！字符串的格式必须形如：yyyy-mm-dd hh:mm:ss",MyException.ERROR);
        }
    }

//    /**
//     * Description: Timestamp格式转String
//     *
//     * @Author: Tianyu Su
//     * @Time: 2019/1/30
//     */
//    public static String TimestampToString(Timestamp ts) {
//        DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        return sdf.format(ts);
//    }
}
