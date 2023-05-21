package com.journaldev.design.chainofresponsibility;
import java.util.Scanner;
public class MainYearChain {
    private YearChain y1;

    public MainYearChain(){
        this.y1=new less18year();
        YearChain y2=new Between18and65year();
        YearChain y3 =new more65year();
        y1.setNextChain(y2);
        y2.setNextChain(y3);
    }

    public static void main(String[] args){
        MainYearChain mainyear= new MainYearChain();
        while(true){
            int year=0;
            System.out.println("Unesite broj Vaših godina");
            Scanner putIn= new Scanner(System.in);
            year=putIn.nextInt();
            if(year < 0 ){
                System.out.println("Nevaljani unos godina");
                return;
            }
            mainyear.y1.year(new Current(year));
        }
    }
}
