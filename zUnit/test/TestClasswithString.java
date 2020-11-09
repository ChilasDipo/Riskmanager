import zunit.TestSuite;

public class TestClasswithString extends TestSuite {

    @Override
    public void testMetodList() {
        passingTest();
        failingTest();
    }

    public static void main(String[] args) {
        TestClasswithString TestClasswithString = new TestClasswithString();
        TestClasswithString.runTestSuite();
    }

    private void passingTest(){
        assertEquals("string","string");
    }

    private void failingTest(){
        assertEquals("string23","string21");
    }
}
