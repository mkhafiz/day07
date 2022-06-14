package maven.path;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Book {

    public static void main(String[] args) throws IOException  {

        List<String> books = new LinkedList<>(); 

        //Extract content
        File file = new File ("D:\\Downloads\\books.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
    
        String st;
        while ((st = br.readLine()) != null)
        System.out.println(st); 
        

        books.add(st);
        System.out.println(books + "\n");

        books.stream();
            
        
    }
}
