package day01;

public class HomeWork {
    public static void main(String[] args) {

        triangle();
        primeSum();
    }
//等腰三角形
    public static void triangle(){
        int n=4;
        for (int i=0;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //100内质数的和
    public static void primeSum(){
        int sum=0;
        for (int i=2 ;i<=100;i++){
            boolean bool = true;
            for (int j=2 ; j<=Math.sqrt(i);j++){
                if(i%j==0){
                    bool =false;
                    break;
                }
            }
            if (bool == true){
                sum+=i;
            }
        }
        System.out.println("1-100的质数和为"+sum);
    }
}
