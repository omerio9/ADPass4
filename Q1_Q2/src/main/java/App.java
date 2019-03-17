public class App {

    public static void main (String[]args){

        Employee emp1 = new Salaried_Employee("Omega",1,40,20);
        Employee emp2 = new Waged_Employee("Mado",2,35.5,7);
        Employee emp3 = new Daily_Employee("Harmomie",3,30,8);

        System.out.println(emp1.computePay());
        System.out.println(emp2.computePay());
        System.out.println(emp3.computePay());


    }//end main
}//end App
