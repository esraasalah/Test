import java.rmi.*;
import java.rmi.registry.*;


public class Server {

   public static void main(String [] args)

    {

     new Server();


    }


    public Server ()
   {

        try{

                CalcImp obj=new CalcImp();
                
                Registry reg=LocateRegistry.getRegistry();

                reg.rebind("CalcService",obj);
            }

       catch(RemoteException ex){

               ex.printStackTrace();  

          
        }

} 












         }