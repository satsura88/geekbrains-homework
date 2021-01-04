package lesson06.dz6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class dz6 {
    public static void main(String[] args) {

        connectFiles (new String[]{"C:\\Users\\satsu\\IdeaProjects\\Stream20201210\\src\\lesson06\\dz6\\1.txt","C:\\Users\\satsu\\IdeaProjects\\Stream20201210\\src\\lesson06\\dz6\\2.txt"},"C:\\Users\\satsu\\IdeaProjects\\Stream20201210\\src\\lesson06\\dz6\\3.txt");

        FindWord("C:\\Users\\satsu\\IdeaProjects\\Stream20201210\\src\\lesson06\\dz6\\3.txt","public");
    }

    public static void connectFiles(String[] files, String finalFile){

        try{
            FileOutputStream fos = new FileOutputStream(finalFile);
            for (String name: files){
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if(i != -1){
                        fos.write(i);
                    }
                }while (i != -1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void FindWord(String fileName, String word){
        try{
            FileInputStream fis = new FileInputStream(fileName);
            int symbol = 0;
            int index = 0;
            byte[] wordBytes = word.getBytes();
            do{
                symbol = fis.read();
                if (wordBytes[index] == symbol){
                    index++;
                    if (index == wordBytes.length){
                        System.out.println("Слово найдено.");
                        break;
                    }
                }else{
                    index = 0;
                }
            }while (symbol != -1);


        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
