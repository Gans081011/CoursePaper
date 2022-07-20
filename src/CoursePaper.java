public class CoursePaper {
    public static Employee[] employees = new Employee[10];

    public static void listOfFullInfoOfEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            } else {
                System.out.println("массив под этим индексом пуст");
            }
        }
    }

    public static float calculateSumSalary(Employee[] employees) {
        float sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static float printSumSalary(Employee[] employees) {
        float sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц:" + sumSalary);
        return sumSalary;
    }

    public static float findMinSalary(Employee[] employees) {
        float minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary() && employees[i] != null) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата равна:" + minSalary);
        return minSalary;
    }


    public static float findMaxSalary(Employee[] employees) {
        float maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата равна:" + maxSalary);
        return maxSalary;
    }

    public static float findAverageSalary(Employee[] employees) {
        float averageSalary = 0;
        averageSalary = calculateSumSalary(employees) / employees.length;
        System.out.println("Средняя зарплата равна:" + averageSalary);
        return averageSalary;
    }

    public static void listOfFullNamesOfEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                System.out.println("Массив под этим индексом пуст");
            } else {
                System.out.println("ФИО сотрудника " + employees[i].getFirstName() + " " + employees[i].getLastName() + " " + employees[i].getPatronymic());
            }
        }
    }

    public static void printNewSalaryAll(Employee[] employees) {
        float arguments = 0.03f; // величина аргумента в процентах
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                System.out.println("Массив под этим индексом пуст");
            } else {
                employees[i].setSalary(employees[i].getSalary() * arguments + employees[i].getSalary());
                System.out.println("Новая зарплата сотрудника id№ " + employees[i].getId() + " после индексации: " + employees[i].getSalary());
            }
        }
    }

    public static int printNewSalaryForNumDepartment(int numDepartment) {
        float arguments = 0.1f; // величина аргумента в процентах
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getNumDepartment() == numDepartment) {
                employees[i].setSalary(employees[i].getSalary() * arguments + employees[i].getSalary());
                System.out.println("Новая зарплата сотрудника id№ " + employees[i].getId() + " " + numDepartment + " отдела после индексации: " + employees[i].getSalary());
            } else if (employees[i] != null) {
                System.out.println("Сотрудники из других отделов");
            } else if (employees[i] == null) {
                System.out.println("Ячейка в массиве сотрудника пуста");
            }
        }
        return numDepartment;
    }

    public static void toFindMinSalaryForNumDepartment(int numDepartment) {
        float minSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getNumDepartment() == numDepartment) {
                    minSalary = employees[i].getSalary();
                }
                if (minSalary > employees[i].getSalary() && employees[i].getNumDepartment() == numDepartment) {
                    minSalary = employees[i].getSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата по отделу " + numDepartment + " равна:" + minSalary);
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Погрелов", "Вениамин", "Афанасьевич", 12000, 2);
        employees[1] = new Employee("Горелов", "Ян", "Анатольевич", 2400, 1);
        employees[2] = new Employee("Лепешкин", "Алексей", "Владимироч", 1500, 2);
        employees[3] = new Employee("Крылов", "Владимир", "Александрович", 10000, 1);
        employees[4] = new Employee("Котиков", "Альберт", "Александрович", 22000, 3);
        employees[5] = new Employee("Борисов", "Борис", "Алексеевич", 32000, 3);
        employees[6] = new Employee("Хонг", "Хван", "Викторович", 4500, 4);
        employees[7] = new Employee("Вилкин", "Артур", "Юрьевич", 6500, 1);
        employees[8] = new Employee("Жулин", "Денис", "Афанасьевич", 60000, 5);
        employees[9] = new Employee("Петушков", "Эльдар", "Венедиктович", 30000, 5);
    }
}


