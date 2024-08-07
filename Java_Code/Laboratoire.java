public class Laboratoire {
    private static Laboratoire instance;
    
    private Laboratoire() {
        // Initialisation
    }
    
    public static synchronized Laboratoire getInstance() {
        if (instance == null) {
            instance = new Laboratoire();
        }
        return instance;
    }

}
