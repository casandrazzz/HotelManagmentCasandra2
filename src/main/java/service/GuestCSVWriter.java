package service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GuestCSVWriter {

    public void writeLoyaltyStatus () throws IOException {
        String filePath = "guests.csv";

        try {
            BufferedWriter bufferedWriter;
            try (FileWriter fileWriter = new FileWriter ( filePath, true )){
                bufferedWriter = new BufferedWriter ( fileWriter );
            }
            PrintWriter printWriter = new PrintWriter ( bufferedWriter );
            printWriter.println ( "Name, Address, ReasonsOfStay" );

            printWriter.flush ();
            printWriter.close ();
        }catch (IOException e){
        }
    }
}
