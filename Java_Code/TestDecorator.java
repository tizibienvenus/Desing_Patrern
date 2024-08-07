// Decorator
public abstract class TestDecorator implements Test {
    protected Test decoratedTest;
    
    public TestDecorator(Test decoratedTest) {
        this.decoratedTest = decoratedTest;
    }
    
    public void performTest() {
        decoratedTest.performTest();
    }
}