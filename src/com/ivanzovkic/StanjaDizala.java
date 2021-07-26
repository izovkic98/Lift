package com.ivanzovkic;

public interface StanjaDizala {

    void spustanje(int brojKata) throws InterruptedException;
    void dizanje(int brojKata) throws InterruptedException;
    void nalaženje();
    void zatvaranje();
    void otvaranje();

}
