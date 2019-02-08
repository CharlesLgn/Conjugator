package com.iut.verbe.comon.link;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;

public interface ServerInterface extends Remote {
    List<String> conjugaison(String verbe, int temps) throws RemoteException;
    HashMap<Integer, String> getListConj() throws RemoteException;
}
