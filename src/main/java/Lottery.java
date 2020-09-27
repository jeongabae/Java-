//import java.io.*;
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Lottery {
//    public static void main(String[] args) {
//
//        try {
//
//            File file = new File("/Users/jeongabae/IdeaProjects/homework/src/main/java/text1.txt");
//
//            FileReader filereader = new FileReader(file);
//
//            BufferedReader bufReader = new BufferedReader(filereader);
//            String line = "";
//            ArrayList<String> lotteryNum = new ArrayList<>();
//            ArrayList<String> num = new ArrayList<>();
//
//            while ((line = bufReader.readLine()) != null) {
//                lotteryNum.add(line);
//                if (line.indexOf(",") == -1)
//                    num.add(line);
//                //System.out.println(line);
//            }
//
//            System.out.println(num);
//            //    if (line.indexOf())
//
//            bufReader.close();
//        } catch (FileNotFoundException e) {
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//    }
//
//
//
//
//
//}

import java.io.*;

public class Lottery {
    public static void main(String[] args) {
        String a = "";

        try {

            FileReader fr = new FileReader("/Users/jeongabae/IdeaProjects/homework/src/main/java/text1.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            while ((line = br.readLine()) != null) {
                if (line.trim().length() > 0) {
                    a += line + ",";
                }
            }
            //System.out.println("line : "+a);
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String[] fileNum = a.split(",");
//        int[] userNUm = new int[fileNum.length];
//        for (int i=0;i<fileNum.length;i++){
//            userNum[i] =Integer.parseInt(fileNum[i]);
//        }
        for (int i = 0; i < fileNum.length; i++) {
            System.out.println(fileNum[i]);
        }


    }
}
