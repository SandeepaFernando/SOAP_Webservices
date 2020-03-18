/**
 * BranchesServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.service;

public interface BranchesServiceImpl extends java.rmi.Remote {
    public com.market.model.Branches getBranch(int id) throws java.rmi.RemoteException;
    public boolean deleteBranch(int id) throws java.rmi.RemoteException;
    public com.market.model.Branches[] getAllBranches() throws java.rmi.RemoteException;
    public boolean addBranch(com.market.model.Branches b) throws java.rmi.RemoteException;
}
