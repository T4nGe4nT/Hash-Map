package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Ex 1
        HashMap<String, String> map = new HashMap<>();

        map.put("matthew", "matt");
        map.put("michael", "mix");
        map.put("arthur", "artie");

        System.out.println(map.get("matthew"));

    }
}