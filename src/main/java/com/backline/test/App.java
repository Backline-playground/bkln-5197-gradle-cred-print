package com.backline.test;

import org.apache.commons.text.StringSubstitutor;
import java.util.Map;

public class App {
    public static String greet(String name) {
        return new StringSubstitutor(Map.of("name", name)).replace("Hello, ${name}!");
    }
}
