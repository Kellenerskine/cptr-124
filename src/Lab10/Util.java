//Kellen Erskine

public class Util {

    public static void main(String[] args) throws IllegalArgumentException{
        int[] array2 = {6, 0, 3, -14, 5, 11};
        int num = 5;
        int cee = countLessThan(array2, num);
        System.out.println("There are " + cee + " numbers less than " + num);
    }



    public static int countLessThan(int[] a, int n) throws IllegalArgumentException{
        int[] array = a;
        int smallerNumsCount = 0;


        if(array.length > 0){
            for(int i = 0; i < array.length; i++){
                if(array[i] < n){
                    smallerNumsCount++;
                }
            }
        }else{
            throw new IllegalArgumentException();
        }
        return smallerNumsCount;
    }
}
