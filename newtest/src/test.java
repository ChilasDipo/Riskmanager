

public class test extends zunit.TestSuite {


    @Override
    public void testMetodList() {
    passingtest();
    }

    public static void main(String[] args) {
        test ntest = new test();
        ntest.runTestSuite();

    }

    public void passingtest(){
        assertEquals(5,5);
    }


}
