package com.sunyard.emp.utils;

import com.sunyard.emp.entity.UserInfo;

import java.util.HashMap;
import java.util.Map;

public class TokenMap {
    private static Map<String, UserInfo> tokenMap = new HashMap<>();

    public static UserInfo getUser(String token) {
        return tokenMap.get(token);
    }

    public static void setUser(String token, UserInfo userInfo) {
        tokenMap.put(token, userInfo);
    }

    public static void deleteUser(String token) {
        tokenMap.put(token, null);
    }
}
