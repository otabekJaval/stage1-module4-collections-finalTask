package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {


        Map<Integer, Set<String>> res = new HashMap<>();

        for (Map.Entry<String, Integer> stringIntegerEntry : sourceMap.entrySet()) {

            Integer length = stringIntegerEntry.getKey().length();

            if (!res.containsKey(length)) {

                Set<String> ans = sourceMap.keySet().stream()
                      .filter(integer -> integer.length() == length)
                      .collect(Collectors.toSet());

                if (!ans.isEmpty())
                    res.put(length, ans);

            }
        }


        return  res;
    }
}
