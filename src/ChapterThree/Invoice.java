package ChapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityOfItemPurchased;
    private double priceOfItem;

    public Invoice(String partNumber, String partDescription, int quantityOfItemPurchased, double priceOfItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfItemPurchased = quantityOfItemPurchased;
        this.priceOfItem = priceOfItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber + 234;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityOfItemPurchased() {
        return quantityOfItemPurchased;
    }

    public void setQuantityOfItemPurchased(int quantityOfItemPurchased) {
        this.quantityOfItemPurchased = Math.max(quantityOfItemPurchased, 0);
    }

    public double getPriceOfItem() {
        return priceOfItem;
    }

    public void setPriceOfItem(double priceOfItem) {
        this.priceOfItem = (priceOfItem < 0) ? 0.0 : priceOfItem;
    }
//    public double getInvoiceAmount(){
//        return getInvoiceAmount();
//    }
    public double calculateInvoiceAmount(){
        return quantityOfItemPurchased * priceOfItem;
    }
}

