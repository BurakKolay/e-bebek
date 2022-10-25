package org;

public class Main {
    public static void main(String[] args) {
        Employee e1= new Employee("Nail Burak Kolay",35000,10,2012);
        Employee e2 = new Employee("Vedat Kolay",25000,40,2010);
        Employee e3 = new Employee("Mücahit Kolay",6523,25,2013);

        System.out.println(e1);
        System.out.println("tax -> "+e1.tax(e1.getSalary()));
        System.out.println("bonus -> "+e1.bonus(e1.getWorkHours()));
        System.out.println("raise -> "+e1.raiseSalary());
        System.out.println("final salary -> "+e1.getSalary());

        System.out.println("**************************************************************************************");

        System.out.println(e2);
        System.out.println("tax -> "+e2.tax(e2.getSalary()));
        System.out.println("bonus -> "+e2.bonus(e2.getWorkHours()));
        System.out.println("raise -> "+e2.raiseSalary());
        System.out.println("final salary -> "+e2.getSalary());

        System.out.println("**************************************************************************************");

        System.out.println(e3);
        System.out.println("tax -> "+e3.tax(e3.getSalary()));
        System.out.println("bonus -> "+e3.bonus(e3.getWorkHours()));
        System.out.println("raise -> "+e3.raiseSalary());
        System.out.println("final salary -> "+e3.getSalary());
    }
}