import java.util.Random;

public class Main {

    public static void main(String[] args) {


        int[] nums = {13,16,0,436,89,9}; // {250}
//
//        NumbersArray arraus = new NumbersArray ();
//        arraus.setNumsArray ( nums );
//        arraus.add ( 675 );
//        arraus.printArrays ();
//        arraus.setNumsArray ( new int[]{13,16,0,436,89,9} );


        // =============================== Static
        ArrayNums.printArray ( nums );
        nums = ArrayNums.setLengthMore ( nums, 250 );
        ArrayNums.printArray ( nums );


    }

    /**
     *  Задание №_4
     *  Ответь на вопрос что такое ООП и для чего он нужен
     *
     *  Задание №_5
     *  Рассказать как ты понимаешь что такое модификаторы доступа
     *
     *  Задание №_6
     *  Рассказать про структуру класса
     */



}

