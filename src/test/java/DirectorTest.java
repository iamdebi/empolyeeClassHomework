import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Bigger Boss Baby", "JW4837267A", 60000.00, "boss man", 340000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bigger Boss Baby", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("JW4837267A", director.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(60000.00, director.getSalary(), 0.0000);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("boss man", director.getDeptName());
    }

    @Test
    public void canGetbudget(){
        assertEquals(340000.00, director.getBudget(), 00.000);
    }

    @Test
    public void canSetSalary(){
        director.setSalary(32000);
        assertEquals(32000, director.getSalary(), 0.000);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1200.00, director.payBonus(), 0.000);
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(20000.00);
        assertEquals(80000.00, director.getSalary(), 000.000);
    }

    @Test
    public void canIncreaseSalaryNotNegative(){
        director.raiseSalary(-20000.00);
        assertEquals(60000.00, director.getSalary(), 000.000);
    }

    @Test
    public void canChangeName(){
        director.setName("Biggest boss baby");
        assertEquals("Biggest boss baby", director.getName());
    }

    @Test
    public void cannotCahngeNameNull(){
        director.setName(null);
        assertEquals("Bigger Boss Baby", director.getName());
    }


}
