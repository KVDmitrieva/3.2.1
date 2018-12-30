import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String f = "";
        String s = "";
        try {
            File first = new File("C:\\Users\\kated\\IdeaProjects\\3.2\\src\\first.txt");
            File second = new File("C:\\Users\\kated\\IdeaProjects\\3.2\\src\\second.txt");
            Scanner firstScanner = new Scanner(first);
            Scanner secondScanner = new Scanner(second);
            while (firstScanner.hasNext()&&secondScanner.hasNext()) {
              f=firstScanner.next();
              s=secondScanner.next();
              if (!f.equals(s)){
                  int fn = f.length();
                  int sn = s.length();
                  char[] firstArray=new char[fn];
                  f.getChars(0, fn-1, firstArray, 0);
                  char[] secondArray=new char[sn];
                  s.getChars(0, sn-1, secondArray, 0);
                  int min;
                  if (fn<sn) min=fn; else min=sn;
                  for (int i=0; i<min;i++){
                      if(firstArray[i]!=secondArray[i]) System.out.println(firstArray[i]+" "+secondArray[i]);
                  }
              }

              f="";
              s="";
            }
            firstScanner.close();
            secondScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
