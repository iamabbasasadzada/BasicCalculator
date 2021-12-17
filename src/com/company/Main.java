package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Emeli secin");
        System.out.println("1=+"+"\n"+"2=-"+"\n"+"3=*"+"\n"+"4=//");
        String ch=scn.nextLine();
        if(ch.equals("+")){
            System.out.println("toplamaq istediyiniz ededleri yazin");
            double a=scn.nextDouble();
            double b = scn.nextDouble();
            System.out.println(Main.Plus(a,b));
        }
        else if(ch.equals("-")){
            System.out.println("cixani daxil edin");
            double a=scn.nextDouble();
            System.out.println("cixilani dail edin");
            double b = scn.nextDouble();
            System.out.println(Main.Minus(a,b));
        }
        else  if(ch.equals("*")){
            System.out.println("vurmaq istediyiniz ededleri yazin");
            double a=scn.nextDouble();
            double b = scn.nextDouble();
            System.out.println(Main.Multi(a,b));
        }
        else   if(ch.equals("//")){
            System.out.println("Boluneni daxil edin");
            double a=scn.nextDouble();
            System.out.println("Boleni daxil edin");
            double b = scn.nextDouble();
            System.out.println(Main.Division(a,b));
        }
    }

    public static double Plus(double a , double b){
        double c = a + b;
        return c;
    }
    public static double Minus(double a , double b){
        double c = a-b ;
        return c;
    }
    public static double Multi(double a , double b){
        double c = a * b;
        return c;
    }
    public static double Division(double a , double b){
        double c = a / b ;
        return c;
    }
}

