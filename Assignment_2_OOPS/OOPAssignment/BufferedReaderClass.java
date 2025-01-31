/*Write a Java program to implement BufferedReader class */

import java.io.*;


public class BufferedReaderClass {
        public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, " + name + "!");
    }

}
