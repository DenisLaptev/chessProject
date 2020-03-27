package com.nx.taskAboutStatic2;

import java.util.HashMap;
import java.util.Map;

public class B {

    public static String USER_ID = "someParam";

    Map<String, Long> params = new HashMap<>();

    {
        params.put(USER_ID, 1L);
    }

    public void showUser(Map<String, Long> params) {
        System.out.println("Hello! params=" + params);
    }
}
