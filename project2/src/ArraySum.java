public class ArraySum {
    public static void main(String[] args) {
        int[] num  = {-1,0,1,3,5,-2,2};
        int pairSum = 3;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == pairSum) {
                    System.out.println("Found Pair (" + num[i] + "," + num[j]+")");
                }
            }
        }
    }
}
