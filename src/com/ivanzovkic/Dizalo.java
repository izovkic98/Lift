package com.ivanzovkic;

public class Dizalo {


    Prizemlje prizemlje;
    PrviKat prviKat;
    DrugiKat drugiKat;
    TrećiKat treciKat;
    StanjaDizala dizalo;
    StanjaDizala test;



    public Dizalo(){

        prizemlje=new Prizemlje(this);
        prviKat=new PrviKat(this);
        drugiKat=new DrugiKat(this);
        treciKat=new TrećiKat(this);

        dizalo=prizemlje;


    }


    public void spustanje(int brojKata) throws InterruptedException {
        dizalo.spustanje(brojKata);
    }

    public void dizanje(int brojKata) throws InterruptedException {
        dizalo.dizanje(brojKata);
    }

    public void nalaženje(){
        dizalo.nalaženje();
    }

    public void setKatDizala(StanjaDizala noviKat){
        dizalo=noviKat;

    }

    public StanjaDizala prizemlje(){
        return prizemlje;
    }

    public StanjaDizala drugiKat(){
        return drugiKat;
    }

    public StanjaDizala treciKat(){
        return treciKat;
    }

    public StanjaDizala prviKat(){
        return prviKat;
    }

    public void otvaranje(){
        dizalo.otvaranje();
    }

    public void zatvaranje(){
        dizalo.zatvaranje();
    }



}













