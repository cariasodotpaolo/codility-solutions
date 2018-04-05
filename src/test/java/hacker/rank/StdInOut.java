package hacker.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdInOut {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);*/

        StdInOut sio = new StdInOut();

        sio.oddNumbers(2, 5);
    }

    public int[] oddNumbers(int l, int r) {


        List<Integer> intList = new ArrayList();

        for (int s = l ; s <= r ; s++ ) {

            if (s%2 == 1) {
                intList.add(s);
            }
        }

        int[] intArr = new int[intList.size()];

        for (int i = 0 ; i < intList.size() ; i++ ) {

            intArr[i] = intList.get(i).intValue();

        }

        return intArr;

    }
}
