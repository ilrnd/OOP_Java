package ru.geekbrains.lesson3.task2;

// 20 * 8

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee{

    public Freelancer(String name, String surname, int birthDate, int startYear, double salaryPerHour, int hourWorkPerMonth) {
        super(name, surname, birthDate, startYear, salaryPerHour, hourWorkPerMonth);
    }

    @Override
    public double calculateSalary() {
        salary = salaryPerHour * hoursWorkPerMonth;
        return salary;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Возраст: %d; Год начала работы: %d; Стаж работы: %d лет; Среднемесячная заработная плата: %.2f (руб.)",
                surname, name, getAge(), startYear, calculateExperience(startYear), calculateSalary());
    }

}
