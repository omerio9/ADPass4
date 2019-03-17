import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Waged_EmployeeTest extends TestCase {

    Waged_Employee emp2;

    @Before
    public void setUp() throws Exception{
        emp2 = new Waged_Employee("Mado",2,35.5,7);

    }

    @After
    public void tearDown()throws Exception{

    }

    @Test
    public void test_getDaysWorked() {

        assertEquals(7,emp2.getDays_worked());
    }


    @Test
    public void computePay() {
    }
}