package csvoperation;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvUtilities {

    /**
     *
     * Follow this tutorial to implement more use cases
     * https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/
     * Learn: How to write into a CSV?
     *
     * */

    public static void main(String[] args) {
       //readStandardCSVFile();
        readCustomCSVFile();
    }

    public static void readStandardCSVFile(){
        String fileName = System.getProperty("user.dir") +  "/src/main/java/csvoperation/data.csv";

        try {
            CSVReader csvReader = new CSVReader(new FileReader(fileName));
            List<String[]> reader = csvReader.readAll();
            System.out.println(reader.size());

            // Foreach loop can only iterate Objects elements of an array
            // Getting record1

            for(int i = 0; i < reader.size(); i++){
                String[] record = reader.get(i);
                for (String str: record) {
                    System.out.print(str + ',');
                }
                System.out.println("\n");
            }


        }
        catch (IOException | CsvException e){
            e.printStackTrace();
        }
    }

    public static void readCustomCSVFile(){
        /**
         *
         * Read a CSV with ';' or '|'
         * Skip record 0 or field name record
         *
         * */
        String fileName = System.getProperty("user.dir") +  "/src/main/java/csvoperation/data1.csv";
        CSVParser csvParser = new CSVParserBuilder().withSeparator('|').build();
        try {
            CSVReader csvReader = new CSVReaderBuilder(
                    new FileReader(fileName))
                    .withCSVParser(csvParser)
                    .withSkipLines(1)
                    .build();
            List<String[]> reader = csvReader.readAll();
            System.out.println(reader.size());

            // Foreach loop can only iterate Objects elements of an array
            // Getting record1

            for(int i = 0; i < reader.size(); i++){
                String[] record = reader.get(i);
                for (String str: record) {
                    System.out.print(str + ',');
                }
                System.out.println("\n");
            }


        }
        catch (IOException | CsvException e){
            e.printStackTrace();
        }
    }

}
