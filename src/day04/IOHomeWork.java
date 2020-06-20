package day04;

import java.io.*;

public class IOHomeWork {
    public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub

//StringBuffer:字符串缓冲对象

/**
 * InputStream 抽象类
 * -FileInputStream 文件输入流
 * -BufferedInputStream 缓冲区输入流
 *
 * OutputStrean 抽象类
 * -FileOutputStream 文件输出流
 * -BufferedOutputStream 缓冲区输出流
 * **/

//BufferedInputStream[缓冲区输入流]和BufferedOutputStream[缓冲区输出流]
/*这两个流是内置了缓冲区流,也就是说内部有一个 字节数组
缓冲思想
字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
java本身在设计的时候,加入了数组这样的缓冲区效果，*/

//拷贝mp3文件
//1.创建两个文件路径
        String file1 = "a.txt";
        String file2 = "b.txt";

//2.使用带缓冲区的输入输出流来读写数组
//2.1声明一个缓冲区输入流
        FileInputStream fis = new FileInputStream(file1);
        BufferedInputStream bis = new BufferedInputStream(fis);

//2.2声明一个缓冲区输出流
        FileOutputStream fos = new FileOutputStream(file2);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

//2.3 输入流读数据，输出流写数据
        int b = 0;
//这个bis.read()它不是读一个字节，内部是读8192个字节
        while(( b = bis.read()) != -1){
//System.out.println(b);
//输出流写数据
            bos.write(b);
        }

//关闭缓冲流
        bis.close();//内部会关闭fis 流
        bos.close();//内部会关闭 fos 流

        System.out.println("文件拷贝完成");
    }

}
