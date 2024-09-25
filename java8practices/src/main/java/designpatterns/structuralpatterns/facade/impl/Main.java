package DesignPatterns.structuralpatterns.facade.impl;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        BluRayPlayer bluRayPlayer = new BluRayPlayer();

        MovieFacade homeTheater = new MovieFacade(tv, soundSystem, bluRayPlayer);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
