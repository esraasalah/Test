import java.rmi.*;


public interface CalcInt extends Remote 
{

    double add(double x, int y) throws RemoteException;
    double sub(double x, int y) throws RemoteException;
    double multi(double x, int y) throws RemoteException;
    double div(double x, int y) throws RemoteException;
}