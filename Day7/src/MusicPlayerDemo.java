// PROG 5: Interface Demonstration with Spotify and Gaana
import java.util.*;

public class MusicPlayerDemo {

    public interface MusicPlayer {
        void play();
        void stop();
        void change();
        void increaseVol();
    }

    public static class Spotify implements MusicPlayer {
        public void play() {
            System.out.println("Spotify: play music");
        }
        public void stop() {
            System.out.println("Spotify: stop music");
        }
        public void change() {
            System.out.println("Spotify: change song");
        }
        public void increaseVol() {
            System.out.println("Spotify: volume increased");
        }
    }

    public static class Gaana implements MusicPlayer {
        public void play() {
            System.out.println("Gaana: play music");
        }
        public void stop() {
            System.out.println("Gaana: stop music");
        }
        public void change() {
            System.out.println("Gaana: change song");
        }
        public void increaseVol() {
            System.out.println("Gaana: volume increased");
        }
    }

    public static void main(String[] args) {
        Spotify spot = new Spotify();
        spot.play();
        spot.stop();
        spot.change();
        spot.increaseVol();

        Gaana gaanaPlay = new Gaana();
        gaanaPlay.play();
        gaanaPlay.stop();
        gaanaPlay.change();
        gaanaPlay.increaseVol();
    }
}

/*
Test Cases:
- Should print the sequence of actions for both Spotify and Gaana with clear labels.
*/
