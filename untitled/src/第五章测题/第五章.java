package 第五章测题;

import java.util.Scanner;

public class 第五章 {

public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("请输入被乘除数：");
    try{
        int num1 = in.nextInt();
        System.out.println("请数入被整除数：");
        int num2 = in.nextInt();
        System.out.println(String.format("%d/%d=%d",num1,num2,num1/num2));
    }catch (Exception e){
        System.out.println("你的输入有误");
    }finally {
        System.out.println("感谢使用本程序");
    }

}


}
