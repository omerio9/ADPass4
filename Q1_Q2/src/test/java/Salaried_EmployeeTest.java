import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Salaried_EmployeeTest extends TestCase {

    Salaried_Employee emp1;

    @Before
    public void setUp(){
       emp1 = new Salaried_Employee("Omega",1,40,20);

    }

    @After
    public void tearDown(){

    }


    @Test
    public void getDays_worked() {
    assertEquals(240,emp1.getDays_worked());
    }



    @Test
    public void computePay() {
        assertEquals(5000,emp1.computePay());

    }
}