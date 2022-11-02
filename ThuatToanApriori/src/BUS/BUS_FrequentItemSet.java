package BUS;

import DTO.DTO_FrequentItemSet;
import java.util.ArrayList;

public class BUS_FrequentItemSet {

    ArrayList<ArrayList<Integer>> SubItemSet = new ArrayList<>();
    ArrayList<DTO_FrequentItemSet> ListOfFrequentItemSet = new ArrayList<>();
    BUS_Transaction Transaction = new BUS_Transaction();

    public ArrayList<DTO_FrequentItemSet> CountFrequency(ArrayList<String> ItemSet, ArrayList<ArrayList<String>> CurrentItemSet, int SizeOfCurrentItemSet) {
        ArrayList<ArrayList<String>> ListOfItemSet = new ArrayList<>();
        for (int i = 0; i < ItemSet.size(); i++) {
            for (int j = 0; j < CurrentItemSet.size(); j++) {
                int Count = 0;
                ArrayList<String> TemporaryItemSet = new ArrayList<>();
                for (int k = 0; k < CurrentItemSet.get(j).size(); k++) {
                    if (ItemSet.get(i).contains(CurrentItemSet.get(j).get(k))) {
                        TemporaryItemSet.add(CurrentItemSet.get(j).get(k));
                        Count++;
                    }
                }
                if (Count == SizeOfCurrentItemSet) {
                    ListOfItemSet.add(TemporaryItemSet);
                }
            }
        }
        for (int i = 0; i < ListOfItemSet.size(); i++) {
            if (i == 0) {
                DTO_FrequentItemSet FrequentItemSet = new DTO_FrequentItemSet();
                FrequentItemSet.setItemSet(ListOfItemSet.get(i));
                FrequentItemSet.setFrequency(1);
                ListOfFrequentItemSet.add(FrequentItemSet);
            } else {
                int Position = GetItemSetPosition(ListOfFrequentItemSet, ListOfItemSet.get(i));
                if (Position != -1) {
                    double CurrentQuantity = ListOfFrequentItemSet.get(Position).getFrequency();
                    CurrentQuantity++;
                    ListOfFrequentItemSet.get(Position).setFrequency(CurrentQuantity);
                } else {
                    DTO_FrequentItemSet ItemSetResult = new DTO_FrequentItemSet();
                    ItemSetResult.setItemSet(ListOfItemSet.get(i));
                    ItemSetResult.setFrequency(1);
                    ListOfFrequentItemSet.add(ItemSetResult);
                }
            }
        }
        return ListOfFrequentItemSet;
    }

    public ArrayList<ArrayList<Integer>> CreateSubItemSet(int Index, int SizeOfItemSet, int SizeOfCurrentItemList, int[] ArrayOfInteger) {
        for (int i = ArrayOfInteger[Index - 1] + 1; i <= SizeOfItemSet - SizeOfCurrentItemList + Index; i++) {
            ArrayOfInteger[Index] = i;
            if (Index == SizeOfCurrentItemList) {
                ArrayList<Integer> ArrayListOfInteger = new ArrayList<>();
                ArrayListOfInteger = InsertItemIntoItemSet(SizeOfCurrentItemList, ArrayOfInteger);
                SubItemSet.add(ArrayListOfInteger);
            } else {
                CreateSubItemSet(Index + 1, SizeOfItemSet, SizeOfCurrentItemList, ArrayOfInteger);
            }
        }
        return SubItemSet;
    }

    public int[] CreateArrayOfInteger(int SizeOfItemSet) {
        int[] ArrayOfInteger = new int[SizeOfItemSet];
        for (int i = 0; i < SizeOfItemSet; i++) {
            ArrayOfInteger[i] = i;
        }
        return ArrayOfInteger;
    }

    public ArrayList<DTO_FrequentItemSet> FilterItemSet(ArrayList<DTO_FrequentItemSet> ListOfFrequentItemSet, double MinimumSupport) {
        ArrayList<DTO_FrequentItemSet> FilteredFrequentItemSetList = new ArrayList<>();
        for (int i = 0; i < ListOfFrequentItemSet.size(); i++) {
            if (ListOfFrequentItemSet.get(i).getFrequency() >= MinimumSupport) {
                FilteredFrequentItemSetList.add(ListOfFrequentItemSet.get(i));
            }
        }
        return FilteredFrequentItemSetList;
    }

    public ArrayList<ArrayList<String>> MappingItemSet(ArrayList<ArrayList<Integer>> ListOfInteger, ArrayList<String> ItemSet, int SizeOfCurrentItemSet) {
        ArrayList<ArrayList<String>> ListOfItemSet = new ArrayList<>();
        for (int i = 0; i < ListOfInteger.size(); i++) {
            ArrayList<String> OfficialItemSet = new ArrayList<>();
            for (int j = 0; j < ListOfInteger.get(i).size(); j++) {
                OfficialItemSet.add(ItemSet.get(ListOfInteger.get(i).get(j)));
            }
            ListOfItemSet.add(OfficialItemSet);
        }
        return ListOfItemSet;
    }

    public int GetItemSetPosition(ArrayList<DTO_FrequentItemSet> ListOfFrequentItemSet, ArrayList<String> ItemSet) {
        for (int i = 0; i < ListOfFrequentItemSet.size(); i++) {
            if (ListOfFrequentItemSet.get(i).getItemSet().equals(ItemSet)) {
                return i;
            }
        }
        return -1;
    }

    public double GetFrequency(ArrayList<DTO_FrequentItemSet> ListOfFrequentItemSet, ArrayList<String> ItemSet) {
        for (int i = 0; i < ListOfFrequentItemSet.size(); i++) {
            if (ListOfFrequentItemSet.get(i).getItemSet().equals(ItemSet)) {
                return ListOfFrequentItemSet.get(i).getFrequency();
            }
        }
        return -1;
    }

    public ArrayList<Integer> InsertItemIntoItemSet(int SizeOfItemSet, int[] ArrayOfInteger) {
        ArrayList<Integer> ItemSet = new ArrayList<>();
        for (int i = 1; i <= SizeOfItemSet; i++) {
            ItemSet.add(ArrayOfInteger[i] - 1);
        }
        return ItemSet;
    }

}
