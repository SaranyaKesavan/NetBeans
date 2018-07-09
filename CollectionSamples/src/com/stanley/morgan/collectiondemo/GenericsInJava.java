/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanley.morgan.collectiondemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author test
 */
public class GenericsInJava{
    public static void main(String[] args)
    {
        List<Object> list = new ArrayList<>();
        list.add("java");
        list.add(4);
        for(Object s : list)
        {
            System.out.println(s);
        }
        
    }
}
