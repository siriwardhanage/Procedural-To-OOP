package com.youtube;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();    //create new Employee object
        employee1.baseSalary = 50_000;  //assign value "50_000" to baseSalary field
        employee1.hourlyRate = 20; //assign value "20" to hourlyRate field
        int wage = employee1.calculateWage(10); //call calculateWage method in Employee class,
        // and store the output in int wage variable
        System.out.println(wage); //print the result
    }

}
