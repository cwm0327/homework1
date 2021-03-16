import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorTest {
    Vector vetor;

    @Before
    public void setUp() throws Exception {
        vetor = new Vector(1, 2, 3);
        System.out.println("test begin");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("test end");
    }

    @Test
    public void getMod() {
        assertTrue(vetor.getMod() == Math.sqrt(14));
    }

    @Test
    public void addVector() {
        Vector x1 = new Vector(1, 2, 3);
        Vector res = vetor.addVector(x1, vetor);
        assertTrue(res.getMod() == Math.sqrt(56));
    }

    @Test
    public void subVector() {
        Vector x1 = new Vector(1, 2, 3);
        Vector res = vetor.subVector(x1, vetor);
        assertTrue(res.getMod() == Math.sqrt(0));
    }

    @Test
    public void dotMult() {
        Vector x1 = new Vector(1, 2, 3);
        double res = vetor.dotMult(x1, vetor);
        assertTrue(res == 14);
    }

    @Test
    public void crossMult() {
        Vector x1 = new Vector(1, 2, 3);
        Vector res = vetor.crossMult(x1, vetor);
        assertTrue(res.getMod() == Math.sqrt(0));
    }
}
