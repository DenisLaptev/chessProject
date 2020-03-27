package com.nx.taskAboutStatic;

import java.util.Map;

public class A {

    public static void main(String[] args) {

        Map<String,Long> params = B.createUserParameter(1L);

        new B().showUser(params);
    }
}
