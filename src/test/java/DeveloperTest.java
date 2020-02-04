import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Debbie", "JW472I237A", 34000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Debbie", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JW472I237A", developer.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(34000.00, developer.getSalary(), 0.0000);
    }

    @Test
    public void canSetSalary(){
        developer.setSalary(32000);
        assertEquals(32000, developer.getSalary(), 0.000);
    }

    @Test
    public void canPayBonus(){
        assertEquals(340.00, developer.payBonus(), 0.000);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(3000.00);
        assertEquals(37000.00, developer.getSalary(), 000.000);
    }

    @Test
    public void canIncreaseSalaryNotNegative(){
        developer.raiseSalary(-20000.00);
        assertEquals(34000.00, developer.getSalary(), 000.000);
    }

    @Test
    public void canChangeName(){
        developer.setName("Dev");
        assertEquals("Dev", developer.getName());
    }

    @Test
    public void cannotCahngeNameNull(){
        developer.setName(null);
        assertEquals("Debbie", developer.getName());
    }

}
