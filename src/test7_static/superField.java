package test7_static;

public class superField {
    private static superField ourInstance = new superField();

    public static superField getInstance() {
        return ourInstance;
    }

    private superField() {
    }
}
