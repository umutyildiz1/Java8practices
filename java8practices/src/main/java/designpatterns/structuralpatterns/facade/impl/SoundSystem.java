package DesignPatterns.structuralpatterns.facade.impl;

public class SoundSystem {
    public void on() {
        System.out.println("Ses sistemi açıldı.");
    }
    public void setVolume(int level) {
        System.out.println("Ses seviyesi " + level + " olarak ayarlandı.");
    }
    public void off() {
        System.out.println("Ses sistemi kapandı.");
    }
}
