package compucter.stracter.system_block.moather_board;

public class Processor {
    private String name;
    private String socket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    @Override
    public String toString() {
        return "Processor{" + "\n" +
                "name='" + name + '\'' + "\n" +
                ", socket='" + socket + '\'' + "\n" +
                '}' + "\n";
    }
}
