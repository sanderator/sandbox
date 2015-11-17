package mymath;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import static mymath.VectorTest.*;


public class MatrixTest {
    private Matrix m1;
    private Matrix m2;

    @Before
    public void setUp() {
        m1 = new Matrix(new int[][]{ELEMENTS1, ELEMENTS2});
        m2 = new Matrix(new Vector[]{new Vector(ELEMENTS1), new Vector(ELEMENTS2)});
    }

    @Test
    public void constructor() {
        assertNotNull(m1);
        assertNotNull(m2);
    }

    @Test
    public void equals() {
        assertTrue(m1.equals(m1));
        assertTrue(m1.equals(m2));
        assertTrue(m1.equals(new Matrix(new int[][]{ELEMENTS1, ELEMENTS2})));
        assertFalse(m1.equals(new Matrix(new int[][]{ELEMENTS1, ELEMENTS1})));
    }

    @Test
    public void set() {
        m1.set(0, 2, -17);
        assertEquals(-17, m1.get(0, 2));
    }

    @Ignore
    public void addition() {
        
    }
}