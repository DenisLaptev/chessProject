package com.nx.taskAboutStatic;

import java.util.HashMap;
import java.util.Map;

import static com.nx.taskAboutStatic.B.USER_ID;

public class A {

    public static void main(String[] args) {

        Map<String,Long> params = new HashMap<>();

        params.put(USER_ID, 1L);

        new B().showUser(params);
    }
}
