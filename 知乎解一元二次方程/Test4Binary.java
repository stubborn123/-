package test;

import java.util.Scanner;

/**
 * 二元一次方程
 */
public class Test4Binary {


    private Boolean hadResult(int a,int b, int c ){
        if((b*b -4*a*c) >= 0){
            return false;
        }else{
            return true;
        }
    }

    private double[] doCalculate(int a,int b,int c){
        double[] results =new double[2];
        double resultOne =   (-b + Math.sqrt(b*b -4*a*c))*1/(2*a);
        double resultTwo =   (-b - Math.sqrt(b*b -4*a*c))*1/(2*a);

        results[0] = resultOne;
        System.out.println("解1为：" + resultOne);
        results[1] = resultTwo;
        System.out.println("解2为：" + resultTwo);
        return results;
    };

    private double[] calculate(int a, int b , int c ){

        if(hadResult(a,b,b)){
            return doCalculate(a,b,c);
        }else{
            double[] result = {};
            return result;
        }

    }

    public static void main(String[] args) {

        int a ,b ,c;
        while (true){
            System.out.println("解二元一次方程：输入a值： ");
            Scanner scA = new Scanner(System.in);
            a = scA.nextInt();
            System.out.println("解二元一次方程：输入b值： ");
            Scanner scB = new Scanner(System.in);
            b = scB.nextInt();
            System.out.println("解二元一次方程：输入c值： ");
            Scanner scC = new Scanner(System.in);
            c = scC.nextInt();

            Test4Binary t = new Test4Binary();

            if(t.hadResult(a,b,c)){
                System.out.println("无解");
            }else{
                System.out.println("有解，且结果为： ");
                t.doCalculate(a,b,c);
                return;
            }
        }

    }




}
