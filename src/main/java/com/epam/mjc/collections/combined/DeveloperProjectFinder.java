package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> find = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()){
            String key = entry.getKey();
            Set<String> value = entry.getValue();

            if(value.contains(developer)){
                find.add(key);
            }
        }

        find.sort(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.reverseOrder()));

        return find;
    }
}
