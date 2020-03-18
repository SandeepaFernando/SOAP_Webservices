package com.market.service;

public class UserServiceImplProxy implements com.market.service.UserServiceImpl {
  private String _endpoint = null;
  private com.market.service.UserServiceImpl userServiceImpl = null;
  
  public UserServiceImplProxy() {
    _initUserServiceImplProxy();
  }
  
  public UserServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceImplProxy();
  }
  
  private void _initUserServiceImplProxy() {
    try {
      userServiceImpl = (new com.market.service.UserServiceImplServiceLocator()).getUserServiceImpl();
      if (userServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userServiceImpl != null)
      ((javax.xml.rpc.Stub)userServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.market.service.UserServiceImpl getUserServiceImpl() {
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl;
  }
  
  public com.market.model.User getUser(int id) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.getUser(id);
  }
  
  public com.market.model.User[] getAllUsers() throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.getAllUsers();
  }
  
  public boolean addUser(com.market.model.User u) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.addUser(u);
  }
  
  public boolean deleteUser(int id) throws java.rmi.RemoteException{
    if (userServiceImpl == null)
      _initUserServiceImplProxy();
    return userServiceImpl.deleteUser(id);
  }
  
  
}