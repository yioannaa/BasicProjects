package pl.bankaccountapp;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

//        public static Path file = Paths.get("NewBankAccounts.csv");


    public static List<String[]> read (String file){
        List<String[]>data = new LinkedList<String[]>();
        String dataRow;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((dataRow = reader.readLine()) != null) {
                String[] dataRecords = dataRow.split(",");
                data.add(dataRecords);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }
        return data;
    }







}
