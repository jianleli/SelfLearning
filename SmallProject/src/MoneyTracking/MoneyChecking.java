package MoneyTracking;

public class MoneyChecking {

    public static void main(String[] args) {

        boolean isFlag = true;
        // use to store details info
        String details = "Type\tMoney In the Account\t How much\tComment\n";
        //initial
        int balance = 10000;

        while (isFlag){
            System.out.println("-----------Money Tracking-----------");
            System.out.println("            1. Details              ");
            System.out.println("            2. Add Income           ");
            System.out.println("            3. Add Spending         ");
            System.out.println("            4. Exit                 ");
            System.out.print("           Enter a number(1-4): ");

            //get user input
            char selection = Utility.readMenuSelection();


            switch (selection) {
                case '1' :
                    System.out.println("--------------------------Details------------------------");
                    System.out.println(details);
                    System.out.println("---------------------------------------------------------\n");
                    break;
                case '2' :
                    System.out.println("Amount for Adding: ");
                    int incomeMoney = Utility.readNumber();
                    System.out.println("Comment: ");
                    String incomeComment = Utility.readString();
                    balance += incomeMoney;

                    details += ("Income\t\t" + balance+ "\t\t\t\t\t" + incomeMoney + "\t\t" + incomeComment + "\n");
                    System.out.println("-------------------------Add Successfully-----------------\n");
                    break;
                case '3' :
                    System.out.println("Amount for Spending: ");
                    int spendingMoney = Utility.readNumber();
                    System.out.println("Comment: ");
                    String spendComment = Utility.readString();

                    if (balance >= spendingMoney){
                        balance -= spendingMoney;
                        details += ("Spending\t" + balance+ "\t\t\t\t\t" + spendingMoney + "\t" + spendComment + "\n");
                    }else{
                        System.out.println("Money is not Enough");
                    }
                    System.out.println("-------------------------Add Successfully-----------------\n");
                    break;
                case '4' :
                    System.out.print("Exit? (Y/N): ");
                    char isExit = Utility.readConfirmSelection();

                    if (isExit == 'Y') {
                        isFlag = false;
                    }

            }
        }
    }
}
