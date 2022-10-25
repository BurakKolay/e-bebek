package org;

public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public boolean isSalaryHigher(double salary){
        return !(salary <= 1000);
    }

    public boolean isWorkHoursHigher(double workHours){
        return workHours > 40;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public int isWorkYearGreater(int hireYear){
        int currentYear=2021;

        if(currentYear-hireYear<10){
            return 1;
        }else if(currentYear-hireYear>10 && currentYear-hireYear<20){
            return 2;
        }else{
            return 3;
        }
    }

    public double tax(double salary){
        if(isSalaryHigher(salary)){
            return salary*0.03;
        }else{
            return 0;
        }
    }

    public double bonus(double workHours){
        if(isWorkHoursHigher(workHours)){
            return (workHours-40)*30;
        }else{
            return 0;
        }
    }

    public double raiseSalary(){
        double bonus=bonus(workHours);
        double tax = tax(salary);

        salary-=tax;
        salary+=bonus;

        double raise = switch (isWorkYearGreater(hireYear)) {
            case 1 -> salary * 0.05;
            case 2 -> salary * 0.1;
            case 3 -> salary * 0.15;
            default -> 0;
        };
        System.out.println("salary with tax and bonus -> "+salary);
        salary=salary+raise;

        setSalary(salary);
        return raise;
    }




}