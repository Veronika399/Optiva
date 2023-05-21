package com.journaldev.design.chainofresponsibility;

public class more65year implements YearChain{
    private YearChain chain;

    @Override
    public void setNextChain(YearChain nexChain){
        this.chain=nexChain;
    }
    
    @Override
    public void year(Current cur){
        if(cur.getYears()>65){
            System.out.println("Pripadate skupin umirovljenika");
        }
        else{
            this.chain.year(cur);
        }
    }
}
