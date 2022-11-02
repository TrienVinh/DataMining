package DAO;

import DTO.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class DAO_Transaction {

    public ArrayList<DTO_Transaction> GetData() throws FileNotFoundException, IOException {
        ArrayList<DTO_Transaction> ListOfTransaction = new ArrayList<>();
        final String FileName = "C:\\Users\\ACER\\Documents\\NetBeansProjects\\DataMining_AprioriAlgorithm\\src\\Dataset\\Dataset1.xls";
        FileInputStream FileInputStream = new FileInputStream(new File(FileName));
        HSSFWorkbook Workbook = new HSSFWorkbook(FileInputStream);
        HSSFSheet Sheet = Workbook.getSheetAt(0);
        int i = 0;
        for (Row row : Sheet) {
            if (i > 1) {
                DTO_Transaction transaction = new DTO_Transaction();
                transaction.setItems(row.getCell(3).toString());
                ListOfTransaction.add(transaction);
            }
            i++;
        }
        return ListOfTransaction;
    }

}
