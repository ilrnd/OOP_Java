package ru.geekbrains.lesson3.task2;

import java.util.Comparator;
import java.util.Date;

public abstract class Employee implements Comparable<Employee>{

    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы

    protected double salaryPerHour;

    protected int hoursWorkPerMonth;

    protected int birthDate;

    protected int startYear;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, int birthDate, int startYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.birthDate = birthDate;
        this.startYear = startYear;
    }

    public Employee(String name, String surname, int birthDate, int startYear, double salaryPerHour, int hoursWorkPerMonth) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.startYear= startYear;
        this.salaryPerHour = salaryPerHour;
        this.hoursWorkPerMonth = hoursWorkPerMonth;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */

    public abstract double calculateSalary();

    public  int calculateExperience(int startYear){
        Date date = new Date();
        return date.getYear() + 1900 - startYear;
    };

    public int getAge() {
        Date date = new Date();
        int year = date.getYear();
        int age = year + 1900 - this.birthDate;
        return age;
    }

    @Override
    public int compareTo(Employee o) {
        int res = name.compareTo(o.name);
        if (res == 0){
            return Double.compare(calculateSalary(), o.calculateSalary());
        }
        return res;
    }
}
