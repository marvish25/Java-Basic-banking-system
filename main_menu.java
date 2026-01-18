public class main_menu extends Bank{
    String choice = "0";
    char choice_char = '\0';
    void Main_menu()
    {
        System.out.printf("_________________________________\n%s      Welcome to the Bank\033[0m\n*********************************\n",Green);
        System.out.printf("1.Deposit\n2.Widthraw\n3.View Balance\n4.Exit\nEnter choice here : ");
        choice = scanner.nextLine().trim();
        if(choice.length() ==0)
        {
            System.out.printf("%sInvalid input\n",Red);
            return;
        }
        choice_char = Character.toUpperCase(choice.charAt(0));

        switch(choice_char)
        {
            case '1':
                Deposit();
                break;
            case '2':
                Widthraw();
                break;
            case '3':
                view_balance();
                break;
            case '4':
                return;
            default:
                System.out.printf("%sInvalid input\n",Red);
                break;
            
        }
        
        


    }
    main_menu()
    {
        do{
            Main_menu();
        }while(choice_char!= '4');
    }
}
