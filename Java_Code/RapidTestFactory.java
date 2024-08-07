public class RapidTestFactory implements AbstractFactory {
    public Test createTest() {
        return new RapidTest();
    }
    
    public Equipement createEquipement() {
        return new Microscope();
    }
}