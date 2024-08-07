public class TestProcessor {
    private TestStrategy strategy;
    
    public TestProcessor(TestStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void setStrategy(TestStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void processResult(String result) {
        strategy.processResult(result);
    }
}
