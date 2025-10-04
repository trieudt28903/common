package com.example.common_service.util;


public class StringUtils {

    // Kiểm tra chuỗi null hoặc rỗng sau khi trim
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Kiểm tra chuỗi không rỗng
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    // Viết hoa ký tự đầu
    public static String capitalize(String str) {
        if (isBlank(str)) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    // Viết thường ký tự đầu
    public static String uncapitalize(String str) {
        if (isBlank(str)) return str;
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    // Cắt chuỗi an toàn (nếu quá dài thì trim)
    public static String truncate(String str, int maxLength) {
        if (str == null) return null;
        return str.length() <= maxLength ? str : str.substring(0, maxLength);
    }

    // So sánh 2 chuỗi bỏ qua case
    public static boolean equalsIgnoreCase(String str1, String str2) {
        if (str1 == null && str2 == null) return true;
        if (str1 == null || str2 == null) return false;
        return str1.equalsIgnoreCase(str2);
    }

    // Thay thế null thành chuỗi mặc định
    public static String defaultIfNull(String str, String defaultStr) {
        return str == null ? defaultStr : str;
    }
}

