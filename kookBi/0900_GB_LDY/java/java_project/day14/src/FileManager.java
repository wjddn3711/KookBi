import java.io.*;
import java.util.ArrayList;

public class FileManager {
    final static String file = "/Users/jungwoo/Desktop/KookBi/kookBi/0900_GB_LDY/java/java_project/day14/src/lang.txt";
    boolean isNoData(String data) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while(true){
                String line = br.readLine();
                if(line==null) break; // line 이 없으면 나감
                if(line.equals(data)){
                   return false;
                }
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    boolean insert(String newData){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
            bw.write(newData+"\r\n");
            bw.close();
            return true;
        } catch (IOException e) {
            System.out.println("IOException 발생");
        }
        return false;
    }

    String selectAll(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String result = "";
            while(true){
                String line = br.readLine();
                if(line==null){
                    break;
                }
                result+=line+"\n";
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    String delete(String data){
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while(true){
                String line = br.readLine();
                if(line==null) break; // line 이 없으면 나감
                if(!line.equals(data)){
                    result+=line+"\r\n"; // 리스트에 한줄씩 담는다
                }
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(result);
            bw.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    String update(String data, String newData){
        String result = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true){
                String line = br.readLine();
                if(line==null) break;
                if(line.equals(data)){
                    result += newData+"\r\n";
                }
                else{
                    result += line+"\r\n";
                }
            }
            br.close();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(result);
            bw.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
