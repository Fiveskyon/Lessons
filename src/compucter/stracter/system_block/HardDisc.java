package compucter.stracter.system_block;

public class HardDisc {
    private int memory;
    private String name;
    private String model;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
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
        return "HardDisc{" + "\n" +
                "memory=" + memory + "\n" +
                ", name='" + name + '\'' + "\n" +
                ", model='" + model + '\'' + "\n" +
                '}' + "\n" ;
    }
}
