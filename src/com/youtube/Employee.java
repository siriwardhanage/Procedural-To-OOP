//OOP
//Encapsulation

package com.youtube;

public class Employee {

    private int baseSalary; //baseSalary field
    private int hourlyRate; //hourlyRate field

    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    //setter for baseSalary
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }

    //getter for baseSalary
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("hourlyRate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }
}
