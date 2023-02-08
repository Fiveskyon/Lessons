package compucter.stracter;

public class Monitor {
   private int diagonal;
   private String name ;
   private boolean action;
   private double gerc;

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public double getGerc() {
        return gerc;
    }

    public void setGerc(double gerc) {
        this.gerc = gerc;
    }

    @Override
    public String toString() {
        return "Monitor{" + "\n" +
                "diagonal=" + diagonal +"\n" +
                ", name='" + name + '\'' +"\n" +
                ", action=" + action +"\n" +
                ", gerc=" + gerc +"\n" +
                '}' + "\n" ;
    }
}
