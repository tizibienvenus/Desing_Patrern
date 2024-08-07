public class Main {
    public static void main(String[] args) {
        // Singleton
        Laboratoire laboratoire = Laboratoire.getInstance();

        // Abstract Factory
        AbstractFactory factory = new RapidTestFactory();
        Test test = factory.createTest();
        Equipement equipement = factory.createEquipement();
        
        // Observer
        Medecin medecin1 = new Medecin("Dr. Doc Java");
        TestSubject testSubject = new TestSubject();
        testSubject.addObserver(medecin1);
        
        // Strategy
        TestProcessor processor = new TestProcessor(new SimpleProcessing());
        processor.processResult("Positive");
        
        // Set result and notify observers
        testSubject.setResult("Positive");
        
        // Decorator
        Test decoratedTest = new AdvancedTestDecorator(new BasicTest());
        decoratedTest.performTest();
        
        // Composite
        EquipementComposite composite = new EquipementComposite();
        composite.add(new Equipement("Microscope"));
        composite.add(new Equipement("Centrifuge"));
        composite.displayInfo();
    }
}
