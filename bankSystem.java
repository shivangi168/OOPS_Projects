import java.util.*;

 class bank{
    private String number;
    private double Balance;
    private String Name;
    private String Email;
    private String phone;

    public bank(String number,double Balance,String Name,String Email,String phone){
        this.number=number;
        this.Balance=Balance;
        this.Name=Name;
        this.Email=Email;
        this.phone=phone;
    }
    public void getemail(String getemail){
        System.out.println("Email found " + this.Email);
    }
    public void getnumber(String getnumber){
        System.out.println("Number found " + this.number);
    }

    public void DepositMoney(double DepositMoney){
        this.Balance+=DepositMoney;
        System.out.println("Deposit is successful,new Balance is " + this.Balance);
    }

    public void withdraw(double withdrawMoney){
        if(this.Balance-withdrawMoney<0){
            System.out.println("Wiithdraw Unsuccessful"+this.Balance + "  is left");
        }else{
            this.Balance-=withdrawMoney;
            System.out.println("Withdraw successful,Current balance is "+this.Balance);
        }
    }

    public String getNumber(){
        return number;
    }

    public void setnumber(String numberr){
        number=numberr;
    }

    public double getBalance(){
        return Balance;
    }

    public void setPhone(String phonee){
        phone=phonee;
    }
}
public class bankSystem{
    public static void main(String[] args) {
        bank accountname=new bank("12345",0.0,"Abhay","abhay@xyz.com","123123");
        accountname.DepositMoney(100);
        accountname.DepositMoney(150);
        accountname.withdraw(200);
        accountname.getemail(null);
        accountname.getnumber(null);
    }

}


