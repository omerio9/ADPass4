public class Salaried_Employee extends Employee {

    private int days_worked;

    public Salaried_Employee(String name,  int number, double pay_rate,int days_worked) {
        super(name, number,pay_rate);
        setDays_worked(days_worked);
    }



    public int getDays_worked() {
        return days_worked;
    }

    public void setDays_worked(int days_worked) {
        this.days_worked = days_worked;
    }



    public double computePay() {

        double salary=getDays_worked()*getPay_rate()*8;
        return salary ;
    }
}
