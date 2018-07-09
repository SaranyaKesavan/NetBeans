/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanley.morgan.arraylist;

import java.util.ArrayList;

/**
 *
 * @author test
 */
public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());

        list.remove(0);
        System.out.println(list.size());
    }
}
