package UTIL;

import DTO.DTO_FrequentItemSet;
import java.util.ArrayList;

public class Operation {

    public ArrayList<String> RemoveExistingItem(ArrayList<String> ItemSet) {
        ArrayList<String> FilteredItemSet = new ArrayList<>();
        for (int i = 0; i < ItemSet.size(); i++) {
            if (!FilteredItemSet.contains(ItemSet.get(i))) {
                FilteredItemSet.add(ItemSet.get(i));
            }
        }
        return FilteredItemSet;
    }

    public ArrayList<String> RemoveUnfrequentItemSet(ArrayList<DTO_FrequentItemSet> ListOfFrequentItemSet) {
        ArrayList<String> FrequentItemSet = new ArrayList<>();
        for (int i = 0; i < ListOfFrequentItemSet.size(); i++) {
            ArrayList<String> ListOfItemSet = ListOfFrequentItemSet.get(i).getItemSet();
            for (int j = 0; j < ListOfItemSet.size(); j++) {
                if (!FrequentItemSet.contains(ListOfItemSet.get(j))) {
                    FrequentItemSet.add(ListOfItemSet.get(j));
                }
            }
        }
        return FrequentItemSet;
    }

    public double RoundNumber(double Number) {
        double RoundedNumber = 0;
        RoundedNumber = (double) Math.round(Number * 100) / 100;
        return RoundedNumber;
    }

    public String TurnItemSetIntoItem(ArrayList<String> ItemSet) {
        String Item = "";
        for (int i = 0; i < ItemSet.size(); i++) {
            Item += ItemSet.get(i);
            if (i < ItemSet.size() - 1) {
                Item += ", ";
            }
        }
        return Item;
    }

}
