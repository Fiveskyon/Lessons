

public class Chaild  extends Human{

    public Chaild(String name, int age, int rost, int ves) {
        super ( name, age, rost, ves );
    }

    @Override
    public String eats() {
        return "Кушает молоко";
    }

    @Override
    public String actions() {
        return "Изучает мир";
    }

    @Override
    public String speak() {
        return "Говорит Агу";
    }
}
