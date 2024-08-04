public class EmployeeManager {
    private Employee[] employees;
    private int size;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            System.out.println("Array is full, cannot add more employees.");
            return;
        }
        employees[size] = employee;
        size++;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[size - 1] = null;
        size--;
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        Employee emp1 = new Employee(1, "Alice", "Manager", 60000);
        Employee emp2 = new Employee(2, "Bob", "Developer", 50000);
        Employee emp3 = new Employee(3, "Charlie", "Analyst", 55000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        System.out.println("All employees:");
        manager.traverseEmployees();

        System.out.println("\nSearching for employee with ID 2:");
        Employee foundEmployee = manager.searchEmployee(2);
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting employee with ID 1:");
        manager.deleteEmployee(1);
        manager.traverseEmployees();
    }
}
