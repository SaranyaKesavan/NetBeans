/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanley.morgan.arraylist2;

import java.util.ArrayList;

/**
 *
 * @author test
 */
public class ArrayList2 {
    
    public static void main(String []args)
    {
        ArrayList<Integer> list = new ArrayList<>(4);
        
        //adding elements to ArrayList
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(45);
        list.add(78);
        list.add(34);
        /*for(Integer s:list )
        {
            System.out.println(s);
        }*/
        list.trimToSize();
        System.out.println(list.size());
        list.add(100);
        System.out.println(list.size());
    }
}
