public abstract class Human {
    String name;
    int age;
    int rost;
    int ves;


    public Human(String name, int age, int rost, int ves) {
        this.name = name;
        this.age = age;
        this.rost = rost;
        this.ves = ves;
    }

    public abstract String eats();

    public  abstract String actions ();

    public abstract String speak();

    public void print(){
        System.out.printf ("имя = %s \n" +
                "Возраст = %s лет\n" +
                "Рост = %s  см\n" +
                "Вес = %s кг\n" +
                "Кушает = %s\n" +
                "Активность = %s\n" +
                "Говорить = %s\n", name, age, rost,ves, eats (), actions (), speak ()  );
    }
}
