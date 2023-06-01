/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpooling_package;

/**
 *
 * @author comp
 */
import java.awt.Event;
import java.util.*;
import sun.security.krb5.internal.Ticket;
/**
 * this car contain all data about car (unique_code , driver_name , unique_route,start location,end location,car type,.....etc;)
 * this class contain overloading
 *  getter and setter
 * @author comp
 */
 public class car
{
String  unique_code , driver_name , unique_route,startlocation,endlocation,cartype;
int number_of_trips_per_day , maximum_capacity;      

    public car(String cartype,String unique_code, String driver_name, String unique_route, String startlocation, String endlocation, int number_of_trips_per_day, int maximum_capacity) {
        this.unique_code = unique_code;
        this.driver_name = driver_name;
        this.unique_route = unique_route;
        this.startlocation = startlocation;
        this.endlocation = endlocation;
        this.number_of_trips_per_day = number_of_trips_per_day;
        this.maximum_capacity = maximum_capacity;
        this.cartype=cartype;
    }

    public car(String cartype) {//overlodding
        this.cartype=cartype;
    }

    public void setUnique_code(String unique_code) {
        this.unique_code = unique_code;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public void setUnique_route(String unique_route) {
        this.unique_route = unique_route;
    }

    public void setStartlocation(String startlocation) {
        this.startlocation = startlocation;
    }

    public void setEndlocation(String endlocation) {
        this.endlocation = endlocation;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public void setNumber_of_trips_per_day(int number_of_trips_per_day) {
        this.number_of_trips_per_day = number_of_trips_per_day;
    }

    public void setMaximum_capacity(int maximum_capacity) {
        this.maximum_capacity = maximum_capacity;
    }

    public String getUnique_code() {
        return unique_code;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public String getUnique_route() {
        return unique_route;
    }

    public String getStartlocation() {
        return startlocation;
    }

    public String getEndlocation() {
        return endlocation;
    }

    public String getCartype() {
        return cartype;
    }

    public int getNumber_of_trips_per_day() {
        return number_of_trips_per_day;
    }

    public int getMaximum_capacity() {
        return maximum_capacity;
    }


}
//////////////////////////////////////////////////
/**
 * class interface this is an abstract class which have one function is called my face
 * @author comp
 */
public interface myinterface
{
 void myface();


}
/**
 * the  responsibility of this class print the ticket
 * this class have:
 * final data member
 * final method
 * @author comp
 */
  public class tichet
{
final int tickets=100;

    public tichet() {
    }


     final public void the_ticket(String location)
   {  
        System.out.println("*************Yor ticket*******************");
        System.out.println("Im coming........");
                if(location.equals("qulube")||location.equals("banha")) 
                {
                    System.out.println("The car type : BMW");
                    System.out.println("The car code : ABC123");
                    System.out.println("The driver name : Ahmed mohamed");
                    System.out.println("The car route : agriculture route");
                    
                }
                else if(location.equals("shoubra")||location.equals("6october"))
                {
                
                    System.out.println("The car type : Hundi");
                    System.out.println("The car code : ABC246");
                    System.out.println("The driver name : Ahmed hossam");
                    System.out.println("The car route : agriculture route");
                    
                
                }
                else if(location.equals("21K")||location.equals("Alex"))
                {
                System.out.println("The car type : marcedes");
                    System.out.println("The car code : Egy147");
                    System.out.println("The driver name : mohamed samir");
                    System.out.println("The car route : agriculture route");
                    
                
                }
                else
                {
                
                System.out.println("The car type : kin");
                    System.out.println("The car code : EGY852");
                    System.out.println("The driver name : Eslam mohamed");
                    System.out.println("The car route : agriculture route");
                    
                
                }

    }

}

   
    

////////////////////////////////////
/**
 * this is the mouther class 
 * this have more concept :
 * abstract class
 * abstract method
 * static data member
 * @author comp
 */
 public abstract class passenger
{  final int size=4;
 int age;
    int number_OF_trib;
    String name;
    static String location;
    Scanner input =new Scanner(System.in);
    public passenger(int age, int number_OF_trib,String name) {
        this.age = age;
        this.number_OF_trib = number_OF_trib;
        this.name=name;
    }
tichet t;
    public passenger() {
    }
    
    
    public abstract void search();
    abstract void complain();
   
    
}



//////////////////////////////////////////////////////////////
/**
 * class subscribe this is a child class 
 * this extends with passenger class(mother class) 
 * this have more concept:
 * inherence final method static method's
 * override and over loading
 * override for the function in the interface class
 * i calculated all data member
 * 
 * @author comp
 */
 public class Subscribe extends passenger implements myinterface
{

    public Subscribe(int age, int number_OF_trib, String name) {
        super(age, number_OF_trib, name);
    }

    public Subscribe() {
    }
public void myface()
{
System.out.println("my CarPooling System");
    System.out.println("**************************************************");
     System.out.println("**************************************************");

}
  
     static void unsubscribe()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name ");
        String name =input.next();
        if(name .equals("ahmedmohamed"))
          {
passenger arr[]=new passenger[4];
    passenger p1=new Subscribe(25, 4,"ahmedsamir");
     passenger p2=new Subscribe(20, 4, "ahmedmohamed");
     arr[0]=p1;
    // arr[1]=p2;
   
             arr[1]=null; 
              System.out.println("you now unsubscrib");
        }
        else if(name .equals("ahmedsamir"))
        {passenger arr[]=new passenger[4];
            passenger p1=new Subscribe(25, 4,"ahmedsamir");
           passenger p2=new Subscribe(20, 4, "ahmedmohamed");
                  arr[0]=null;
                  arr[1]=p2;
                   System.out.println("you now unsubscrib");
        }
        else 
        {
            System.out.println("you already unsubscribe2");
        }
    }
   
    public void  culculat_with_discount()
    {  
        System.out.println("Please enter the number of trips.\"one trip = 100 LM\"");
 int x=input.nextInt();
 int y;
    if(x>4)
    {
        System.out.println("You cant add more than 4");
        x=input.nextInt();
    }
    else
    {
        System.out.println("the is dependent on num of trip =50");
        y=(x*100)/2;
        System.out.println("the total price :"+y);
    }
   }
    @Override
   /**
    * the 3 concept abstract class and abstract method and override are applied in class passenger 
    * inherence and overloading
    */
     public void search()
           
    {  
        
        System.out.println("*********************************  Welcome  ************************");
        System.out.println("(1) For start search");
        System.out.println("(2)To unsubscribe   ");
        System.out.println("(3) To complain ");
        int l=input.nextInt();
        switch(l)
        {
            case 1:
                /**
                 * final data member
                 */
       final int size=4;
        car Cars[]=new car[size];
       
       final car car1=new car("BMW","ABC123","Ahmed mohamed","agriculture route","qulube","banha", 4, 4);
        final car car2=new car("Hundi","ABC246","Ahmed hossam","agriculture route","shoubra","6october", 4, 4);
        final car car3=new car("marcedes","Egy147","mohamed samir","agriculture route","21K","Alex", 4,4);
        final car car4=new car("kin","EGY852","Eslam mohamed","agriculture route","abood","sedy abd alrahman",4,4);
        Cars[0]=car1;
        Cars[1]=car2;
        Cars[2]=car3;
        Cars[3]=car4;
        passenger arr[]=new passenger[size];
    passenger p1=new Subscribe(25, 4,"ahmedsamir");
     passenger p2=new Subscribe(20, 4, "ahmedmohamed");
     arr[0]=p1;
     arr[1]=p2;
               
        System.out.println("please enter your start or end location");
         String location=input.next();
       if(location.equals(Cars[0].startlocation)|| location.equals(Cars[0].endlocation)||location.equals(Cars[1].endlocation)||location.equals(Cars[1].startlocation)||location.equals(Cars[2].endlocation)||location.equals(Cars[2].startlocation)||location.equals(Cars[3].endlocation)||location.equals(Cars[3].startlocation))
       {
           System.out.println("To reserve please follow the program");
           System.out.println("please enter your name");
           String name = input.next();
           for(int i=0;i<2;i++)
           {
          if(name.equals(arr[i].name))
          {
              tichet a=new tichet();
             Subscribe s1=new Subscribe(25, 4,"ahmedsamir");
            a.the_ticket(location);
             
               s1.culculat_with_discount();
               
            
              break;
          }
            else
            {
                System.out.println("you unsubscribe");
                int x;
                System.out.println("(1) To subscribe");
                System.out.println("(2) To Only  reserved");
               x=input.nextInt();
                switch(x)
                {
                    case 1:
                  tichet B=new tichet();
                        unSubscribe s=new unSubscribe();
                        s.subscribe(age, number_OF_trib, name);
                        Subscribe s1=new Subscribe(25, 4,"ahmedsamir");
                       
                        B.the_ticket(location);
                          System.out.println("your name is "+ name );
                        s1.culculat_with_discount();
                        break;
                    case 2:
                      tichet W=new tichet();      
                        unSubscribe a=new unSubscribe();
                        a.reserve();
                        W.the_ticket(location);
                        a.culculte_without_discount();
                        System.out.println("you are reseved now ");
                        System.out.println("***********************************************");
                        System.out.println("***********************************************");
                        break;
                        
                }
                 break;                     
                        
              
                
            } 
           }
      }
       else
       {
           System.out.println("your location is not available ");
           System.out.println("***************************************");
           System.out.println("The available route is :");
           System.out.println("(1)From qalube to banha ");
           System.out.println("(2)From shoubra to 6october ");
           System.out.println("(3)From 21K to Alex ");
           System.out.println("(4)From abood to sedy abd alrahman ");
           System.out.println("if you want choose again you should close the program and start again \"********* Thank you *******\"");
       }
       break;
         case 2:
           Subscribe .unsubscribe();
           
                break;
         case 3:
             complain();
             break;
}
    }
     @Override
             /**
     * override for complain function
     * complain is a abstract function
     * abstract class passenger
     */
     public void complain()
   {
       System.out.println("What is your problem my cars and drivers");
       String x=input.next();
       System.out.println("Do you know the deiver name (yes or no)");
       String y=input.next();
       if(y.equals("yes"))
       {
            final int size=4;
        car Cars[]=new car[size];
       
            final car car1=new car("BMW","ABC123","Ahmed mohamed","agriculture route","qulube","banha", 4, 4);
        final car car2=new car("Hundi","ABC246","Ahmed hossam","agriculture route","shoubra","6october", 4, 4);
        final car car3=new car("marcedes","Egy147","mohamed samir","agriculture route","21K","Alex", 4,4);
        final car car4=new car("kin","EGY852","Eslam mohamed","agriculture route","abood","sedy abd alrahman",4,4);
        Cars[0]=car1;
        Cars[1]=car2;
        Cars[2]=car3;
        Cars[3]=car4;
           System.out.println("please enter the driver name");
       String Dn=input.next();
       
       if(Dn.equals("Ahmedmohamed")||Dn.equals("Ahmedhossam")||Dn.equals("mohamedsamir")||Dn.equals("Eslammohamed"))
       {
           System.out.println("sorry we promise you that we will solve thw project");
      
       }
       else 
       {System.out.println("Sorry the name is not exist");
       
       }
       
       }
       else
       {
           System.out.println(" sorry sir about the problem and we will chick the data and know the driver name and every thing");
       
       }
   }
}

//////////////////////////////////////////////////////////////////////
/**
 * class un subscribe this is a child class 
 * this extends with passenger class(mother class) 
 * this have more concept:
 * inherence final method static method's
 * override and over loading
 * i calculated all data member
 * @author comp
 */
public  class unSubscribe extends passenger
{

    public unSubscribe(int age, int number_OF_trib, String name) {
        super(age, number_OF_trib, name);
    }

    public unSubscribe() {
    }
    
  /**
   * final method and final data member 
   * size is a final data member
   */
    final public void culculte_without_discount()
    {
//passenger e=new passenger();
        System.out.println("please enter n of trips again to add the price to your ticket");
        int x=input.nextInt();
        
        int totalprice=((x*100));
        System.out.println("the total price " + totalprice);
    }
    public void reserve()
    { 
       // passenger r=new passenger();
        System.out.println("enter your age");
        int age = input.nextInt();
               System.out.println("enter the number of trip \"all trips in the same route with the same car  \"");
               System.out.println("if you want to choose nthor route you should close it");
                int numberTR=input.nextInt();
               if(numberTR>4)
               {
                   System.out.println("you cant add more than 4 trip");
               
               }
    }
    
    
    public void subscribe(int age,int ntrib,String nameUnsu)
    {
    passenger arr[]=new passenger[size];
    passenger p1=new Subscribe(25, 4,"ahmedsamir");
     passenger p2=new Subscribe(20, 4, "ahmedmohamed");
     passenger p3=new Subscribe(age, ntrib, nameUnsu);
     
     arr[0]=p1;
     arr[1]=p2;
     /**
      * exception handle (try and catch)
      * 
      */
     
                     try
                         {
        
                         System.out.println("please enter the num of tribs");
                         ntrib=input.nextInt();
                         
                        System.out.println("please enter your age");
                         age=input.nextInt();
                         if(age >80&&age<10 && ntrib>4 )
                         {
                         
                             System.out.println("Sorry you cant use this program");
                         }
                         else
                         {
                            
                        passenger p4=new unSubscribe(age,ntrib,nameUnsu);
                         arr[2]=p4;
                         }
                         }
                         catch(ArithmeticException e)
                         {
                             System.out.println("you cant subscribe now ");
                         }
    }
    
    @Override
     /**
     * override for complain function
     * complain is a abstract function
     * abstract class passenger
     */
    void complain()
   {
       System.out.println("What is your problem my cars and drivers");
       String x=input.next();
       System.out.println("Do you know the deiver name (yes or no)");
       String y=input.next();
       if(y.equals("yes"))
       {
            final int size=4;
        car Cars[]=new car[size];
       
            final car car1=new car("BMW","ABC123","Ahmed mohamed","agriculture route","qulube","banha", 4, 4);
        final car car2=new car("Hundi","ABC246","Ahmed hossam","agriculture route","shoubra","6october", 4, 4);
        final car car3=new car("marcedes","Egy147","mohamed samir","agriculture route","21K","Alex", 4,4);
        final car car4=new car("kin","EGY852","Eslam mohamed","agriculture route","abood","sedy abd alrahman",4,4);
        Cars[0]=car1;
        Cars[1]=car2;
        Cars[2]=car3;
        Cars[3]=car4;
           System.out.println("please enter the driver name");
       String Dn=input.next();
       
       if(Dn.equals("Ahmedmohamed")||Dn.equals("Ahmedhossam")||Dn.equals("mohamedsamir")||Dn.equals("Eslammohamed"))
       {
           System.out.println("sorry we promise you that we will solve thw project");
      
       }
       else 
       {System.out.println("Sorry the name is not exist");
       
       }
       
       }
       else
       {
           System.out.println(" sorry sir about the problem and we will chick the data and know the driver name and every thing");
       
       }
   }
    @Override
    /**
     * override or search function
     * search is a abstract function
     * abstract class passenger
     */
    public void search()
           
    {  System.out.println("*********************************  Welcome  ************************");
        System.out.println("(1) For start search");
        System.out.println("(2)To unsubscribe   ");
        System.out.println("(3) To complain ");
        int l=input.nextInt();
        switch(l)
        {
            case 1:
       final int size=4;
        car Cars[]=new car[size];
       
       final car car1=new car("BMW","ABC123","Ahmed mohamed","agriculture route","qulube","banha", 4, 4);
        final car car2=new car("Hundi","ABC246","Ahmed hossam","agriculture route","shoubra","6october", 4, 4);
        final car car3=new car("marcedes","Egy147","mohamed samir","agriculture route","21K","Alex", 4,4);
        final car car4=new car("kin","EGY852","Eslam mohamed","agriculture route","abood","sedy abd alrahman",4,4);
        Cars[0]=car1;
        Cars[1]=car2;
        Cars[2]=car3;
        Cars[3]=car4;
        passenger arr[]=new passenger[size];
  // passenger arr[]=new passenger[size];
     passenger p1=new Subscribe(25, 2,"ahmedsamir");
     passenger p2=new Subscribe(20, 3, "ahmed mohamed ");
    
     arr[0]=p1;
     arr[1]=p2;
        System.out.println("please enter your start or end location");
          location=input.next();
       if(location.equals(Cars[0].startlocation)|| location.equals(Cars[0].endlocation)||location.equals(Cars[1].endlocation)||location.equals(Cars[1].startlocation)||location.equals(Cars[2].endlocation)||location.equals(Cars[2].startlocation)||location.equals(Cars[3].endlocation)||location.equals(Cars[3].startlocation))
       {
           System.out.println("To reserve please follow the program");
           System.out.println("please enter your name");
           String name = input.next();
           for(int i=0;i<4;i++)
           {
          if(name.equals(arr[i].name))
          {
              
             Subscribe s1=new Subscribe(25, 4,"ahmedsamir");
             t.the_ticket(location);
             
               s1.culculat_with_discount();
               
            
              break;
          }
            else
            {
                System.out.println("you unsubscribe");
                int x;
                System.out.println("(1) To subscribe");
                System.out.println("(2) To Only  reserved");
               x=input.nextInt();
                switch(x)
                {
                    case 1:
                     // Ticket T=new Ticket(location);
                        unSubscribe s=new unSubscribe();
                        s.subscribe(age, number_OF_trib, name);
                        Subscribe s1=new Subscribe(25, 4,"ahmedsamir");
                       s1.search();
                          t.the_ticket(location);
                          System.out.println("your name is "+ name );
                        s1.culculat_with_discount();
                        break;
                    case 2:
                       // passenger w=new passenger();
                        unSubscribe a=new unSubscribe();
                        a.reserve();
                         t.the_ticket(location);
                        a.culculte_without_discount();
                        System.out.println("you are reseved now ");
                        System.out.println("***********************************************");
                        System.out.println("***********************************************");
                        break;
                        
                }
                 break;                     
                        
              
                
            } 
           }
      }
       else
       {
           System.out.println("your location is not available ");
           System.out.println("***************************************");
           System.out.println("The available route is :");
           System.out.println("(1)From qalube to banha ");
           System.out.println("(2)From shoubra to 6october ");
           System.out.println("(3)From 21K to Alex ");
           System.out.println("(4)From abood to sedy abd alrahman ");
           System.out.println("if you want choose again you should close the program and start again \"********* Thank you *******\"");
       }
       break;
         case 2:
           Subscribe .unsubscribe();
           
                break;
         case 3:
             complain();
             break;
}
    }
}
/**
 * the main class which contain the main function 
 *all data are displayed in this function
 * @author comp
 */
public class Carpooling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int age, number_OF_trib;
 String name;
        Scanner input=new Scanner(System.in);
        int size=4;
        car Cars[]=new car[size];
        car car1=new car("BMW","ABC123","Ahmed mohamed","agriculture route","qulube","banha", 4, 4);
        car car2=new car("Hundi","ABC246","Ahmed hossam","agriculture route","shoubra","6october", 4, 4);
        car car3=new car("marcedes","Egy147","mohamed samir","agriculture route","21K","Alex", 4,4);
        car car4=new car("kin","EGY852","Eslam mohamed","agriculture route","abood","sedy abd alrahman",4,4);
        Cars[0]=car1;
        Cars[1]=car2;
        Cars[2]=car3;
        Cars[3]=car4;
     passenger arr[]=new passenger[size];
     passenger p1=new Subscribe(25, 2,"ahmedsamir");
     passenger p2=new Subscribe(20, 3, "ahmedmohamed ");
   
     arr[0]=p1;
     arr[1]=p2;
    
    
    try
    {
    myinterface  m=new Subscribe();
     m.myface();
    }
    catch(ArithmeticException e)
    {System.out.println("Error here");
    }
     p1.search();
        System.out.println("**************************************************************");
        System.out.println("**************************************************************");
        System.out.println(" (1)to display car data  ");
        System.out.println("(2)to display passenger data");
        int x=input.nextInt();
       if(x==1)
       {
           int i=0;
       while(i<4)
       {
           System.out.println("*******************************");
           System.out.println("driver name "+Cars[i].driver_name);
           System.out.println("car type "+Cars[i].cartype);
           System.out.println("unique code "+Cars[i].unique_code);
           System.out.println("this car route from "+Cars[i].startlocation+ " TO"+Cars[i].endlocation);
           System.out.println("the car capacity "+Cars[i].maximum_capacity);
       i++;
           System.out.println("******************************************************************************");
       }
       }
       else if(x==2)
       {
           int i=0;
      while(i<2) 
      {
          System.out.println("**********************************************************");
          System.out.println("subscribe passenger name "+arr[i].name);
       System.out.println("subscribe passenger age "+arr[i].age);
       System.out.println("subscribe passenger number of trips "+arr[i].age);
      i++;
       System.out.println("******************************************************************************");
      }
       }// TODO code application logic here
    }
    
}