package day01;

import java.util.Arrays;
import java.util.Scanner;

//猜字符游戏
//随机生成5个不同的英文
//用户输入五个字母
//提示猜对几个位置对的
public class Game {
    public static void main(String[] args) {
        char[] chs = generate();
        char[] input =new char[5];
        Scanner input0 =new Scanner(System.in);

        System.out.println("输入五个字母");
        for (int i =0;i<5;i++){
            String s =input0.next();
            char c =s.charAt(0);
            input[i]=c;
        }
        System.out.println(Arrays.toString(chs));
        int [] result =check(input,chs);
        System.out.println("字符个数"+result[1]+"位置对"+result[0]);
    }
    private static  int[] check(char[]input,char[] chs){
        int []result =new int[2];
        for (int i=0;i<chs.length;i++){
            for (int j=0; j<input.length;j++){
                if (chs[i]==input[j]){
                    result[1]++;
                    if (i==j){
                        result[0]++;
                    }
                    break;
                }
            }
        }
        return result;
    }

    private  static  char[] generate(){
        char [] chs = new char[5];

        char[] letters={'A','B','C','D','E','F','G','H','I','J','K','L','N','M','O','P','Q','R','S','T','U','V','W',
                'X','Y','Z'};
        boolean[] flages= new boolean[letters.length];
        int index=0;
        for (int i=0;i<chs.length;i++){
            //生成随机数,下标
            do {
                index =(int) (Math.random()*letters.length);
            }while (flages[index]);
            chs[i]=letters[index];
            flages[index]= true;
        }

        return chs;

    }
}
