public class Employee {

    //BAD IMPLEMENTATION//

    private String employeeId;
    private String name;
    private String address;
    private double salary;

    //Getters & Setters

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }


   //Method that violates rule//
    public Double calcIncomeTaxForCurrentYear(){
    double tax;
    tax=this.salary*0.14;
    return tax;
    }


}

///THIS CLASS violates the principle in case the tax return is the responsibility of the finance department
///and the structure needs to change. hence it needs to be taken out