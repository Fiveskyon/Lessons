public class ArrayNums {

    public static void printArray(int[] array){
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print ( array[i] + " " );
        }
        System.out.println ( );
    }

    public static int[] setLengthMore (int[] arrays, int num){
        int[] nums = new int[arrays.length + 1];

        for (int i = 0 ; i < arrays.length ; i++) {
            nums[i] = arrays[i];
        }
        nums[nums.length - 1] = num;

        return nums;
    }
}
