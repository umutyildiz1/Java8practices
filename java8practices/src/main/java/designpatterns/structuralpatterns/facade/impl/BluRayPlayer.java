package DesignPatterns.structuralpatterns.facade.impl;

public class BluRayPlayer {
    public void on() {
        System.out.println("BluRay oynatıcı açıldı.");
    }
    public void playMovie(String movie) {
        System.out.println(movie + " oynatılıyor.");
    }
    public void off() {
        System.out.println("BluRay oynatıcı kapandı.");
    }
}
