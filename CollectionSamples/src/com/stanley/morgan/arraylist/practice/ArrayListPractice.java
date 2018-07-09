/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanley.morgan.arraylist.practice;

import java.util.ArrayList;

/**
 *
 * @author test
 */
public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        System.out.println(obj.size());
        //removing ele at index 0
        obj.remove(0);
        System.out.println(obj.size());
        obj.add(null);
        obj.add(null);
        obj.add(null);
        obj.add(null);
        obj.add(null);
        obj.add(10);
        System.out.println(obj);
        obj.set(3, 100);
        obj.add(5, 111);
        System.out.println(obj);
        System.out.println(obj.indexOf(null));

    }

}
