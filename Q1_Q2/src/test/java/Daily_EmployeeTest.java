import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Test;

public class Daily_EmployeeTest extends TestCase {

Daily_Employee emp3;

    @Before
    public void setUp(){
        emp3 = new Daily_Employee("Harmomie",3,30,8);
    }

    @After
    public void tearDown(){

    }


    @Test
    public void getHours_worked() {
        assertEquals(7,emp3.getHours_worked());
    }



    @Test
    public void computePay() {

        assertEquals(240,emp3.computePay());
    }
}