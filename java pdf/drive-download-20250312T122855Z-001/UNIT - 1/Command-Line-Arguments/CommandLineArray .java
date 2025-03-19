public class CommandLineArray {
    public static void main(String[] args) {
        // Check if there are any command-line arguments
        if (args.length == 0) {
            System.out.println("No input provided! Please enter array elements as command-line arguments.");
            return;
        }

        // Create an integer array of size equal to the number of arguments
        int[] arr = new int[args.length];

        // Convert string arguments to integers and store in array
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]); // Convert string to integer
        }

        // Print the array elements
        System.out.println("Array elements entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
