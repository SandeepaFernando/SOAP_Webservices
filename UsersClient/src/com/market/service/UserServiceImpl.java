/**
 * UserServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.service;

public interface UserServiceImpl extends java.rmi.Remote {
    public com.market.model.User getUser(int id) throws java.rmi.RemoteException;
    public com.market.model.User[] getAllUsers() throws java.rmi.RemoteException;
    public boolean addUser(com.market.model.User u) throws java.rmi.RemoteException;
    public boolean deleteUser(int id) throws java.rmi.RemoteException;
}
