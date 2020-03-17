package com.murray.websocketmurray.untils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 工具类
 * @author: Murray Law
 * @Date:2020/3/11 17:51
 */

public class Untils {
    public static Map objectToMap(Object obj) {
        if (obj == null) {
            return null;
        }

        Map<String, Object> map = new HashMap<>();
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                map.put(field.getName(), field.get(obj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
