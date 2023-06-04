package ru.geekbrains.lesson3.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Date;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(int type){ // 0 - рабочий, 1 - фрилансер
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryWorker = random.nextInt(20000, 80000);
        double salaryPerHour = random.nextDouble(1000, 2000);
        int hourWorkPerMonth = random.nextInt(10, 150);
        int birthDate = random.nextInt(1960, 2005);
        Date date = new Date();
        int year = date.getYear() + 1900;
        int startYear = random.nextInt(1990, year);
        if (type == 0)
        return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], birthDate, startYear, salaryWorker);
        if (type == 1)
        return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], birthDate, startYear, salaryPerHour, hourWorkPerMonth);
        return null;
    }




    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     *
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee(random.nextInt(0, 2));
        }
        Arrays.sort(employees, new NameAgeSalaryComparator());

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

}
