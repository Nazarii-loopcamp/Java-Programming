package day40_exceptions.bank;

public class UsingAccount {
    public static void main(String[] args) {

        Account account = new Account(100_000.00);

        try {

            account.withdraw(10000);
            System.out.println(account.balance); // 90_000

            System.out.println();

            account.withdraw(150_000.00);
            System.out.println(account.balance);


        } catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }



        System.out.println();


        // I got 2 options for this
        // 1 - handle
        // 2 - Bypass (in main() method signature)
        try {
            account.login("loopcamp", "Pass");
        } catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Final Line");
    }
}
