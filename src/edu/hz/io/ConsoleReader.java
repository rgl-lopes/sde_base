package edu.hz.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    public String leesderegels() {
        try {
            String line = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            return line;
        } catch (IOException var2) {
            return "Onzin input gedetecteerd!!!!!!!";
        }
    }
}