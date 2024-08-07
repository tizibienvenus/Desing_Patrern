import java.util.ArrayList;
import java.util.List;

public class EquipementComposite extends EquipementComponent {
    private List<EquipementComponent> components = new ArrayList<>();
    
    public void add(EquipementComponent equipementComponent) {
        components.add(equipementComponent);
    }
    
    public void remove(EquipementComponent equipementComponent) {
        components.remove(equipementComponent);
    }
    
    public EquipementComponent getChild(int i) {
        return components.get(i);
    }
    
    public void displayInfo() {
        for (EquipementComponent component : components) {
            component.displayInfo();
        }
    }
}
