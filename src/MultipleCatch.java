import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 1. Read array size
            int n = sc.nextInt();
            int[] arr = new int[n];

            // 2. Fill the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // 3. Read index and divisor
            int index = sc.nextInt();
            int divisor = sc.nextInt();

            // 4. Perform operation
            // This line can trigger TWO different exceptions
            int result = arr[index] / divisor;
            
            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Triggered if the index is outside [0, n-1]
            System.out.println("Invalid Index");
        } catch (ArithmeticException e) {
            // Triggered if divisor is 0
            System.out.println("Divide by zero error");
        } finally {
            sc.close();
        }
    }
}
