package compucter.stracter.system_block;

public class Box {
    private String name;
    private String model;
    private String moterial;

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

    public String getMoterial() {
        return moterial;
    }

    public void setMoterial(String moterial) {
        this.moterial = moterial;
    }

    @Override
    public String toString() {
        return "Box{" + "\n" +
                "name='" + name + '\'' + "\n" +
                ", model='" + model + '\'' + "\n" +
                ", moterial='" + moterial + '\'' + "\n" +
                '}' + "\n" ;
    }
}
