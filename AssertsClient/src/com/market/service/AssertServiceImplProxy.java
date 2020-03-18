package com.market.service;

public class AssertServiceImplProxy implements com.market.service.AssertServiceImpl {
  private String _endpoint = null;
  private com.market.service.AssertServiceImpl assertServiceImpl = null;
  
  public AssertServiceImplProxy() {
    _initAssertServiceImplProxy();
  }
  
  public AssertServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initAssertServiceImplProxy();
  }
  
  private void _initAssertServiceImplProxy() {
    try {
      assertServiceImpl = (new com.market.service.AssertServiceImplServiceLocator()).getAssertServiceImpl();
      if (assertServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)assertServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)assertServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (assertServiceImpl != null)
      ((javax.xml.rpc.Stub)assertServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.market.service.AssertServiceImpl getAssertServiceImpl() {
    if (assertServiceImpl == null)
      _initAssertServiceImplProxy();
    return assertServiceImpl;
  }
  
  public boolean addAssert(com.market.model.Asserts a) throws java.rmi.RemoteException{
    if (assertServiceImpl == null)
      _initAssertServiceImplProxy();
    return assertServiceImpl.addAssert(a);
  }
  
  public boolean deleteAssert(int id) throws java.rmi.RemoteException{
    if (assertServiceImpl == null)
      _initAssertServiceImplProxy();
    return assertServiceImpl.deleteAssert(id);
  }
  
  public com.market.model.Asserts[] getAllAsserts() throws java.rmi.RemoteException{
    if (assertServiceImpl == null)
      _initAssertServiceImplProxy();
    return assertServiceImpl.getAllAsserts();
  }
  
  public com.market.model.Asserts getAssert(int id) throws java.rmi.RemoteException{
    if (assertServiceImpl == null)
      _initAssertServiceImplProxy();
    return assertServiceImpl.getAssert(id);
  }
  
  
}