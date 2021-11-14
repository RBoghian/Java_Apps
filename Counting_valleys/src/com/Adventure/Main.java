package com.Adventure;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {

int valleys = 0;
        int decode[] = new int[steps+1];
        decode[0] = 0;
        for(int i = 0; i< steps-1; i++){
            if(path.charAt(i)== 'D'){
decode[i+1] = decode[i] -1;
            }else{
                decode[i+1] = decode[i] +1;
            }
        }
       for(int j =0; j<decode.length; j++){
           if((decode[j]== -1)&&(decode[j+1]==0)){
               valleys++;
           }
       }
       return valleys;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
