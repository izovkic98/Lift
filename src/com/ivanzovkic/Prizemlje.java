package com.ivanzovkic;

public class Prizemlje implements StanjaDizala{

    Dizalo dizalo;


    public Prizemlje(Dizalo dizalo) {
        this.dizalo = dizalo;
    }


    @Override
    public void spustanje(int brojKata) {
//      posljednji kat dole
        System.out.println("Dizalo se ne može spuštati više, prizemlje!!!");

    }

    @Override
    public void dizanje(int brojKata) throws InterruptedException {
        if (brojKata == 1) {
            System.out.println("Dizalo se diže na prvi kat.");
            for(int i=0;i<3;i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            dizalo.setKatDizala(dizalo.prviKat());
        } else if (brojKata == 2) {
            System.out.println("Dizalo se diže na drugi kat.");
            for(int i=0;i<4;i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            dizalo.setKatDizala(dizalo.drugiKat());
        } else if (brojKata == 3) {
            System.out.println("Dizalo se diže na treci kat.");
            for(int i=0;i<6;i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            dizalo.setKatDizala(dizalo.treciKat());
        } else if (brojKata == 0) {
            System.out.println("Dizalo se ne može spuštati više, prizemlje!!!");

        }

    }

    @Override
    public void nalaženje() {
        System.out.println("Dizalo se nalazi u prizemlju.");
        dizalo.setKatDizala(dizalo.prizemlje());

    }

    @Override
    public void zatvaranje() {
        System.out.println("---->||<---- Zatvaranje vrata u prizemlju.");
    }

    @Override
    public void otvaranje() {
        System.out.print("<----||----> Otvaranje vrata u prizemlju.");
    }
}
