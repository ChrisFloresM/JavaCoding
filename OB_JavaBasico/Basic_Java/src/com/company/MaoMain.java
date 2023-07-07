package com.company;

import java.util.Map;
import java.util.HashMap;

public class MaoMain {
    public static void main(String[] args) {
        //Maps -> Work with key value pairs
        Map<String, String> robots = new HashMap<>();

        robots.put("robot1", "1");
        robots.put("robot2", "2");
        robots.put("robot3", "3");
        robots.put("robot4", "4");
        robots.put("robot5", "5");

        System.out.println(robots);

        for(String key : robots.keySet()){
            System.out.println(key + " : " + robots.get(key));

        }

    }
}
