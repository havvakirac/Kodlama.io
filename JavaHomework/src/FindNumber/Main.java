package FindNumber;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 7, 8, 9, 0, 10};
        int find = 7;
        boolean isFound = false;

        for (int num : numbers) {
            if (num == find) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println(find + " Found");
        } else System.out.println(find + " Not Found");

    }
}
