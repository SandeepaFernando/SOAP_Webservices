/**
 * AssertServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.service;

public interface AssertServiceImpl extends java.rmi.Remote {
    public boolean addAssert(com.market.model.Asserts a) throws java.rmi.RemoteException;
    public boolean deleteAssert(int id) throws java.rmi.RemoteException;
    public com.market.model.Asserts[] getAllAsserts() throws java.rmi.RemoteException;
    public com.market.model.Asserts getAssert(int id) throws java.rmi.RemoteException;
}
