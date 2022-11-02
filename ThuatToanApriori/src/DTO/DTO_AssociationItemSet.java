package DTO;

import java.util.ArrayList;

public class DTO_AssociationItemSet {

    private ArrayList<String> Antecedent, Consequent;

    public ArrayList<String> getAntecedent() {
        return Antecedent;
    }

    public void setAntecedent(ArrayList<String> Antecedent) {
        this.Antecedent = Antecedent;
    }

    public ArrayList<String> getConsequent() {
        return Consequent;
    }

    public void setConsequent(ArrayList<String> Consequent) {
        this.Consequent = Consequent;
    }

    public DTO_AssociationItemSet() {
    }

    public DTO_AssociationItemSet(ArrayList<String> Antecedent, ArrayList<String> Consequent) {
        this.Antecedent = Antecedent;
        this.Consequent = Consequent;
    }

}
