package mymath;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class VectorTest {
    public static final int[] ELEMENTS1 = {1, 2, 3, 4};
    public static final int[] ELEMENTS2 = {10, 11, 12, 13};
    public static final int[] ELEMENTS3 = {5, 6};
    public static final int[] ELEMENTS4 = {7, 8, 9};
    private Vector v1 = null;
    private Vector v2 = null;
    private static final int INNER_PRODUCT = 10 + 22 + 36 + 52;

    @Before
    public void setUp() {
        v1 = new Vector(ELEMENTS1);
        v2 = new Vector(ELEMENTS2);
    }

    @Test
    public void constructor() {
        assertNotNull(v1);
    }

    @Test
    public void equal() {
        assertTrue(v1.equals(v1));
        assertTrue(v1.equals(new Vector(ELEMENTS1)));
    }

    @Test
    public void notEqual() {
        assertFalse(v1.equals(new Vector(ELEMENTS2)));
    }

    @Test
    public void additionOK() {
        Vector sum = new Vector(new int[]{11, 13, 15, 17});
        assertEquals(sum, v1.addition(v2));
    }

    @Ignore
    public void scalarTimes() {
    
    }

    @Ignore
    public void innerProduct() {
        
    }

    @Ignore
    public void outerProduct() {
        
    }
}