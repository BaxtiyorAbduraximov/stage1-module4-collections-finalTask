package com.epam.mjc.collections.combined;

import java.util.*;


public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> createMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getKey().length();
            createMap.computeIfAbsent(value, k -> new HashSet<>()).add(key);
        }
        return createMap;
    }
}
