// Concrete Factory for Lab Test
public class LabTestFactory implements AbstractFactory {
    public Test createTest() {
        return new LabTest();
    }
    
    public Equipement createEquipement() {
        return new Centrifuge();
    }
}