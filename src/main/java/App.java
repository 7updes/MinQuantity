import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 05.07.2015.
 */
public class App {

    private static int[] array;
    public static List<int[]>list = new ArrayList<int[]>();

    public static void main(String[] args) {
        System.out.println("All incorrect variants = " + printMinQuantity(-1));
    }


    public static int printMinQuantity(int number){
        int count = 0;
        if(number<2){
            throw new IllegalArgumentException("too short number");
        }
        array = new int[number];
        allVariants(number, number - 1, 0);
        for (int[] arr: list){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            count++;
        }
        return count;
    }
    public static void allVariants(int n, int high, int pos){
        int i;
        if (n > 0){
            for (i = 1; i <= high; i++){
                array[pos] = i;
                allVariants(n - i, min(i, n - i), pos + 1);
            }
        }
        else{
            boolean check = false;
            for (i = 0; i < pos;  i++){
                if(!(check = isPrime(array[i]))){
                    break;
                }
            }
            if(check) {
                int[] mas = new int[pos];
                for (i = 0; i < pos; i++) {
                    mas[i] = array[i];
                }
                if (mas.length>2) {
                    list.add(mas);
                }
            }
        }
    }

    public static boolean isPrime(int toCheck){
        for (int i = 2; i < toCheck; i++) {
            if(toCheck%i==0){
                return false;
            }
        }
        return true;
    }

    public static int min(int x, int y) {
        return (x < y) ? x : y;
    }
}
