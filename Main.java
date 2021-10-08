package exam;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // მეორე ამოცანა
//        System.out.println(firstClass(5, 3));
//        System.out.println(firstClass(2, 2));
//        System.out.println(firstClass(14, 41));


        // პირველი ამოცანა
        int i = 0;
        String word = "Hello World";
        do {
            System.out.println(word);
            i++;
        }
        while (i < 10);

        // მესამე ამოცანა
        String[] cityArray = {"New Yotk", "San Francisco", "Dallas", "Los Angeles", "Seattle"};
        int a = 0;
        do {
            System.out.println(cityArray[a]);
            a++;
        }
        while (a < cityArray.length);

        // მეხუთე ამოცანა

        int []myArray = {0, 7, 7, 2, 7, 3, 5};
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int max  = 1;
        int max_value = 0;

        for(int t = 0; t < myArray.length; t++) {
            if (h.get(myArray[t]) != null) {
                int current = h.get(myArray[t]);
                current++;
                h.put(myArray[t], current);

                if(current > max) {
                    max  = current;
                    max_value = myArray[t];
                }
            }
            else
                h.put(myArray[t],1);
        }
        System.out.println(max_value);
    }
}

//   მეორე ამოცანა
//    static boolean firstClass(int x, int y) {
//        if (x == y) {
//            return true;
//        } else {
//            return false;
//        }
//    }
// }

