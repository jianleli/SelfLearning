package MoneyTracking;

import java.util.Scanner;

public class Utility {

    private static Scanner scanner = new Scanner(System.in);

    /*
    For reading input number
    if enter '1-4' any number, return the number of input
     */
    public static <Stirng> char readMenuSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c!= '3' && c != '4'){
                System.out.print("There is not option");
            }else
                break;
        }
        return c;
    }

    /*
    For the number of income and pay Enter
    This method is for reading a number with less then 4 numbers of integer
    and return this number
     */
    public static int readNumber(){
        int n;
        for (;;){
            String str = readKeyBoard(4);
            try{
                n = Integer.parseInt(str);
                break;
            }catch(NumberFormatException e) {
                System.out.print("Invalid Input, Try Again");
            }
        }return n;
    }

    /*
    For the input of the deatils of each income or transaction
     */
    public static String readString(){
        String str = readKeyBoard(8);
        return str;
    }

    /*

     */
    public static char readConfirmSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.print("Invalid Input, Try Again");
            }
        }return c;
    }

    private static String readKeyBoard(int limit) {
        String line = "";

        while(scanner.hasNext()){
            line = scanner.nextLine();
            if (line.length()<1||line.length()>limit){
                System.out.print("Enter length ( less than " + limit + ") Invalid,Try Again" );
                continue;
            }
            break;
        }
        return line;
    }
}
