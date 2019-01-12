import javax.swing.JOptionPane;

public class ThreeEleven {
    public static void main(String[] args) {
     
     //open variables 
     String month = "";
     String days = "";
     //String leapyeardecider = "";
     
     //Month input
     String input1 = JOptionPane.showInputDialog("Enter the month as a numerical number: ");
     int mmonth = Integer.parseInt(input1);
     
     //Year input
     String input2 = JOptionPane.showInputDialog("Enter the year: ");
     int year = Integer.parseInt(input2);
     
     //leap year decider
     boolean isLeapYear = (year % 4 == 0 && 100 != 0) || (year % 400 == 0);
     
     
    //month if statements 
     if(mmonth == 1) {
         month = "January";
         days = "31";
     }
     else if (mmonth == 2 ) {
         month = "February";
         if(isLeapYear == false) {
             days = "28";
         }
         else {
             days = "29";
         }
     }
     else if (mmonth == 3) {
         month = "March";
         days = "31";
     }
     else if (mmonth == 4) {
         month = "April";
         days = "30";
     }
     else if(mmonth == 5) {
         month = "May";
         days = "31";
     }
     else if (mmonth == 6) {
         month = "June";
         days = "30";
     }
     else if (mmonth == 7) {
         month = "July";
         days = "31";
     }
     else if (mmonth == 8) {
         month = "August";
         days = "31";
     }
     else if (mmonth == 9) {
         month = "September";
         days = "30";
     }
     else if (mmonth == 10) {
         month = "October";
         days = "31";
     }
     else if (mmonth ==11) {
         month = "November";
         days = "30";
     }
     else if (mmonth == 12) {
         month = "December";
         days = "31";
     }
     else {
         System.out.println("That is not a valid month.");
     }
     
     //Final SOUT statement 
     System.out.println(month + " of " + year + " has " + days + " days.");

     
     //and " + leapyeardecider + " a leapyear.");
     // System.out.println(isLeapYear);
    }
}
