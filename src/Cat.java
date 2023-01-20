public class Cat {


  private Katenok katenok = new Katenok ();
    private String name; // Параметр класса
//    private  модификатор доступа который работает только внутри класса
//    public  модификатор доступа который работает публично (Везде)
//    protected Работает в пределах наследников класса
//    default работает в пределах пакета

        public void setName(String name){
            // Сеттер создан для того чтобы принимать параметры
            // и вносить их в данные класса
            this.name = name;
            // this = указатель на объект класса (Нынешний)
        }
        public  String getName(){
            // Геттер Создан для того что бы отдавать параметр класса
            return this.name;
        }

        public void printCatKatenok(){
            katenok.printKatenok ();
        }



      private class Katenok{

            // Приватный класс может быть создан
            // внутри класса и существовать только в пределах основного класса
          private String name;

          public Katenok(){
              name = "Катенок";
          }

          public void printKatenok(){
              System.out.println (name );
          }
      }

      private class Dog{

      }

}
