import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Boss Baby", "JW138297A", 30000.00, "accounts");
    }

    @Test
    public void canGetName(){
        assertEquals("Boss Baby", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JW138297A", manager.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0000);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("accounts", manager.getDeptName());
    }

    @Test
    public void canSetSalary(){
        manager.setSalary(32000);
        assertEquals(32000, manager.getSalary(), 0.000);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, manager.payBonus(), 0.000);
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(2000.00);
        assertEquals(32000.00, manager.getSalary(), 000.000);
    }

    @Test
    public void canIncreaseSalaryNotNegative(){
        manager.raiseSalary(-20000.00);
        assertEquals(30000.00, manager.getSalary(), 000.000);
    }

    @Test
    public void canChangeName(){
        manager.setName("Little boss baby");
        assertEquals("Little boss baby", manager.getName());
    }

    @Test
    public void cannotCahngeNameNull(){
        manager.setName(null);
        assertEquals("Boss Baby", manager.getName());
    }

}
