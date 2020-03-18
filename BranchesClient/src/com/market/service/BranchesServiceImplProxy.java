package com.market.service;

public class BranchesServiceImplProxy implements com.market.service.BranchesServiceImpl {
  private String _endpoint = null;
  private com.market.service.BranchesServiceImpl branchesServiceImpl = null;
  
  public BranchesServiceImplProxy() {
    _initBranchesServiceImplProxy();
  }
  
  public BranchesServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initBranchesServiceImplProxy();
  }
  
  private void _initBranchesServiceImplProxy() {
    try {
      branchesServiceImpl = (new com.market.service.BranchesServiceImplServiceLocator()).getBranchesServiceImpl();
      if (branchesServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)branchesServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)branchesServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (branchesServiceImpl != null)
      ((javax.xml.rpc.Stub)branchesServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.market.service.BranchesServiceImpl getBranchesServiceImpl() {
    if (branchesServiceImpl == null)
      _initBranchesServiceImplProxy();
    return branchesServiceImpl;
  }
  
  public com.market.model.Branches getBranch(int id) throws java.rmi.RemoteException{
    if (branchesServiceImpl == null)
      _initBranchesServiceImplProxy();
    return branchesServiceImpl.getBranch(id);
  }
  
  public boolean deleteBranch(int id) throws java.rmi.RemoteException{
    if (branchesServiceImpl == null)
      _initBranchesServiceImplProxy();
    return branchesServiceImpl.deleteBranch(id);
  }
  
  public com.market.model.Branches[] getAllBranches() throws java.rmi.RemoteException{
    if (branchesServiceImpl == null)
      _initBranchesServiceImplProxy();
    return branchesServiceImpl.getAllBranches();
  }
  
  public boolean addBranch(com.market.model.Branches b) throws java.rmi.RemoteException{
    if (branchesServiceImpl == null)
      _initBranchesServiceImplProxy();
    return branchesServiceImpl.addBranch(b);
  }
  
  
}