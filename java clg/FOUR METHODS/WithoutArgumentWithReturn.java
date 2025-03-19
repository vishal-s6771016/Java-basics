

public class WithoutArgumentWithReturn {
    int a=10;
    int b=20;
    public static void main(String[] args){
        WithoutArgumentWithReturn ArgRet = new WithoutArgumentWithReturn();
        System.out.println(ArgRet.add());
    }

//without argument with return
int add(){
    return a+b;
}


}