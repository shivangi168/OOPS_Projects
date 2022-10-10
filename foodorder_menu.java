import java.util.*;
public class foodorder_menu {
    public static void main(String[] args) {
        menu food=new menu();
        food.display();
        food.order();
        
    }
}

class menu{
    int FrenchFries=100;
    int Burger=150;
    int IcedTea=80;
    int coldDrink=90;
    int pastry=50;
    int pizza=200;
    int Coldcoffe=150;
    int ch;
    int quantity;
    static int total;
    String again;
    Scanner scn=new Scanner(System.in);

    public void display(){
        System.out.println();
        System.out.println("******************** Welcome To Our Cafe ! *********************");
        System.out.println("****************************************************************");
        System.out.println("                1.French Fries                100/-");
        System.out.println("                2.Burger                      150/-");
        System.out.println("                3.Iced Tea                    80/-");
        System.out.println("                4.Cold Drink                  90/-");
        System.out.println("                5.Pastry                      50/-");
        System.out.println("                6.Pizza                       200/-");
        System.out.println("                7.Cold Coffee                 150/-");
        System.out.println("                8.Exit                            -");
        System.out.println("****************************************************************");
        System.out.println("                   What do you want to order Today?            ");
    }
    public void generateBill(){
        System.out.println();
        System.out.println("******************** Thank You for Ordering ! ********************");
        System.out.println("********************** Your  Bill  is : " + total +"/- only "+"**********************");
        System.out.println();

    }
    public void order(){

        while(true){
        System.out.println();
        System.out.print("Enter Your Choice: ");
        ch=scn.nextInt();
        switch(ch){

            case 1: //French Fries
            System.out.println("You have selected French Fries.");
            System.out.println();
            System.out.print("Enter the desired quantity.: ");
            quantity=scn.nextInt();
            total=total+quantity*FrenchFries;
            break;

            case 2: //Burger
            System.out.println("You have selected Burger.");
            System.out.println();
            System.out.println("Enter the desired quantity.");
            quantity=scn.nextInt();
            total=total+quantity*Burger;
            break;

            case 3: //Iced-Tea
            System.out.println("You have selected Iced Tea.");
            System.out.println();
            System.out.print("Enter the desired quantity.: ");
            quantity=scn.nextInt();
            total=total+quantity*IcedTea;
            break;

            case 4: //Cold Drink
            System.out.println("You have selected Cold Drink.");
            System.out.println();
            System.out.print("Enter the desired quantity: ");
            quantity=scn.nextInt();
            total=total+quantity*coldDrink;
            break;

            case 5: //Pastry
            System.out.println("You have selected  Pastry.");
            System.out.println();
            System.out.print("Enter the desired quantity: ");
            quantity=scn.nextInt();
            total=total+quantity*pastry;
            break;

            case 6: //Pizza
            System.out.println("You have selected Pizza.");
            System.out.println();
            System.out.print("Enter the desired quantity: ");
            quantity=scn.nextInt();
            total=total+quantity*pizza;
            break;

            case 7: //Cold Coffee
            System.out.println("You have selected Cold Coffee.");
            System.out.println();
            System.out.print("Enter the desired quantity: ");
            quantity=scn.nextInt();
            total=total+quantity*Coldcoffe;
            break;

            case 8://exit
            System.exit(1);
            break;

            default:
            break;
        }
        System.out.println();
        System.out.print("Do you wish to order anything else?(Y/N): ");
        again=scn.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }
        else if(again.equalsIgnoreCase("N")){
            generateBill();
            System.exit(1);
        }
        else{
            System.out.println("Invalis Choice!");
        }
           
    }


    }
}

