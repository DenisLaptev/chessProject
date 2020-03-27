package com.nx.taskAboutStatic;

import java.util.HashMap;
import java.util.Map;

public class B {

    public static String USER_ID = "someParam";

    public void showUser(Map<String,Long> params) {
        System.out.println("Hello! params=" + params);
    }
}
