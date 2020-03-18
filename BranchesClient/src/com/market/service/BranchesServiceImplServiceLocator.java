/**
 * BranchesServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.service;

public class BranchesServiceImplServiceLocator extends org.apache.axis.client.Service implements com.market.service.BranchesServiceImplService {

    public BranchesServiceImplServiceLocator() {
    }


    public BranchesServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BranchesServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BranchesServiceImpl
    private java.lang.String BranchesServiceImpl_address = "http://localhost:8080/Branches/services/BranchesServiceImpl";

    public java.lang.String getBranchesServiceImplAddress() {
        return BranchesServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BranchesServiceImplWSDDServiceName = "BranchesServiceImpl";

    public java.lang.String getBranchesServiceImplWSDDServiceName() {
        return BranchesServiceImplWSDDServiceName;
    }

    public void setBranchesServiceImplWSDDServiceName(java.lang.String name) {
        BranchesServiceImplWSDDServiceName = name;
    }

    public com.market.service.BranchesServiceImpl getBranchesServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BranchesServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBranchesServiceImpl(endpoint);
    }

    public com.market.service.BranchesServiceImpl getBranchesServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.market.service.BranchesServiceImplSoapBindingStub _stub = new com.market.service.BranchesServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getBranchesServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBranchesServiceImplEndpointAddress(java.lang.String address) {
        BranchesServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.market.service.BranchesServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.market.service.BranchesServiceImplSoapBindingStub _stub = new com.market.service.BranchesServiceImplSoapBindingStub(new java.net.URL(BranchesServiceImpl_address), this);
                _stub.setPortName(getBranchesServiceImplWSDDServiceName());
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
        if ("BranchesServiceImpl".equals(inputPortName)) {
            return getBranchesServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.market.com", "BranchesServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.market.com", "BranchesServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BranchesServiceImpl".equals(portName)) {
            setBranchesServiceImplEndpointAddress(address);
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
