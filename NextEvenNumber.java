/*Given a natural number, not greater than 10000. Output the even number following this number.

Hint: Try to write formula using the modulo operator %.*/


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numb = scanner.nextInt();
        int nextEven = numb + (2 - (numb % 2));
        System.out.println(nextEven);
        
    }
}
