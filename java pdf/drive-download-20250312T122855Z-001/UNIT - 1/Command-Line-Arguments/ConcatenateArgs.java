class ConcatenateArgs {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        for (String arg : args) {
            result.append(arg).append(" ");
        }
        System.out.println("Concatenated String: " + result.toString().trim());
    }
}
