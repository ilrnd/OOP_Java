package ru.geekbrains.lesson3.task2;

import java.util.Comparator;

public  class NameAgeSalaryComparator implements Comparator<Employee> {
    Comparator <Employee> comparator = Comparator.comparing(Employee::getName);


    @Override
    public int compare(Employee o1, Employee o2) {
        int cmp = o1.getName().compareTo(o2.getName());
        if (cmp != 0) {
            return cmp;
        } else {
            cmp = Integer.compare(o1.getAge(), o2.getAge());
            if (cmp != 0) {
                return cmp;
            }
        }
        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}
