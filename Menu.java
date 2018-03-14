import java.util.*;

public class Menu {
    public static void Menu(OrderedList list) {
        int flag = 1;

        while (flag == 1) {
            Scanner input =  new Scanner(System.in);
            int choice  = 0;
            System.out.println("1.Add Item 2.Delete Item 3. Print All 0.Go Back");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("input your data");
                    input.nextLine();
                    Object newData = input.nextLine();
                    list.insert(newData);
                    break;

                case 2:
                    System.out.println("input the data you want removed");
                    input.nextLine();
                    Object remData = input.nextLine();
                    list.remove(remData);
                    break;

                case 3:
                    System.out.println(list);
                    break;

                case 0:
                    flag = 0;
                    break;
            }
        }
    }
        
    public static void main (String args[]) {

        int flag = 1;
        IntegerOrderedList integerList = new IntegerOrderedList();
        StringOrderedList stringList = new StringOrderedList();

        while (flag == 1) {
            try {
                Scanner input =  new Scanner(System.in);
                int choice  = 0;
                System.out.println("1.Integer List 2. String List 0.Exit");

                choice = input.nextInt();

                switch(choice) {
                    case 1:
                        Menu(integerList);
                        break;

                    case 2:
                        Menu(stringList);
                        break;

                    case 0:
                        flag = 0;
                        break;
                }
            }
             catch (ArithmeticException e) {
                 System.err.printf("Exception: %s \n", e);
                 System.err.printf("Numbers should be positive integers different than zero   \n");
             }

             catch (NumberFormatException e) {
                 System.err.printf("Exception: %s \n", e);
                 System.err.printf("integers please \n");
             }

             catch (InputMismatchException e) {
                 System.err.printf("Exception: %s \n", e);
                 System.err.printf("Inputs should be integers \n");
             }
        }
    }
}

