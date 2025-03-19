

public class WithArguvementWithoutReturnType {
    int a=10;
    int b=20;
    public static void main(String[] args){
        WithArguvementWithoutReturnType ArgRet = new WithArguvementWithoutReturnType();
        ArgRet.sum(10,20);
    }
//WITH ARGUMENT WITHOUT RETURN;
void sum(int a,int b){
    System.out.println(a+b);
}
}