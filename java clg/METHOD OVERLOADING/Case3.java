public class Case3 {
    public static void main(String[] args) {
        Case3 obj = new Case3();
        obj.profile(18, "vishal");
        obj.profile("vishal", 18);
    }   
    public void profile(String name,int age){
        System.out.println(name);
        System.out.println(age);
    } 
    public void profile(int age,String name){
        System.out.println(name);
        System.out.println(age);
    } 
}
