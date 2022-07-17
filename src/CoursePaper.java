public class CoursePaper {
    static Employee[] employees = new Employee[10];

    private static void listOfFullInfoOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    private static float calculateSumSalary() {
        float sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary = sumSalary + employee.getSalary();

        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary);
        return sumSalary;
    }

    private static float findMinSalary() {
        float minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата равна:" + minSalary);
        return minSalary;
    }

    private static float findMaxSalary() {
        float maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата равна:" + maxSalary);
        return maxSalary;
    }

    private static float findAverageSalary() {
        float averageSalary = 0;
        averageSalary = calculateSumSalary() / employees.length;
        System.out.println("Средняя зарплата равна:" + averageSalary);
        return averageSalary;
    }

    private static void listOfFullNamesOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ФИО сотрудника " + employees[i].getFirstName() + " " + employees[i].getLastName() + " " + employees[i].getPatronymic());
        }
    }

    private static void printNewSalaryAll() {
        float arguments = 0.03f; // величина аргумента в процентах
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() * arguments + employees[i].getSalary());
            System.out.println("Новая зарплата сотрудника после индексации: " + employees[i].getSalary());
        }
    }

    private static int printNewSalaryForNumDepartment(int numDepartment) {
        float arguments = 0.1f; // величина аргумента в процентах
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNumDepartment() == numDepartment) {
                employees[i].setSalary(employees[i].getSalary() * arguments + employees[i].getSalary());
                System.out.println("Новая зарплата сотрудника " + numDepartment + " отдела после индексации: " + employees[i].getSalary());
            }
        }
        return numDepartment;
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Брусков", "Иван", "Григорьевич", 3200, 2);
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


