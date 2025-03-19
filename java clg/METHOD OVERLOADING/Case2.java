public class Case2 {
    public static void main(String[] args) {
        Case2 obj = new Case2();
        obj.add(3.4f,1);
        obj.add(3.4f,1.8f);
        obj.add(3,1.4f);
        obj.add(3,1);
    }    
    public void add (int a, float b){
        System.out.println(a+b);
    }
    public void add(float a, float b){
        System.out.println(a+b);
    }
    public void add(float a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
