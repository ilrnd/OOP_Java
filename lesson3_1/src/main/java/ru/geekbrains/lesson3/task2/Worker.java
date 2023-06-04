package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {

    public Worker(String name, String surname, int age, int startYear, double salary) {
        super(name, surname, age, startYear, salary);
    }

    @Override
    public double calculateSalary() {

        return salary;
    }



    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Возраст: %d; Год начала работы: %d; Стаж работы: %d лет; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, getAge(), startYear, calculateExperience(startYear), calculateSalary());
    }

}
