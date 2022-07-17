public class Employee {
    String firstName;
    String lastName;
    String patronymic;
    float salary;
    int numDepartment;
    int id;
    private static int COUNT = 0;

    public Employee(String firstName, String lastName, String patronymic, int salary, int numDepartment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.salary = salary;
        this.numDepartment = numDepartment;
        this.id = ++COUNT;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getNumDepartment() {
        return numDepartment;
    }

    public void setNumDepartment(int numDepartment) {
        this.numDepartment = numDepartment;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", salary=" + salary +
                ", numDepartment=" + numDepartment +
                '}';
        }
}

