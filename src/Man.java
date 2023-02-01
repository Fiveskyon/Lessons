public class Man extends Human{

    public Man(String name, int age, int rost, int ves) {
        super ( name, age, rost, ves );
    }

    @Override
    public String eats() {
        return "Кушает мало";
    }

    @Override
    public String actions() {
        return "Работает на заводе";
    }

    @Override
    public String speak() {
        return "Говорит на английском";
    }
}
