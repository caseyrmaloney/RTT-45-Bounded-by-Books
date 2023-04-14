import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        List<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(3);
        arr2.add(2);
        arr2.add(1);

       System.out.print( minimumMoves(arr1, arr2) );

    }

    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2){
        int moves =0;
        Integer num;


        //iterating through the arrays
        for ( int i =0; i< arr1.size(); i++){
            num= arr1.get(i);
            int x = arr1.get(i);
            int y = arr2.get(i);

            if(num > y) {
                while (x>y) {
                    x--;
                    moves++;
                    continue;
                }
            }
            else if(num < y) {
                while(x<y) {
                    x++;
                    moves++;
                    continue;
                }
            }


        }
        return moves;

    }


}