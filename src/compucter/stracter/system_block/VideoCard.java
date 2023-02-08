package compucter.stracter.system_block;

public class VideoCard {
    private String name;
    private int memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "VideoCard{" +"\n" +
                "name='" + name + '\'' +"\n" +
                ", memory=" + memory +"\n" +
                '}' + "\n" ;
    }
}
