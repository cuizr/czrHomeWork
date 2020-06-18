package day01;

import java.util.Scanner;

public class Jiou {
    public static void main(String[] args) {
        int [] input = new int[8];
        Scanner input0 =new Scanner(System.in);
        System.out.println("输入数字");
        int ous=0;
        int jis=0;
        for (int i=0;i<input.length;i++){
            input[i]=input0.nextInt();
            if (input[i]%2==0){
                ous++;
            }else jis++;
        }
        int [] ou =new int[ous];
        int [] ji =new int[jis];
        int p=0,q=0;
        for (int i=0;i<input.length;i++){

            if (input[i]%2==0){
                ou[p]=input[i];
                p++;
            }else {
                ji[q]=input[i];
                q++;
            }
        }
        if (ji.length>ou.length){//奇数多
            for (int i=0;i<ou.length;i++){
                System.out.print(ji[i]+" "+ou[i]+" ");
            }
            for (int i=ou.length; i<ji.length;i++){
                System.out.print(ji[i]+" ");
            }
        }
        if (ji.length<ou.length){//偶数多
            for (int i=0;i<ji.length;i++){
                System.out.print(ji[i]+" "+ou[i]+" ");
            }
            for (int i=ji.length; i<ou.length;i++){
                System.out.print(ou[i]+" ");
            }
        }
        if(ji.length==ou.length){
            for (int i=0;i<ji.length;i++){
                System.out.print(ji[i]+" "+ou[i]+" ");
            }
        }
    }

}
