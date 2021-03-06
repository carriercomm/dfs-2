package com.ds.interfaces;
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ClientInterface extends Remote{
	/**
	 * Update Server IP in case of failure 
	 * @param ip The secondary server IP
	 * @param port The secondary server port
	 * @throws RemoteException
	 */
	
	void updateServerIP(String ip,int port) throws RemoteException;
	
	
	/**
	 * Setting authentication token for each user to identify them
	 * @param auth_token The the generated authentication token generated by the server
	 * @throws RemoteException
	 * */
	void setAuthenticationToken(String auth_token) throws RemoteException;
	
	/**
	 * Getting the authentication token that has been given before by the server
	 * @return String as the authentication token
	 * */
	String getAuthenticationToken() throws RemoteException;
}
