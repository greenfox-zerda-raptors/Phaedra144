package com.todolist.szilvi;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ${SzilviaB} on 2016. 11. 17..
 */
public class FileI_O {
    public static String basePath = "/F:/Szilvia/Greenfox/Phaedra144/week-05/w5-day04/";
    File sourceFile = new File("toDoList.csv");
    BufferedReader reader;

    public File fileCreator() throws IOException, FileNotFoundException {
        if (!sourceFile.exists()) {

            sourceFile.createNewFile();

        }
        this.reader = new BufferedReader(new FileReader(sourceFile));
        return sourceFile;
    }

    public String readLine() throws IOException {

        return this.reader.readLine();
    }


}
