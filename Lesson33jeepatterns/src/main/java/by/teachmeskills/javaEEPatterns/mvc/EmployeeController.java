package by.teachmeskills.javaEEPatterns.mvc;

public class EmployeeController {

    private Employee employee;
    private EmployeeView employeeView;

    public EmployeeController(Employee employee, EmployeeView employeeView) {
        this.employee = employee;
        this.employeeView = employeeView;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeView getEmployeeView() {
        return employeeView;
    }

    public void setEmployeeView(EmployeeView employeeView) {
        this.employeeView = employeeView;
    }

    public void updateView() {
        employeeView.printEmployeeInfo(employee.getId(), employee.getName());
    }
}
