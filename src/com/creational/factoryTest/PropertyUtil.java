package com.creational.factoryTest;

import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
    public static Object getBean() {
        Properties prop = new Properties();
        String name = null;
        Object factory = null;

        try {
            prop.load(PropertyUtil.class.getClassLoader().getResourceAsStream("com/factoryTest/config.properties"));
            name = prop.getProperty("className");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Class<?> clz = Class.forName(name);
            factory = clz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }
}
