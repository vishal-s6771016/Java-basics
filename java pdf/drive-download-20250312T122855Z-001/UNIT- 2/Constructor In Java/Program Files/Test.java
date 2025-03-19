public class Test {
    int a, b;

    // Constructor with parameters
    public Test(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public void display() {
        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        Test obj1 = new Test(10, 20); // ✅ This will work

        Test obj2 = new Test(); // ❌ Compilation Error: Constructor Test() is undefined
    }
}
