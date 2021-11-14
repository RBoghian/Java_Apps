package com.Adventure;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        try{
//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);
            Path dirToCreate = FileSystems.getDefault().getPath("Examples","Dir4");
            Files.createDirectory(dirToCreate);

        }catch(IOException e){
            e.printStackTrace();
        }


    }

//Path path = FileSystems.getDefault().getPath("WorkingDirectoryFile.txt");
//printFile(path);
//Path filePath = FileSystems.getDefault().getPath("files","SubdirectoryFile.txt");
//printFile(filePath);
//filePath = Paths.get("C:\\Users\\Cretu\\Desktop\\InfoAcademy\\Udemy\\Tim\\OutThere.txt");
//printFile(filePath);
//filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path3 = FileSystems.getDefault().getPath("noexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//
//
//
//    }
//
//    private static void printFile(Path path){
//
//        try(BufferedReader fileReader = Files.newBufferedReader(path)){
//            String line;
//                    while((line = fileReader.readLine())!=null){
//                        System.out.println(line);
//                    }
//        }catch (IOException e){
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
