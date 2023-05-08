import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

//        //create Account class
//        Account account = new Account("1", "Sara", 30000);
//        Account account2 = new Account("2", "Saleh", 36000);
//
//        System.out.println("Your Name: " + account.getName());
//        System.out.println("Your ID: " + account.getId());
//        System.out.println("Your Balance: " + account.getBalance());
//
//        System.out.print("Please enter the amount to credit: ");
//        int amount = scanner.nextInt();
//        account.credit(amount);
//        System.out.println("Your new balance: " + account.getBalance());
//
//        System.out.print("Please enter the amount to debit: ");
//        amount = scanner.nextInt();
//        account.debit(amount);
//        System.out.println("Your new balance: " + account.getBalance());
//
//        System.out.print("Please enter the amount to transfer: ");
//        amount = scanner.nextInt();
//        account.transferTo(account2,amount);
//        System.out.println(account.toString());
//        System.out.println(account2.toString());



        //create employee class
        Employee e1=new Employee("6","faisal",67000);

        System.out.println("Your information: "+e1.toString());
        System.out.println("Your annual salary: "+e1.getAnnualSalary());
        System.out.println("The raised salary is: "+e1.raisedSalary(3));


    }
}