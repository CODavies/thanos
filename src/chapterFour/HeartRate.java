//package chapterFour;
//
////
//public class HeartRate {
////    private String firstName;
////    private String lastName;
////    private int age;
////
////    public HeartRate(String firstName, String lastName, int age) {
////        this.firstName = firstName;
////        this.lastName = lastName;
////
////        this.age = age;
////
////    }
////    public void setFirstName (String firstName)
////    {
////        this.firstName = firstName;
////    }
////
////    public String getFirstName ()
////    {
////        return firstName;
////
////    }
////
////    public void setLastName (String lastName)
////    {
////        this.lastName = lastName;
////    }
////
////    public String getLastName ()
////    {
////        return lastName;
////
////    }
////
////    public void setAge(int age) {
////        if (age < 0) {
////            this.age = 0;
////        } else this.age = age;
////    }
////
////    public int getAge() {
////        return age;
////    }
////    public int yearOfBirth(){
////        int yearOfBirth = 2021 - yearOfBirth;
////        return yearOfBirth;
////    }
////
////}
//
//    private String fName, lName;
//    private int bDay, bMonth, bYear;
//
//    // constructor
//    public HeartRate(String fName, String lName, int bDay, int bMonth, int bYear) {
//        setFirstName(fName);
//        setLastName(lName);
//        setDay(bDay);
//        setMonth(bMonth);
//        setYear(bYear);
//    }
//
//    public void setFirstName(String fName) {
//        this.fName = fName;
//    }
//
//    public void setLastName(String lName) {
//        this.lName = lName;
//    }
//
//    public void setDay(int bDay) {
//        this.bDay = bDay;
//    }
//
//    public void setMonth(int bMonth) {
//        this.bMonth = bMonth;
//    }
//
//    public void setYear(int bYear) {
//        this.bYear = bYear;
//    }
//
//    // getters
//    public String getFirstName() {
//        return fName;
//    }
//
//    public String getLastName() {
//        return lName;
//    }
//
//    // return person's dob
//    public String getDOB() {
//        return String.format("%d/%d/%d", bDay, bMonth, bYear);
//    }
//
//    // calculate and return person's age
//    public int getAge() {
//        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - bYear;
//    }
//
//    // calculate and return max heartbeat
//    public int getMaxHeartRate() {
//        // max heartbeat in bpm = 220 - age in years.
//        return 220 - getAge();
//    }
//
//    // calculate and return target heartbeat
//    public String getTargetHeartRate() {
//        return String.format("%.0f - %.0f",
//                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
//    }
//}