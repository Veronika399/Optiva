package com.journaldev.design.chainofresponsibility;

public class less18year implements YearChain{

    private YearChain chain;

    @Override
    public void setNextChain(YearChain nexChain){
        this.chain=nexChain;
    }

    @Override
    public void year(Current cur){
        if(cur.getYears() < 18){
            System.out.println("Pripadate grupi maloljetnih osoba!");
        }
        else {this.chain.year(cur);}
    }

    
}
