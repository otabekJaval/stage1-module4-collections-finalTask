package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {


        List<String> res =
                projects.entrySet().stream()
                        .filter(prj -> prj.getValue().contains(developer))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList());


        Comparator<String> comparator = (o1, o2) -> {
            int res1 = o2.length() - o1.length();

            if (res1 == 0) {
                res1 = o2.compareTo(o1);
            }

            return res1;
        };

        res.sort(comparator);


        return res;

    }
}
