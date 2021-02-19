package sk.kosickaacademic.simon.homework;

import java.io.*;

// waw , tu je trieda
public class RWFile {
    //zaciatok
    public void readFile(String fileNameXX){
        BufferedReader reader;
        BufferedWriter writer;
        try{
            reader = new BufferedReader(new FileReader(fileNameXX));
            File file = new File("output/gitxxxx.txt");
            writer = new BufferedWriter(new FileWriter(file));
            String line = reader.readLine();
            while(line!=null){
                line=repairFile(line);
                writer.write(line +'\n');
                line=reader.readLine();
            }
            // tu robim close
            reader.close();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String repairFile(String txt1){
        String result="";
        for(int i=0; i<tx1t.length(); i++){
            if(i==0 && txt1.charAt(0)==' ') continue;
            switch(tx1t.charAt(i)){
                case 'i': result+='y'; break;
                
                case 'I': result+='Y'; break;
                case 'Y': result+='I'; break;
                case '?': break;
                default: result+=txt1.charAt(i);
            }
        }
        return result;
    }
    public int getValue(){
        return 5;
    }
}
