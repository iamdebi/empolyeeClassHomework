import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import javax.xml.crypto.Data;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin data;

    @Before
    public void before(){
        data = new DatabaseAdmin("Sandra", "AB542098J", 28000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Sandra", data.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("AB542098J", data.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(28000.00, data.getSalary(), 0.0000);
    }

    @Test
    public void canSetSalary(){
        data.setSalary(32000);
        assertEquals(32000, data.getSalary(), 0.000);
    }

    @Test
    public void canPayBonus(){
        assertEquals(280.00, data.payBonus(), 0.000);
    }

    @Test
    public void canIncreaseSalary(){
        data.raiseSalary(1000.00);
        assertEquals(29000.00, data.getSalary(), 000.000);
    }

    @Test
    public void canIncreaseSalaryNotNegative(){
        data.raiseSalary(-20000.00);
        assertEquals(28000.00, data.getSalary(), 000.000);
    }

    @Test
    public void canChangeName(){
        data.setName("admin lady");
        assertEquals("admin lady", data.getName());
    }

    @Test
    public void cannotCahngeNameNull(){
        data.setName(null);
        assertEquals("Sandra", data.getName());
    }
}
