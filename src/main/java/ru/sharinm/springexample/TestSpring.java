package ru.sharinm.springexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println("--------------------------------");

        musicPlayer = context.getBean("musicPlayer1", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        System.out.println("--------------------------------");

        musicPlayer = context.getBean("musicPlayer2", MusicPlayer.class);
        musicPlayer.playMusicList();

        context.close();
    }
}
