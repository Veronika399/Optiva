package com.journaldev.design.chainofresponsibility;

public interface YearChain {
    void setNextChain(YearChain nextChain);
    void year(Current cur);
}
