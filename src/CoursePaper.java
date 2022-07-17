public class CoursePaper {
    static Employee[] employees = new Employee[10];
    private static void calculateSumSalary() {
        float sumSalary = 0;
        float maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            sumSalary = sumSalary + employees[i].getSalary();
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sumSalary);
    }
    private static void toFindMinSalary() {
        float minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата равна:" + minSalary);
    }
    private static void toFindMaxSalary() {
        float maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата равна:" + maxSalary);
    }
    private static void toFindAverageSalary() {
        float averageSalary = 0;
        // averageSalary = sumSalary / employees.length;
        System.out.println("Средняя зарплата равна:" + averageSalary);
    }
    private static void listOfFullNamesOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFirstName() + " " + employees[i].getLastName() + " " + employees[i].getPatronymic());
        }
    }
    private static void printNewSalaryAll() {
        float arguments = 0.03f; // величина аргумента в процентах
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() * arguments + employees[i].getSalary());
            System.out.println(employees[i].getSalary());
        }
    }
    private static int printNewSalaryForNumDepartment(int numDepartment ) {
        float arguments = 0.1f; // величина аргумента в процентах
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNumDepartment()== numDepartment){
                employees[i].setSalary(employees[i].getSalary() * arguments + employees[i].getSalary());
                System.out.println(employees[i].getSalary());}
        }
        return numDepartment;
    }
    private static void toFindMinSalaryForNumDepartment(int numDepartment) {
        float minSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getNumDepartment()== numDepartment){
                minSalary = employees[i].getSalary();
            }
            if (minSalary > employees[i].getSalary()&& employees[i].getNumDepartment()== numDepartment) {
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата по отделу "+ numDepartment + " равна:" + minSalary);
        }
    public static void main(String[] args) {
        employees[0] = new Employee("00", "00", "000", 32, 2);
        employees[1] = new Employee("01", "09", "011", 24, 1);
        employees[2] = new Employee("02", "08", "022", 15, 2);
        employees[3] = new Employee("03", "07", "033", 10, 1);
        employees[4] = new Employee("04", "06", "044", 220, 3);
        employees[5] = new Employee("05", "05", "055", 320, 3);
        employees[6] = new Employee("06", "04", "066", 450, 4);
        employees[7] = new Employee("07", "03", "077", 650, 1);
        employees[8] = new Employee("08", "02", "088", 60, 5);
        employees[9] = new Employee("09", "01", "099", 30, 5);


        System.out.println(" ");
        toFindMinSalaryForNumDepartment(1);
    }
}

