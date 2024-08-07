public class AdvancedTestDecorator extends TestDecorator {
    public AdvancedTestDecorator(Test decoratedTest) {
        super(decoratedTest);
    }
    
    public void performTest() {
        decoratedTest.performTest();
        performAdvancedTest();
    }
    
    private void performAdvancedTest() {
        System.out.println("Performing advanced test.");
    }
}
