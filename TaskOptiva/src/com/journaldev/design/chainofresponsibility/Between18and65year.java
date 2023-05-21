package com.journaldev.design.chainofresponsibility;

public class Between18and65year implements YearChain{
    private YearChain chain;

    @Override
    public void setNextChain(YearChain nextChain){
        this.chain=nextChain;
    }

    @Override
    public void year(Current cur){
        if(cur.getYears() >=18 && cur.getYears()<=65){
            System.out.println("Pripadate u grupu radničke snage");
        }
        else{ this.chain.year(cur);}
    }
    
}
