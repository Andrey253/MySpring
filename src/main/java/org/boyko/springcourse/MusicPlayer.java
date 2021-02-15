package org.boyko.springcourse;

public class MusicPlayer {
    private Music music;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    private Integer volume;

    public MusicPlayer(Music music){
        this.music = music;
    }
    public MusicPlayer(){    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println(music.getSong());
    }
}
