package OOPS;

public class AggregationDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahul", 12);
        Department dep1 = new Department("CSE", "Sachin", 15);

        System.out.println(emp1.employeeId);
        System.out.println(dep1.departmenName);

    }
}

//Department has-a employee 
//But Deparment can also Exist without Employee
//Employee can alone make sense without department
//Both can exist independently   (So this is an Aggregation)

class Department{
    public String departmenName;

    private Employee employee;  //Composition

    public Department (String deName, String empName, int employeeId){
        this.departmenName = deName;
        this.employee = new Employee(empName, employeeId);
    }
}

class Employee{
    int employeeId;
    String name;

    public Employee(String name, int employeeId){
        this.employeeId = employeeId;
        this.name = name;
    }
}

