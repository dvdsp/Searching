
package Common;


import java.util.Scanner;
import java.util.Random;


public class Library {

    public int getInt(String promt, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public int[] createArray(int size_Array) {
        int[] array = new int[size_Array];
        Random rd = new Random();
        for (int i = 0; i < size_Array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }
    
    public int checkInt(String number){
       int n = -1;
       while (true) {
           System.out.println(number);
           try{
               n = Integer.parseInt(new Scanner(System.in).nextLine());
           }catch (NumberFormatException e) {
               System.out.println("Invalid number, please enter again!");
               continue;
           }
           break;
       }
       return n;
    }
    

}

