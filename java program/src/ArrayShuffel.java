import java.util.Random;

public class ArrayShuffel {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        shuffleArray(array);

        // Print the shuffled array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    // Fisher-Yates shuffle algorithm
    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
