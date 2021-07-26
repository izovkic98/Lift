package com.ivanzovkic;

public class TrećiKat implements StanjaDizala {

    Dizalo dizalo;

    public TrećiKat(Dizalo dizalo) {
        this.dizalo = dizalo;
    }

    @Override
    public void spustanje(int brojKata) throws InterruptedException {

        if (brojKata == 0) {
            System.out.println("Dizalo se spušta u prizemlje.");
            for(int i=0;i<6;i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            dizalo.setKatDizala(dizalo.prizemlje());
        } else if (brojKata == 1) {
            System.out.println("Dizalo se spušta na prvi kat.");
            for(int i=0;i<4;i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            dizalo.setKatDizala(dizalo.prviKat());
        } else if (brojKata == 2) {
            System.out.println("Dizalo se spušta na drugi kat.");
            for(int i=0;i<3;i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
            dizalo.setKatDizala(dizalo.drugiKat());
        }else if (brojKata == 3) {
//            System.out.println("Krivi unos. Dizalo je vec na trecem katu.");
        }

    }

    @Override
    public void dizanje(int brojKata) {
        System.out.println("Dizalo se ne može dizati više, posljednji kat!!!");
//      posljednji kat gore
    }

    @Override
    public void nalaženje() {
        System.out.println("Dizalo se nalazi na trecem katu.");

    }

    @Override
    public void zatvaranje() {
        System.out.println("---->||<---- Zatvaranje vrata na trecem katu.");
    }

    @Override
    public void otvaranje() {
        System.out.print("<----||----> Otvaranje vrata na trecem katu.");
    }
}
