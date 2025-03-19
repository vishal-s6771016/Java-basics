class EvenOddCLI {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }
        int num = Integer.parseInt(args[0]);
        System.out.println(num % 2 == 0 ? "Even" : "Odd");
    }
}
