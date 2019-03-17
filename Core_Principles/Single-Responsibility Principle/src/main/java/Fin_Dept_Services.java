public class Fin_Dept_Services {
    public Double calcIncomeTaxForCurrentYear(Employee emp){
        double tax;
        tax=emp.getSalary()*0.14;
        return tax;
    }
}
