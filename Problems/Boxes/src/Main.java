import java.util.*;

public class Main {

    public static boolean in(int[] box1, int[] box2) {
        for(int j=0; j<box2.length; j++) {
            if (box1[0] >= box2[j]) {
                for(int k=0; k<box2.length; k++) {
                    if (k!=j) {
                        if (box1[1] >= box2[k]) {
                            for(int i=0; i<box2.length; i++) {
                                if (i!=k && i!=j && box1[2] >= box2[i]) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for(int i = 0; i<box1.length; i++) {
            box1[i] =  scanner.nextInt();
        }
        for(int i = 0; i<box2.length; i++) {
            box2[i] =  scanner.nextInt();
        }
        boolean case1 = Main.in(box1, box2);
        boolean case2 = Main.in(box2, box1);


        System.out.println(case1 && case2 ? "Box 1 = Box 2": case1 ? "Box 1 > Box 2" : case2 ?  "Box 1 < Box 2" : "Incomparable");
    }
}