package com.nx.taskAboutStatic;

import java.util.HashMap;
import java.util.Map;

public class B {

    private static String USER_ID = "userId";

    public static Map<String, Long> createUserParameter(Long userId) {

        Map<String, Long> param = new HashMap<>();
        param.put(USER_ID, userId);
        return param;
    }

    public void showUser(Map<String, Long> params) {

        System.out.println("Hello! params=" + params);
    }
}
