/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.io.*;
import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
public class fileData {
    public static String userData = "src/data/textData/userData.txt";
    public static String userLogin = "src/data/textData/userLogin.txt";
    public static String answer = "src/data/textData/answer.txt";
    public static String deThi = "src/data/textData/deThi.txt";
    public static String deThi2 = "src/data/textData/deThi2.txt";
    public static String deThi3 = "src/data/textData/deThi3.txt";
    public static String history = "src/data/textData/history.txt";
    public static String setTime = "src/data/textData/setTime.txt";
    public static String avatar = "src/data/textData/avatar.txt";
    public static int maxLT =15;
    
    public static void readHistory(LinkedList<String> allHistory) throws IOException{
        InputStream inputStream = new FileInputStream(history);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "" ,line1 ="";
        String s ="";
        while((line = reader.readLine()) != null){
            line1 = reader.readLine();
            s = s +line+"  " +line1;
            allHistory.addFirst(s);
            s ="";
        }
    }
    public static void setDe2(varData de,int d,int c) throws  IOException{
        int maxCau =0;
        String deThix ="";
        if (d==15)
             deThix = deThi2;
        else
            deThix = deThi3;
        InputStream inputStream1 = new FileInputStream(deThix);
        InputStreamReader inputStreamReader1 = new InputStreamReader(inputStream1);
        BufferedReader reader1 = new BufferedReader(inputStreamReader1);
        String line1 = "";
        while((line1 = reader1.readLine()) != null){
                 maxCau++;
                 reader1.readLine();
                 reader1.readLine();
                 reader1.readLine();
                 reader1.readLine();
                 reader1.readLine();
                 reader1.readLine();
        }
        Random random = new Random();
        int[] ran = new int[maxCau];
        for(int i=0;i<maxCau;i++){
            ran[i] =i;
        }
        int maxcau = maxCau;
        for(int v =d;v<c;v++){
            int gt = random.nextInt(maxcau);
            InputStream inputStream = new FileInputStream(deThix);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = "";
            String dapAn ="";
            String id ="";
            int dem=0;
            while(dem<ran[gt]){
                 dem++;
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
            }
            de.id[v] = reader.readLine();
            de.cauHoi[v]= reader.readLine();
            de.cauA[v] = reader.readLine();
            de.cauB[v] = reader.readLine();
            de.cauC[v] = reader.readLine();
            de.cauD[v] = reader.readLine();
            dapAn =reader.readLine();
            if(dapAn != null || dapAn.length()>0)
               de.dapAn[v] = dapAn.codePointAt(0) -48;
            int x2 = ran[gt];
            ran[gt] = ran[maxcau-1];
            ran[maxcau-1] =x2;
            maxcau--;
        }
//        for(int i=d;i<c;i++){
//            System.out.println(i);
//            System.out.println(de.id[i]);
//            System.out.println(de.cauHoi[i]);
//            System.out.println(de.cauA[i]);
//            System.out.println(de.cauB[i]);
//            System.out.println(de.cauC[i]);
//            System.out.println(de.cauD[i]);
//            System.out.println(de.dapAn[i]);
//            System.out.println();
//        }
    }
    public static void setDe(varData de) throws  IOException{
        int maxCau =0;
        InputStream inputStream1 = new FileInputStream(deThi);
        InputStreamReader inputStreamReader1 = new InputStreamReader(inputStream1);
        BufferedReader reader1 = new BufferedReader(inputStreamReader1);
        String line1 = "";
        while((line1 = reader1.readLine()) != null){
                 maxCau++;
                 reader1.readLine();
                 reader1.readLine();
                 reader1.readLine();
                 reader1.readLine();
        }
        Random random = new Random();
        int[] ran = new int[maxCau];
        for(int i=0;i<maxCau;i++){
            ran[i] =i;
        }
        int maxcau = maxCau;
        for(int v =0;v<maxLT;v++){
            int gt = random.nextInt(maxcau);
            InputStream inputStream = new FileInputStream(deThi);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = "";
            String dapAn ="";
            int dem=0;
            while(dem<ran[gt]){
                 dem++;
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
                 reader.readLine();
            }
            de.cauHoi[v]= reader.readLine();
            de.cauA[v] = reader.readLine();
            de.cauB[v] = reader.readLine();
            de.cauC[v] = reader.readLine();
            dapAn =reader.readLine();
            if(dapAn != null || dapAn.length()>0)
               de.dapAn[v] = dapAn.codePointAt(0) -48;
            int x2 = ran[gt];
            ran[gt] = ran[maxcau-1];
            ran[maxcau-1] =x2;
            maxcau--;
        }
    }
    public static String checkUserLogin() throws FileNotFoundException, IOException{
        InputStream inputStream = new FileInputStream(userLogin);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "";
        line = reader.readLine();
        return line;
    }
    public static void addHistory(String name,int diem,int time,String timeSubmit) throws IOException{ 
        OutputStream outputStream = new FileOutputStream(history,true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(name);
        outputStreamWriter.write("\n");
        outputStreamWriter.write(String.valueOf(diem)+"  ");
        String tm = "";
        tm = tm + String.valueOf(time/60) +":"+String.valueOf(time%60);
        outputStreamWriter.write(tm+"  "+timeSubmit);
        outputStreamWriter.write("\n");
        outputStreamWriter.flush();
    }
    public static void addUserLogin(String name) throws IOException{ 
        OutputStream outputStream = new FileOutputStream(userLogin);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(name);
         outputStreamWriter.flush();
    }
    public static void cutUserLogin() throws IOException{ 
        OutputStream outputStream = new FileOutputStream(userLogin);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("");
         outputStreamWriter.flush();
    }
    public static void addAnswer(varData de,int diem,int time,String x) throws IOException{ 
        OutputStream outputStream = new FileOutputStream(answer);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        String tm = "";
        tm = tm + String.valueOf(time/60) +":"+String.valueOf(time%60);
        outputStreamWriter.write(tm);
        outputStreamWriter.write("\n");
        outputStreamWriter.write(String.valueOf(diem));
        outputStreamWriter.write("\n");
        outputStreamWriter.write(x);
        outputStreamWriter.write("\n");
        for(int i=0;i<25;i++){
            outputStreamWriter.write(String.valueOf(de.dapAn[i]));
            outputStreamWriter.write("\n");
        }
         outputStreamWriter.flush();
    }
    public static void readAnswer(String[] answerx) throws IOException{ 
        InputStream inputStream = new FileInputStream(answer);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "";
        int i=0;
        while((line = reader.readLine()) != null){
                answerx[i] = line;
                i++;
        }
    }
    public static void cutAnswer() throws IOException{ 
        OutputStream outputStream = new FileOutputStream(answer);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("");
         outputStreamWriter.flush();
    }
    public static String checkUser(String name) throws FileNotFoundException, IOException{
        String pass ="";
        if(name.length() <3 || name.length()>15)
              return pass;
        InputStream inputStream = new FileInputStream(userData);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
 
        String line = "";
        while((line = reader.readLine()) != null){
            if(line.equals(name)){
                  pass =reader.readLine();
                  return pass;
            }
            reader.readLine();
        }
        return pass;
    }
    public static void addUser(String name , String pass) throws IOException{ 
        OutputStream outputStream = new FileOutputStream(userData,true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(name);
        outputStreamWriter.write("\n");
        outputStreamWriter.write(pass);
        outputStreamWriter.write("\n");
        outputStreamWriter.flush();
    }
    public static void addSetTime(String time) throws IOException { 
        OutputStream outputStream = new FileOutputStream(setTime);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(time);
         outputStreamWriter.flush();
    }
    public static String readSetTime() throws FileNotFoundException, IOException{ 
    //    System.out.println("time : " + time);
       InputStream inputStream = new FileInputStream(setTime);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "";
        line = reader.readLine();
        return line;
    //    System.out.println("time : " + time);
    }
     public static void addAvatar(int id) throws IOException { 
        OutputStream outputStream = new FileOutputStream(avatar);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(String.valueOf(id));
         outputStreamWriter.flush();
    }
     public static int readAvatar() throws FileNotFoundException, IOException{ 
       InputStream inputStream = new FileInputStream(avatar);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line ="";
        line = reader.readLine();
        int x= Integer.parseInt(line);
        return x;
    }

}