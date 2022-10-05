/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebebek_employee;

/**
 *
 * @author baran
 */
public class Ebebek_Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Ahmet", 1300, 45, 2014);
        Employee secondEmployee = new Employee("Feyza", 1600, 43, 2009);
        Employee thirdEmployee = new Employee("Mehmet", 800, 50, 2019);
        
        System.out.println(firstEmployee.toString());
        System.out.println(secondEmployee.toString());
        System.out.println(thirdEmployee.toString());               
    }
    
}

class Employee
{
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    
    public Employee(String name, double salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public double tax()
    {
        if(this.salary >= 1000)
            return (this.salary*0.03);
        else
            return 0;
    }
    
    public double bonus()
    {
        if(this.workHours >= 40)
            return (double)((this.workHours-40)*30);
        else 
            return 0;
    }
    
    public double raiseSalary()
    {
        if((2021 - this.hireYear) < 10)
        {
            return this.salary*0.05;
        }        
        else
        {
            if(((2021 - this.hireYear) < 20))
                return this.salary*0.1;
        }
        
        return this.salary*0.15; //20 yıldan fazla olunca %15 zam ekledim
    }
    
    @Override
    public String toString(){
        return ("\nName: "+ this.name+
                "\nSalary: "+ this.salary+
                "\nWork hours: "+ this.workHours+
                "\nHire year: "+ this.hireYear+
                "\nTax: "+ tax()+
                "\nBonus: "+ bonus()+
                "\nRaise salary: "+ raiseSalary()+
                "\nNet salary: "+ (this.salary + bonus()+ raiseSalary()- tax()));
    }
}
