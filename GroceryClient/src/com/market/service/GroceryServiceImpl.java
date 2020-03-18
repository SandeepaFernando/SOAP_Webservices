/**
 * GroceryServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.service;

public interface GroceryServiceImpl extends java.rmi.Remote {
    public com.market.model.Grocery getItem(int id) throws java.rmi.RemoteException;
    public boolean addItem(com.market.model.Grocery g) throws java.rmi.RemoteException;
    public boolean deleteItem(int id) throws java.rmi.RemoteException;
    public com.market.model.Grocery[] getAllItems() throws java.rmi.RemoteException;
}
