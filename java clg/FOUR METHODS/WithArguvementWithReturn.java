public class WithArguvementWithReturn {
    int a=10;
    int b=20;
    public static void main(String[] args){
        WithArguvementWithReturn ArgRet = new WithArguvementWithReturn();
      System.out.println(ArgRet.sumOutput(10, 20));
    }


//with argument with return
float sumOutput(float a, float b){
    return a+b;

}
}