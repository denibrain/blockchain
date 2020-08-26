import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        boolean dirDetected = false;
        boolean asc = false;
        int prev = 0;
        boolean correct = true;
        while (a !=0){
            if (prev != 0) {
               if (!dirDetected) {
                   if (prev != a) {
                       dirDetected = true;
                       asc = prev < a;
                   }
               } else if (prev != a){
                   if ((asc && prev > a) || (!asc && prev < a)) {
                       correct = false;
                       break;
                   }
               }
            }
            prev = a;
            a = scanner.nextInt();
        }
        System.out.println(correct);
    }
}