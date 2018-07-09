/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stanley.morgan.userdefinedgenericclass;

/**
 *
 * @author test
 */
class Saranya<S>
{
    S saran;
    Saranya(S saran)
    {
        this.saran=saran;
    }
    public S getObject()
    {
        return this.saran;
    }
}
public class UserDefinedGenericClass {
    
    public static void main(String []args)
    {
        Saranya <String> obj= new Saranya <> ("saranya");
        System.out.println(obj.getObject());
        
        Saranya <Integer> obj1=new Saranya <> (7);
        System.out.println(obj1.getObject());
        
    }
    
}
