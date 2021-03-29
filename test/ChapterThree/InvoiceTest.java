package ChapterThree;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {
    Invoice invoice = new Invoice("partNumber", "partDescription", 0, 0);

    @Test
    public void partNumberIsNotNull(){
       invoice.setPartNumber("123");
assertNotNull(invoice.getPartNumber());
        System.out.println(invoice.getPartNumber());

    }
    @Test
    public void partDescriptionIsNoTNull(){
        invoice.setPartDescription("A Spanner");
        assertNotNull(invoice.getPartDescription());
        System.out.println(invoice.getPartDescription());
    }
    @Test
    public void quantityOfItemPurchasedIsNotNull(){
        invoice.setQuantityOfItemPurchased(-388);
        assertNotNull(invoice.getQuantityOfItemPurchased());
    System.out.println(invoice.getQuantityOfItemPurchased());

    }
    @Test
    public void invoiceAmount(){
      invoice.setQuantityOfItemPurchased(23);
      invoice.setPriceOfItem(1.0);
       assertEquals(23, 23.0, invoice.calculateInvoiceAmount());
        System.out.println(invoice.calculateInvoiceAmount());
    }

}
