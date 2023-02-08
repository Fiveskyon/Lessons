package compucter.stracter.system_block;

import java.util.Arrays;

public class PowerBlock {
    private  int[] pin ;
    private String name;
    private String model;
    private int power;

    public int[] getPin() {
        return pin;
    }

    public void setPin(int[] pin) {
        this.pin = pin;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "PowerBlock{" +"\n" +
                "pin=" + Arrays.toString ( pin ) +"\n" +
                ", name='" + name + '\'' +"\n" +
                ", model='" + model + '\'' +"\n" +
                ", power=" + power +"\n" +
                '}'+ "\n" ;
    }
}
