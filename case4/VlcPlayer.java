////1.Performing multiple task from multiple thread

package case4;

class PlayVideo extends Thread {
    public void run() {
        System.out.println("Playing Video!");
    }

}

class PlayMusic extends Thread {
    public void run() {
        System.out.println("Playing Music!");
    }

}

class PlayProgressbar extends Thread {
    public void run() {
        System.out.println("Playing PlayProgressbar!");
    }

}

public class VlcPlayer {
    public static void main(String[] args) {
        System.out.println(" ******welcome to Vlc media Playaer***");
        PlayVideo t1 = new PlayVideo();
        PlayMusic t2 = new PlayMusic();
        PlayProgressbar t3 = new PlayProgressbar();
        t1.start();
        t2.start();
        t3.start();

    }

}
