package assistedproject2;

import java.io.*;
class demo extends Thread {
    public void run()
    {
        System.out.print("Welcome to thread implementation.");
    }
    public static void main(String[] args)
    {
        demo d = new demo(); // creating thread
        d.start(); // starting thread
    }
}


