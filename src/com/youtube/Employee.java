//OOP
//Encapsulation

package com.youtube;

public class Employee {

    public int baseSalary; //baseSalary field
    public int hourlyRate; //hourlyRate field

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}
