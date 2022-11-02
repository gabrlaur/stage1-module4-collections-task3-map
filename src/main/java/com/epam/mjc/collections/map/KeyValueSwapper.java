package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();
        for (var entry : sourceMap.entrySet()) {
            if (!newMap.containsKey(entry.getValue())) {
                newMap.put(entry.getValue(), entry.getKey());
            }
        }
        return newMap;
    }
}
