package BUS;

import DAO.DAO_Transaction;
import DTO.DTO_Transaction;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BUS_Transaction {

    public ArrayList<DTO_Transaction> GetData() throws IOException {
        return new DAO_Transaction().GetData();
    }

    public ArrayList<String> GetItem(ArrayList<DTO_Transaction> ListOfTransaction) {
        ArrayList<String> ItemSet = new ArrayList<>();
        for (int i = 0; i < ListOfTransaction.size(); i++) {
            String Item = ListOfTransaction.get(i).getItems();
            StringTokenizer stringtokenizer = new StringTokenizer(Item, ",");
            while (stringtokenizer.hasMoreTokens()) {
                ItemSet.add(stringtokenizer.nextToken());
            }
        }
        return ItemSet;
    }

    public ArrayList<String> GetItemSet() throws IOException {
        ArrayList<DTO_Transaction> ListOfTransaction = GetData();
        ArrayList<String> ItemSet = new ArrayList<>();
        for (int i = 0; i < ListOfTransaction.size(); i++) {
            String Item = ListOfTransaction.get(i).getItems();
            ItemSet.add(Item);
        }
        return ItemSet;
    }

}
