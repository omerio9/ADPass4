public class Daily_Employee extends Employee {

    private int hours_worked;


    public Daily_Employee(String name, int number, double pay_rate,int hours_worked) {
        super(name,number,pay_rate);
        setHours_worked(hours_worked);
    }


    public int getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public double computePay() {
        double pay=getHours_worked()*getPay_rate();
        return pay;
    }
}
