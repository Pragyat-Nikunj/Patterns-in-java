public class HollowTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
           for (int j = 6-i; j > 1; j--) {
            System.out.print(" ");
           }
           for (int j = 1; j <= i; j++) {
            if (i==1||j==1||i==5||j==5||j==i) {
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
           }
           System.out.println();
        }
    }
}
