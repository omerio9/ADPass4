public abstract class Employee {
    private String name;

    private int number;
    private double pay_rate;



    public Employee(String name, int number,double pay_rate) {
        this.name = name;
        this.number = number;
        this.pay_rate=pay_rate;
    }

    public abstract double computePay() ;

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " );
    }

    public String toString() {
        return name + " " + " " + number;
    }

    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }

    public double getPay_rate() {
        return pay_rate;
    }

    public void setPay_rate(double pay_rate) {
        this.pay_rate = pay_rate;
    }
}