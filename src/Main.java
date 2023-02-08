import compucter.stracter.Monitor;

public class Main {
    /**
     * Personal Computer {
     *      1) монитор
     *      2) системный блок {
     *          1) Блок питания
     *          2) Материнка{
     *              1) CPU
     *              2) ОЗУ
     *              3) integrVideo
     *              4) Radiator
     *          }
     *          3) HDD
     *          4) VideoCard
     *          5) Корпус
     *
     *
     *      }
     *      3) клавиатура
     *      4) мышь
     *
     *  }
     */

    /*
     ООП
     1) Наследование
     2) Палиморфизм
     3) Инкапсуляция
     4) Агрегация
     5)
     */
    public static void main(String[] args) {
        Monitor monitor = new Monitor ();
        monitor.setName ( null );


        System.out.println ("----" );
        System.out.println (monitor.getName () );
    }
}
