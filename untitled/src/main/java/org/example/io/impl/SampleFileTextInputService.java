package org.example.io.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.example.io.TextInputService;

public class SampleFileTextInputService implements TextInputService {
    private static final String FILE_NAME = "C:\\Users\\Work\\Development\\BlackRockXFlatiron\\Week4\\Lab\\StreamChallengePractice\\untitled\\book.txt";
    @Override
    public String getText() {
        try{
            Path path =  Path.of(FILE_NAME);
            String content = Files.readString(path);
            return  content;

        } catch (IOException ioException){
            System.out.println("Something when wrong");
            
        }
        return null;
    }


}
