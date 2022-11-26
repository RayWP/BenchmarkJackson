package com.example.benchmarkjackson.data;

import com.example.benchmarkjackson.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public class DataList {
    public static List<Entity> entityList = new ArrayList<>();

    static {
        for(int i=0; i<10000; i++) {
            entityList.add(new Entity("1",1,true));
        }
    }
}
