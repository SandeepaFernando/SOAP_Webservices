package com.market.service;

public class GroceryServiceImplProxy implements com.market.service.GroceryServiceImpl {
  private String _endpoint = null;
  private com.market.service.GroceryServiceImpl groceryServiceImpl = null;
  
  public GroceryServiceImplProxy() {
    _initGroceryServiceImplProxy();
  }
  
  public GroceryServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initGroceryServiceImplProxy();
  }
  
  private void _initGroceryServiceImplProxy() {
    try {
      groceryServiceImpl = (new com.market.service.GroceryServiceImplServiceLocator()).getGroceryServiceImpl();
      if (groceryServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)groceryServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)groceryServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (groceryServiceImpl != null)
      ((javax.xml.rpc.Stub)groceryServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.market.service.GroceryServiceImpl getGroceryServiceImpl() {
    if (groceryServiceImpl == null)
      _initGroceryServiceImplProxy();
    return groceryServiceImpl;
  }
  
  public com.market.model.Grocery getItem(int id) throws java.rmi.RemoteException{
    if (groceryServiceImpl == null)
      _initGroceryServiceImplProxy();
    return groceryServiceImpl.getItem(id);
  }
  
  public boolean addItem(com.market.model.Grocery g) throws java.rmi.RemoteException{
    if (groceryServiceImpl == null)
      _initGroceryServiceImplProxy();
    return groceryServiceImpl.addItem(g);
  }
  
  public boolean deleteItem(int id) throws java.rmi.RemoteException{
    if (groceryServiceImpl == null)
      _initGroceryServiceImplProxy();
    return groceryServiceImpl.deleteItem(id);
  }
  
  public com.market.model.Grocery[] getAllItems() throws java.rmi.RemoteException{
    if (groceryServiceImpl == null)
      _initGroceryServiceImplProxy();
    return groceryServiceImpl.getAllItems();
  }
  
  
}