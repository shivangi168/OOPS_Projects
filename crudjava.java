import java.util.*;

// import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

public class crudjava {
    public static void main(String[] args) {

        // Collection<employee> c=new ArrayList<employee>();
        List<employee> c=new ArrayList<employee>();

        Scanner scn=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.print("Enter Your Choice : ");
            ch=scn.nextInt();

            switch(ch){
                case 1:
                      System.out.print("Enter empiID : ");
                      int eid=scn.nextInt();
                      System.out.print("Enter Employee name: ");
                      String enme=s1.nextLine();
                      System.out.print("Enter Salary: ");
                      int sal=scn.nextInt();
                      c.add(new employee(eid, enme, sal));
                break;

                case 2:
                System.out.println("**********************************");
                Iterator<employee> i=c.iterator();
                while(i.hasNext()){
                    employee e=i.next();
                    System.out.println(e); 
                }
                System.out.println("************************************");
                break;

                case 3:
                boolean found=false;
                System.out.print("Enter empId to search: ");
                // System.out.println("*************************************");
                int empid = scn.nextInt();
                System.out.println("*************************************");
                i=c.iterator();
                while(i.hasNext()){
                    employee e=i.next();
                    if(e.getempId()==empid){
                        System.out.println(e);
                        found=true;
                    }
                }
                if(!found){
                    System.out.println("Record Not Found");
                }
                System.out.println("**************************************");
                break;

                case 4:

                found=false;
                System.out.println("Enter empId to delete: ");
                // System.out.println("*************************************");
                empid = scn.nextInt();
                System.out.println("*************************************");
                i=c.iterator();
                while(i.hasNext()){
                    employee e=i.next();
                    if(e.getempId()==empid){
                        // System.out.println(e);
                        i.remove();
                        found=true;
                    }
                } 
                if(!found){
                    System.out.print("Record Not Found");
                }
                else{
                    System.out.println("Record is deleted successfully.");
                }
                System.out.println("**************************************");
                break;


                case 5:
                found=false;
                System.out.print("Enter empId to update: ");
                // System.out.println("*************************************");
                empid = scn.nextInt();
                System.out.println("*************************************");
                ListIterator<employee> li=c.listIterator();
                // i=c.iterator();
                while(li.hasNext()){
                    employee e=li.next();
                    if(e.getempId()==empid){
                        System.out.println("Enter new Name : ");
                        String ename=s1.nextLine();
                        System.out.println("Enter new Salary : ");
                        int salary=s1.nextInt();
                        li.set(new employee(empid, ename, salary)); 
                        found=true;
                    }
                }
                if(!found){
                    System.out.println("Record Not Found");
                }
                else{
                    System.out.println("Record is updated successfully...!");
                }
                System.out.println("**************************************");
                break;
            }

        }
        while(ch!=0);    
        
    }
    
}
class employee{
    private int empid;
    private String ename;
    private int salary;

    public employee(int empid,String ename,int salary){
        this.empid=empid;
        this.ename=ename;
        this.salary=salary;

    }
    public int getempId(){
        return empid;
    }
    public void setempId(int empid){
        this.empid=empid;
    }

    public int getSalry(){
        return empid;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }

    public String geteName(){
        return ename;
    }
    public void setempId(String ename){
        this.ename=ename;
    }
    public String toString(){
        return empid+" "+ename+" "+salary;
    }
}
