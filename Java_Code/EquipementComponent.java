// Component
public abstract class EquipementComponent {
    public void add(EquipementComponent equipementComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(EquipementComponent equipementComponent) {
        throw new UnsupportedOperationException();
    }
    public EquipementComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public abstract void displayInfo();
}