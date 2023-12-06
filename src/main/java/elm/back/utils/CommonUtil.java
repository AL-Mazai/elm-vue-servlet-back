package elm.back.utils;


import java.sql.Date;

public class CommonUtil {

    // 字符串处理
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // 日期处理
    public static Date getCurrentDate() {
        long currentTimeMillis = System.currentTimeMillis();
        return new Date(currentTimeMillis);
    }

    // 数学计算
    public static int add(int a, int b) {
        return a + b;
    }
}
