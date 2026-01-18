
import java.util.Scanner;
public class Bank{
    String Red = "\033[31m";
    String Green = "\033[32m";
    String Reset = "\033[0m";
    String Bold = "\033[1m";
    double deposit = 0.00;
    double widthraw = 0.00;
    double available_balance =0.00;
    static Scanner scanner = new Scanner(System.in);
    void Deposit()
    {

        System.out.printf("Enter the amount to deposit :");
        deposit = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("%sYou have deposited %.2f successfully%s\n\n\n\n\n\n\n\n\n\n\n",Green,deposit,Reset);

        if(deposit ==0.00)
        {
            System.out.printf("\033[31minvalid amount to deposit%s\n",Red,Reset);
            return;
        }
        available_balance +=deposit;
        
        
    }

    void Widthraw()
    {
        System.out.printf("Enter the amount to widthraw : ");
        widthraw = scanner.nextDouble();
        scanner.nextLine();// to consume the newline character
        if(widthraw <= 0 )
        {
            System.out.printf("%sinvalid amount to widthraw \n",Red);
            return ;
        }
        else if(available_balance == 0 || widthraw > available_balance)
        {
            System.out.printf("[ insufficient funds ]\n");
            return;
        }

        available_balance = available_balance-widthraw;
        view_balance();
        

    }
    void view_balance()
    {
        System.out.printf("Available balance : %.2f\n",available_balance);
    }
    
}