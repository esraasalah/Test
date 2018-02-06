import java.rmi.*;
import java.rmi.server.*;


public class CalcImp extends UnicastRemoteObject implements CalcInt
{


   public CalcImp() throws RemoteException{


    }

    // my methods 
    public double add( double x ,int y)
   {
       return x+y;
   }


   public double sub(double x,int y)
   {
       return x-y;
   }
   
   public double multi(double x,int y)
   {
       return x*y;
   }


    public double div(double x,int y)
   {
       return x/y;
   }


}