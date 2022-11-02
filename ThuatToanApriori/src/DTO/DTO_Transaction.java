package DTO;

public class DTO_Transaction {

    private String TransactionID, Items;

    public String getItems() {
        return Items;
    }

    public void setItems(String Items) {
        this.Items = Items;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public DTO_Transaction() {
    }

    public DTO_Transaction(String TransactionID, String Items) {
        this.TransactionID = TransactionID;
        this.Items = Items;
    }

}


