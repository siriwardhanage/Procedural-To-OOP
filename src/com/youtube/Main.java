package com.youtube;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();    //create new Employee object

        employee1.setBaseSalary(10);

        System.out.println(employee1.getBaseSalary()); //get baseSalary

        employee1.setHourlyRate(20); //assign value "20" to hourlyRate field using getHourlyRate getter
        int wage = employee1.calculateWage(10); //call calculateWage method in Employee class,
        // and store the output in int wage variable
        System.out.println(wage); //print the result
    }


}
