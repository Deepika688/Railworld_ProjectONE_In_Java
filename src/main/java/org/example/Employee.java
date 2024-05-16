package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int empid;
    private String empName;
    private String deign;

    private Bank bank;
    public Employee(){
        super();
    }

    public Employee(int empid, String empName, String deign, Bank bank) {
        super();
        this.empid = empid;
        this.empName = empName;
        this.deign = deign;
        this.bank = bank;
    }
      public String getEmpName(){
        return empName;
     }

     public void setEmpName(String empName){
        this.empName = empName;
     }

     public  String getDeign(){
        return  deign;
     }
     public  void setDeign(String deign){
        this.deign = deign;
     }
   public Bank getBank(){
        return bank;
   }
   public void setBank(Bank bank){
        this.bank = bank;
   }

}
