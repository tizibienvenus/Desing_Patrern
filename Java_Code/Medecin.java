public class Medecin implements Observer {
    private String name;
    
    public Medecin(String name) {
        this.name = name;
    }
    
    public void update(String result) {
        System.out.println("Medecin " + name + " notified of test result: " + result);
    }
}
