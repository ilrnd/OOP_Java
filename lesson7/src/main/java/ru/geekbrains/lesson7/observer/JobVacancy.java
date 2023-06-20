package ru.geekbrains.lesson7.observer;

public class JobVacancy {

    private Company company;

    private double salary;

    private Profession profession;



    public JobVacancy(Company company, int salary, Profession profession) {
        this.company = company;
        this.salary = salary;
        this.profession = profession;
    }

    public String getCompanyName() {
        return company.getCompanyName();
    }

    public double getSalary() {
        return salary;
    }

    public Profession getProfession() {
        return profession;
    }
}
