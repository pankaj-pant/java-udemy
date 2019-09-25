public class Main {
    public static void main(String[] args) {

        Account bobsAccount = new Account(5432, 0.0, "Bob Boolean", "bob@boolean.com", 234322245);

        System.out.println(bobsAccount.getAccountNumber());

        bobsAccount.depositFunds(123);

        bobsAccount.withdrawFunds(23);

        bobsAccount.withdrawFunds(123);

        System.out.println(bobsAccount.getBalance());


    }
}
