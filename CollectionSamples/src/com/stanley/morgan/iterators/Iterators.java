/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanley.morgan.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author test
 */
public class Iterators {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ichi");
        list.add("ni");
        list.add("san");
        list.add("yon");
        list.add("go");
        list.add("roku");
        list.add("nana");
        list.add("hachi");
        list.add("kyu");
        list.add("ju");
        //list.add(1);
        //list.add(2);
        //list.set(4,"saran");
     /*   list.add("ichi");

        //traversing list elements using iterators
        Iterator iter = list.iterator();
        int i = 1;
        System.out.println("ArrayList:");
        while (iter.hasNext()) {
            System.out.println(i + "-->" + iter.next());
            i++;
        }

        // creating priorityqueue with list objects
        Queue<String> queue = new PriorityQueue<>(list);

        //traversing queue elements using iterator
        Iterator iter1 = queue.iterator();
        int j = 1;
        System.out.println("Priority Queue:");
        while (iter1.hasNext()) {
                                                                                                                                                                  System.out.println(j + "-->" + iter1.next());
            j++;
        }

        Set set = new HashSet(list);
        //System.out.println(queue.peek());
        Iterator iter2 = set.iterator();
        int k = 1;
        while (iter2.hasNext()) {
            System.out.println(k + "-->" + iter2.next());
            k++;
        }
        //ListIterator*/
       // ListIterator listiter = list.listIterator(3);
        //int a = 1;
      /*  while (listiter.hasNext()) {
            System.out.println((listiter.nextIndex()+1)+ "==>" + listiter.next());
           // a++;
         //  listiter.next();
           listiter.set("modified");
        }
        System.out.println(list);*/
        //traversing queue and set using list iterator
      //  ListIterator l1 = queue.listIterator();
        //ListIterator l2=set.listIterator();
       // int t=list.size();
      // ListIterator listiter =list.listIterator();
       /* while(listiter.hasPrevious())
        {
                 System.out.println((listiter.previousIndex()+1)+" +++++ "+listiter.previous());
                // t--;
        }
       Iterator iter = list.iterator();
       while(iter.hasNext())
       {
           iter.next();
           iter.remove();
       }
       System.out.println(list);*/
       
       /*for(int i=0;i<list.size();i++)
       {
           Object  s=list.get(i);
           System.out.println(i+"``````"+s);
       }*/
       ListIterator li = list.listIterator();
       int count=0;
       while(list.size()>count)
       {
           System.out.println(list.get(count));
           count++;
       }
    }
}
