package com.ignatev;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String,String> mma = new HashMap<>();

    }

    public static void createHistogram(String s) {
        s.replaceAll("\n", "");
        s.trim();
        TreeMap<Character, Integer> map = new TreeMap<>();

        map.entrySet().iterator().next().getKey();

        s.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> {
                    if (map.keySet().contains(c))
                        map.put(c, map.get(c) + 1);
                    else map.put(c, 1);
                });

        System.out.println(map);
    }
}
