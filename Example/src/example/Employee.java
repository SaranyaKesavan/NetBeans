/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author test
 */
public class Employee {
    private int eid;
    private String name;
    private String desi;
    private double salary;
    
       /*Employee(int eid,String name,String desi,double salary)
       {
           this.eid=eid;
           this.name=name;
           this.desi=desi;
           this.salary=salary;
       }
       Employee()
       {
           System.out.println(eid+name+desi+salary);
       }*/
        void display()
       {
           System.out.println(eid+" "+name+" "+desi+" "+salary);
       }
    /**
     * @return the eid
     */
    public int getEid() {
        return eid;
    }

    /**
     * @param eid the eid to set
     */
    public void setEid(int eid) {
        this.eid = eid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the desi
     */
    public String getDesi() {
        return desi;
    }

    /**
     * @param desi the desi to set
     */
    public void setDesi(String desi) {
        this.desi = desi;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
