/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author NGUYEN VAN KIEN
 */
public class fileAdmin {
    public static String user = "src/data/textData/userData.txt";
    public static String deThi = "src/data/textData/deThi.txt";
    public static String deThi2 = "src/data/textData/deThi2.txt";
    public static String deThi3 = "src/data/textData/deThi3.txt";
    public static String history = "src/data/textData/history.txt";
    public static int maxLT =15;
    
    /**
     *
     * @param allUser
     * @throws IOException
     */
    public static void readUser(LinkedList<String> allUser) throws IOException{
        InputStream inputStream = new FileInputStream(user);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "" ,line1 ="";
        String s ="";
        while((line = reader.readLine()) != null){
            line1 = reader.readLine();
            s = s +line+"  " +line1;
            allUser.addFirst(s);
            s ="";
        }
    }
    public static void addUser(LinkedList<String> allUser) throws IOException{ 
        OutputStream outputStream = new FileOutputStream(user);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        for(int i=allUser.size()-1;i>=0;i--){
            String[] s = allUser.get(i).split("  ");
            outputStreamWriter.write(s[0]+"\n"+s[1]+"\n");
        }
        outputStreamWriter.flush();
    }
    public static String readExam() throws  IOException{
        String s ="";
        InputStream inputStream = new FileInputStream(deThi);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "",dapAn ="",line2 ="",line3="";
        int x =1, da =0;
        while((line = reader.readLine()) != null){
                s = s +"Câu "+String.valueOf(x)+"."+line +" \n";
                s = s +"       A."+reader.readLine()+" \n";
                s = s +"       B."+reader.readLine()+" \n";
                s = s +"       C."+reader.readLine()+" \n";
             //   s = s +"     *Dap an : "+reader.readLine()+" \n";
                dapAn =reader.readLine();
                if(dapAn != null || dapAn.length()>0)
                       da = dapAn.codePointAt(0) -48;
                s = s +"    * Đáp án : "+(char)(da+64)+" \n\n";
                x++;
        }
        for(int i =2;i<=3;i++){
            String deThix ="";
            if (i==2)
               deThix = deThi2;
            else
              deThix = deThi3;
            InputStream inputStream2 = new FileInputStream(deThix);
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream2);
            BufferedReader reader2 = new BufferedReader(inputStreamReader2);
            line = "";dapAn ="";
            da =0;
            while((line = reader2.readLine()) != null){
                    s = s +"Câu "+String.valueOf(x)+"."+reader2.readLine() +" \n";
                    s = s +"       A."+reader2.readLine()+" \n";
                    s = s +"       B."+reader2.readLine()+" \n";
                    line2 = reader2.readLine();
                    line3 = reader2.readLine();
                    dapAn =reader2.readLine();
                    if(line2.equals("Null") ==false) s = s +"       C."+line2+" \n";
                    if(line3.equals("Null") ==false) s = s +"       D."+line3+" \n";
                    if(dapAn != null || dapAn.length()>0)
                           da = dapAn.codePointAt(0) -48;
                    s = s +"    * Đáp án : "+(char)(da+64)+" \n\n";
                    x++;
            }
       }
        return s;
    }
    
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
    public static void addHistory(LinkedList<String> allHistory) throws IOException{ 
        OutputStream outputStream = new FileOutputStream(history);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        for(int i =allHistory.size()-1;i>=0;i--){
            String[] s = allHistory.get(i).split("  ");
            outputStreamWriter.write(s[0]+"\n"+s[1]+"  "+s[2] +"  "+s[3]+"\n");
        }
        outputStreamWriter.flush();
    }
  

   
}
