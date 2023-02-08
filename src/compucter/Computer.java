package compucter;

import compucter.stracter.KeyBoard;
import compucter.stracter.Monitor;
import compucter.stracter.Mouse;
import compucter.stracter.SystemBox;

public class Computer {
   private String name;
   private String operationSystem;
   private boolean action;
 // монитора
   private Monitor display;
    // системного блока
    private SystemBox systemBox;
    // клавиатуры
    private KeyBoard keys;
    // мыши
    private Mouse mouse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public Monitor getDisplay() {
        return display;
    }

    public void setDisplay(Monitor display) {
        this.display = display;
    }

    public SystemBox getSystemBox() {
        return systemBox;
    }

    public void setSystemBox(SystemBox systemBox) {
        this.systemBox = systemBox;
    }

    public KeyBoard getKeys() {
        return keys;
    }

    public void setKeys(KeyBoard keys) {
        this.keys = keys;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" +"\n" +
                "name='" + name + '\'' +"\n" +
                ", operationSystem='" + operationSystem + '\'' +"\n" +
                ", action=" + action +"\n" +
                ", display=" + display +"\n" +
                ", systemBox=" + systemBox +"\n" +
                ", keys=" + keys +"\n" +
                ", mouse=" + mouse +"\n" +
                '}' + "\n";
    }
}
