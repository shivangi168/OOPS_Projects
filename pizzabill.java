import java.io.Externalizable;
import java.util.*;

class pizza{
    private int price;
    private boolean veg;
    private int extracheese=100;
    private int Extratoppingprice=150;
    private int backPack=20;
    private int basepizzaprice;
    private boolean isExtracheeseadded=false;
    private boolean isExtraToppingadded=false;
    private boolean istakenaway=false;



     public pizza(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basepizzaprice=this.price;
     }

     
     public void addExtracheese(){
        isExtracheeseadded=true;
        // System.out.println("Extra Cheese added");
        this.price+=extracheese;
     }

     public void addextraToppings(){
        isExtraToppingadded=true;
        // System.out.println("Extra Topping added");
        this.price+=Extratoppingprice;
     }

     public void takeAway(){
        istakenaway=true;
        // System.out.println("Take away Opted");
        this.price+=backPack;

     }
     public void getBill(){
        String bill="";
        System.out.println("Pizza: "+ basepizzaprice);

        if(isExtracheeseadded){
            bill+="Extra Cheese added: "+ extracheese+ "\n";
        }

        if(isExtraToppingadded){
            bill+="Extra Toppings added: "+Extratoppingprice+ "\n";
        }

        if(istakenaway){
            bill+="Taken Away: "+backPack+"\n";
        }
        bill+="Bill: "+this.price + "\n";
        System.out.println(bill);   

     }

}
class Deluxepizza extends pizza{
    public Deluxepizza(boolean veg) {
        super(veg);
        super.addExtracheese();
        super.addextraToppings();
    }
    @Override
    public void addExtracheese(){
        super.addExtracheese();

    }

    @Override
    public void addextraToppings(){
        super.addextraToppings();

    }
    
}


public class pizzabill {
    public static void main(String[] args) {
        pizza basepizza=new pizza(false);
        basepizza.addExtracheese();
        basepizza.addextraToppings();
        basepizza.takeAway();
        basepizza.getBill();
        System.out.println();
        Deluxepizza dp=new Deluxepizza(true);
        dp.addExtracheese();
        dp.addextraToppings();
        dp.takeAway();
        dp.getBill();


    }
}

