import java.rmi.*;
import java.rmi.registry.*;

public class Client{



      public static void main(String[] args)

      {

		
             try{

                 Registry reg=LocateRegistry.getRegistry("127.0.0.1");
                 
                 CalcInt calcRef=(CalcInt) reg.lookup("CalcService");
                   
                 // calc logic

                 

                 if(args.length==0)
                     {System.out.println("you did not enter any thing ");}
                else{
                    if(args[0].matches("[a-zA-Z]"))
                       {System.out.println("you enterd chars this is invalid");}
                    else if(args.length<1 | args.length<2 | args.length<3){
                      System.out.println("invalid arthmetic oper ");
                        }
                    else if(args.length>3){System.out.println("you enter more than 2 numbers");}
                    else{
                         double num1=Double.parseDouble(args[0]);
                         int num2=Integer.parseInt(args[2]);

                        
                         switch(args[1]){
                               case "+":
                                      
                                     double res= calcRef.add(num1,num2);
                                     System.out.println(res);
                                      break;
                                       
                                  
                               case "-":
                                       res=calcRef.sub(num1,num2);
                                       System.out.println(res);
                                      break;

                               case "(*)":
                                      res= calcRef.multi(num1,num2);
                                      System.out.println(res);
                                       break;
                       
                                case "/":
                                       if(num2==0){System.out.println("can not divid by zero");}
                                       else{
                                             res=calcRef.div(num1,num2);
                                             System.out.println(res);
                                       break;
                                           }
                                default:
                                System.out.println("your arithmatic operator is invalid");
                                       }
                            }
          
                            }
                    }
                        
                   
                  

              catch(Exception  ex){  ex.printStackTrace();  }
                



      }
      
      public Client(){
             

              }

}