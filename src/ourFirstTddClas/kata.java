package ourFirstTddClas;

public class kata{
    int unitPrice;
    public int calculatePriceFor(int testDrillerQuantity){
        if(testDrillerQuantity>=1 && testDrillerQuantity <=4){
            unitPrice = 1500;
        }
        if(testDrillerQuantity >4 && testDrillerQuantity <10){
            unitPrice = 1400;
        }
        return unitPrice * testDrillerQuantity;
    }
}
