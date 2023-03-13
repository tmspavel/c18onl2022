package by.teachmeskills.javaEEPatterns.mvc;

public class Application {

    public static void main(String[] args) {
        Employee employee = getEmployeeFromDB();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        controller.updateView();

        employee.setName("Федор");
        controller.updateView();
//        /*Employee updatedEmployee = new Employee(5, "Ivan Ivanov");
//        controller.setEmployee(updatedEmployee);
//        */controller.updateView();
    }

    public static Employee getEmployeeFromDB() {
        return new Employee(1, "Ivan");
    }
}
