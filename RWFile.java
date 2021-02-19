package sk.kosickaacademic.simon.homework;

import java.io.*;

public class RWFile {
    public void readFile(String fileName){
        BufferedReader reader;
        BufferedWriter writer;
        try{
            reader = new BufferedReader(new FileReader(fileName));
            File file = new File("output/git.txt");
            writer = new BufferedWriter(new FileWriter(file));
            String line = reader.readLine();
            while(line!=null){
                line=repairFile(line);
                writer.write(line +'\n');
                line=reader.readLine();
            }
            reader.close();
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String repairFile(String txt){
        String result="";
        for(int i=0; i<txt.length(); i++){
            if(i==0 && txt.charAt(0)==' ') continue;
            switch(txt.charAt(i)){
                case 'i': result+='y'; break;
                case 'y': result+='i'; break;
                case 'I': result+='Y'; break;
                case 'Y': result+='I'; break;
                case '?': break;
                default: result+=txt.charAt(i);
            }
        }
        return result;
    }
}
