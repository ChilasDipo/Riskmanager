package zunit;

public abstract class TestSuite {
    private int passed;
    private int failed;

 public void runTestSuite(){
    passed = 0;
    failed = 0;
    testMetodList();

     System.out.println("Test passed :  "+passed);
     System.out.println("Test failed :  "+failed);
 }

public abstract void testMetodList();

 public void assertEquals(int actual , int expected){
    if (actual == expected){
        passed++;
    }else {
        failed++;
        System.out.println("Test" + (passed+failed) + " has failed \n  expedted results " + expected + "\n Actual result: " + actual);
    }
 }
    public void assertEquals(String actual , String expected){
        if (actual.equals(expected)){
            passed++;
        }else {
            failed++;
            System.out.println("Test" + (passed+failed) + " has failed \n  expedted results " + expected + "\n Actual result: " + actual);

        }
}
    public void assertEquals(double actual , double expected){
        if (actual == expected){
            passed++;
        }else {
            failed++;
            System.out.println("Test" + (passed+failed) + " has failed \n  expedted results " + expected + "\n Actual result: " + actual);
        }
    }
}

