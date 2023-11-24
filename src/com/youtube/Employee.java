//OOP
//Encapsulation

package com.youtube;

public class Employee {

    private int baseSalary; //baseSalary field
    public int hourlyRate; //hourlyRate field

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary can be 0 or less");
        this.baseSalary = baseSalary;
    }
}
