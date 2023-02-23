/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author herib
 */

public class Musik {
    private static String filename;
    static Player player;
    public static void play() {
        try {
            FileInputStream fis     = new FileInputStream("src\\mp3\\Best Music 2020 Mix Best of EDM Gaming Music Trap, Rap, Bass, Dubstep, DnB, Electro House.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + filename);
            System.out.println(e);
        }

        // memutar musik pada background
        new Thread() {
            @Override
            public void run() {
                try {player.play();
                      //player.play();

                }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
    }
    public void close()
       {
           player.close();
       }
}
class abin extends Musik{
private static String filename1;
    static Player player1;
    public static void play() {
        try {
            FileInputStream fis     = new FileInputStream("src\\mp3\\ABSENSI MASUK_2.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player1 = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + filename1);
            System.out.println(e);
        }

        // memutar musik pada background
        new Thread() {
            @Override
            public void run() {
                try {player1.play();
                      //player.play();

                }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
    }
@Override
    public void close()
       {
           player1.close();
       }
}
class abot extends Musik{
private static String filename12;
    static Player player12;
    public static void play() {
        try {
            FileInputStream fis     = new FileInputStream("src\\mp3\\ABSENSI PULANG_2.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player12 = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + filename12);
            System.out.println(e);
        }

        // memutar musik pada background
        new Thread() {
            @Override
            public void run() {
                try {player12.play();
                      //player.play();

                }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
    }
@Override
    public void close()
       {
           player12.close();
       }
}
class mcuti extends Musik{
private static String filename12;
    static Player player12;
    public static void play() {
        try {
            FileInputStream fis     = new FileInputStream("src\\mp3\\CUTI_2.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            player12 = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + filename12);
            System.out.println(e);
        }

        // memutar musik pada background
        new Thread() {
            @Override
            public void run() {
                try {player12.play();
                      //player.play();

                }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
    }
@Override
    public void close()
       {
           player12.close();
       }
}