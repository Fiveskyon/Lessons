public class House {


    // Параметры класса ========================================================================

        int whidth = 8;
        int hegth = 10;
        int rooms = 4;
        int window = 4;
        int doore = 1;
        String wother;
        // толщину стенок
    // количесвто этажей



    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.


    // Конструктор класса =========================================================================

    /**
     * Кантсруктор класса позволят создовать обьект при вызове.
     * что позволяет экономить время, строчки ода.
     * Еще одно очень важное свойство
     * Конструктор не позволит создать объект класса пока не будут заполнены все параметры
     * которые принимает конструктор
     */

    public House(){

    }

    public House(int whidth, int hegth, int rooms, int window, int doore, String wother) {
        this.whidth = whidth;
        this.hegth = hegth;
        this.rooms = rooms;
        this.window = window;
        this.doore = doore;
        this.wother = wother;
    }

    //    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>






    // Методы (Поведение Дома)========================================================================
        public void getHeat(double temperatura ){
            System.out.println ("Настала зима на улице холодно Дом греет семью" );
        }

        public void setWother(String wother){
            this.whidth = whidth;

        }


    // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}
