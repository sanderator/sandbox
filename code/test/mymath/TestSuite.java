package mymath;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({mymath.VectorTest.class, mymath.MatrixTest.class})
public class TestSuite {
}