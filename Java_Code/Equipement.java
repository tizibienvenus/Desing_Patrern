public class Equipement extends EquipementComponent {
    private String name;
    
    public Equipement(String name) {
        this.name = name;
    }
    
    public void displayInfo() {
        System.out.println(name);
    }
}