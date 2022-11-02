package DTO;

import java.util.ArrayList;

public class DTO_FrequentItemSet {

    private ArrayList<String> ItemSet;
    private double Frequency;

    public ArrayList<String> getItemSet() {
        return ItemSet;
    }

    public void setItemSet(ArrayList<String> ItemSet) {
        this.ItemSet = ItemSet;
    }

    public double getFrequency() {
        return Frequency;
    }

    public void setFrequency(double Frequency) {
        this.Frequency = Frequency;
    }

    public DTO_FrequentItemSet() {
    }

    public DTO_FrequentItemSet(ArrayList<String> ItemSet, double Frequency) {
        this.ItemSet = ItemSet;
        this.Frequency = Frequency;
    }

}

