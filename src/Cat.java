public class Cat {
    String breed;
    String name;
    int age;
    int weight;


    public Cat (String poroda, String nameCat, int ageCat, int ves){
        breed = poroda;
        name = nameCat;
        age = ageCat;
        weight = ves;
    }

    public void printCat(){
        System.out.println ("Парода кошки: " + breed );
        System.out.println ("Имя кошки: " + name );
        System.out.println ("Возраст кошки: " + age );
        System.out.println ("Вес кошки: " + weight );
    }

    public String getCat(){
        return breed + " " + name + " " + age + " " + weight;
    }

}
