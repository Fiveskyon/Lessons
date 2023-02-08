package compucter.stracter.system_block.moather_board;

public class OperRam {
    private int ram;
    private String name;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OperRam{" + "\n" +
                "ram=" + ram + "\n" +
                ", name='" + name + '\'' + "\n" +
                '}' + "\n";
    }
}
