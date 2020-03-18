/**
 * GroceryServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.service;

public class GroceryServiceImplServiceLocator extends org.apache.axis.client.Service implements com.market.service.GroceryServiceImplService {

    public GroceryServiceImplServiceLocator() {
    }


    public GroceryServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GroceryServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GroceryServiceImpl
    private java.lang.String GroceryServiceImpl_address = "http://localhost:8080/Grocery/services/GroceryServiceImpl";

    public java.lang.String getGroceryServiceImplAddress() {
        return GroceryServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GroceryServiceImplWSDDServiceName = "GroceryServiceImpl";

    public java.lang.String getGroceryServiceImplWSDDServiceName() {
        return GroceryServiceImplWSDDServiceName;
    }

    public void setGroceryServiceImplWSDDServiceName(java.lang.String name) {
        GroceryServiceImplWSDDServiceName = name;
    }

    public com.market.service.GroceryServiceImpl getGroceryServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GroceryServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGroceryServiceImpl(endpoint);
    }

    public com.market.service.GroceryServiceImpl getGroceryServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.market.service.GroceryServiceImplSoapBindingStub _stub = new com.market.service.GroceryServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getGroceryServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGroceryServiceImplEndpointAddress(java.lang.String address) {
        GroceryServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.market.service.GroceryServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.market.service.GroceryServiceImplSoapBindingStub _stub = new com.market.service.GroceryServiceImplSoapBindingStub(new java.net.URL(GroceryServiceImpl_address), this);
                _stub.setPortName(getGroceryServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GroceryServiceImpl".equals(inputPortName)) {
            return getGroceryServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.market.com", "GroceryServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.market.com", "GroceryServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GroceryServiceImpl".equals(portName)) {
            setGroceryServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
