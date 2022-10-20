package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {


        Set<String>res=new HashSet<>();

        for (Map.Entry<String, List<String>> stringListEntry : timetable.entrySet()) {

            if(stringListEntry.getValue().isEmpty())continue;
            List<String> value = stringListEntry.getValue();
            res.addAll(value);
            res.add(value.get(0));
        }

        return res;
    }
}
