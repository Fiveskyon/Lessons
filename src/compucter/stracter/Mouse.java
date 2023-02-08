package compucter.stracter;

public class Mouse {
    private int keys;
    private String name;
    private String model;

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mouse{" +"\n" +
                "keys=" + keys +"\n" +
                ", name='" + name + '\'' +"\n" +
                ", model='" + model + '\'' +"\n" +
                '}' + "\n" ;
    }
}
