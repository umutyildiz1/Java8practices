package DesignPatterns.structuralpatterns.facade.impl;

public class MovieFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private BluRayPlayer bluRayPlayer;

    public MovieFacade(TV tv, SoundSystem soundSystem, BluRayPlayer bluRayPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.bluRayPlayer = bluRayPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Film izleme işlemi başlatılıyor...");
        tv.on();
        soundSystem.on();
        soundSystem.setVolume(10);
        bluRayPlayer.on();
        bluRayPlayer.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Film izleme işlemi sonlandırılıyor...");
        bluRayPlayer.off();
        soundSystem.off();
        tv.off();
    }
}
