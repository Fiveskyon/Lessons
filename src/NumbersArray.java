public class NumbersArray {

    private int[] numsArray;


    public int[] getNumsArray() {
        return numsArray;
    }

    public void setNumsArray(int[] numsArray) {
        this.numsArray = numsArray;
    }

    public void add(int nums){
        int[] numsArray = new int[this.numsArray.length + 1];
        for (int i = 0 ; i < this.numsArray.length ; i++) {
            numsArray[i] = this.numsArray[i];
        }
        numsArray[numsArray.length - 1] = nums;
        this.numsArray = numsArray;
    }

    public void printArrays(){
        for (int i = 0 ; i < this.numsArray.length ; i++) {
            System.out.print (this.numsArray[i] + " " );
        }
        System.out.println ( );
    }
}

/**
 *  Задание №_1
 *  Реалезовать метод который будет добавлять ячейку массива в середину
 *  массива или по указаному индексу
 *
 *  Задание №_2
 *  Реалезовать метод который будет удолять информацию
 *  из ячейки (Приравнивать к нулю)
 *
 *  Задание №_3
 *  Реалезовать метод который будет удолять ячейку из массива
 */
