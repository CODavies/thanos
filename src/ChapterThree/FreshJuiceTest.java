package ChapterThree;

//public class FreshJuiceTest {
//    public static void main(String[] args) {
//        System.out.println("Size: " + FreshJuice.FreshJuiceSize.SMALL);
//        System.out.println("Size: " + juice.size);

public class FreshJuiceTest {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println("Size: " + juice.size);
    }

    }

