import zunit.TestSuite;

public class TestClasswithdouble extends TestSuite {

    @Override
    public void testMetodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClasswithdouble TestClasswithdouble = new TestClasswithdouble();
        TestClasswithdouble.runTestSuite();
    }

    private void passingTest(){
        assertEquals(5.6,5.6);
    }

    private void failingTest(){
        assertEquals(3.2,7.2);
    }
}


