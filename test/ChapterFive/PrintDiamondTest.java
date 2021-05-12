package ChapterFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintDiamondTest {
 PrintDiamond pd;
 @BeforeEach
    void startTestWith(){
     pd = new PrintDiamond();
 }
 @Test
    void printDiamond(){
     pd.printDiamond();
 }
}