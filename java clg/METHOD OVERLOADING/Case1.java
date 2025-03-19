public class Case1 {
    public static void main(String[] args) {
        Case1 obj = new Case1();
        obj.area(10);
        obj.area(20, 10);

    }
    void area(int radius){
        System.out.println("Circle: " +(3.14*radius*radius));
    }
    void area(int n1,int n2){
        System.out.println("Triangle: " +(0.5*n1*n2));
    }
    
}
