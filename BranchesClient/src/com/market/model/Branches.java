/**
 * Branches.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.model;

public class Branches  implements java.io.Serializable {
    private java.lang.String branchName;

    private int brancheId;

    private java.lang.String location;

    public Branches() {
    }

    public Branches(
           java.lang.String branchName,
           int brancheId,
           java.lang.String location) {
           this.branchName = branchName;
           this.brancheId = brancheId;
           this.location = location;
    }


    /**
     * Gets the branchName value for this Branches.
     * 
     * @return branchName
     */
    public java.lang.String getBranchName() {
        return branchName;
    }


    /**
     * Sets the branchName value for this Branches.
     * 
     * @param branchName
     */
    public void setBranchName(java.lang.String branchName) {
        this.branchName = branchName;
    }


    /**
     * Gets the brancheId value for this Branches.
     * 
     * @return brancheId
     */
    public int getBrancheId() {
        return brancheId;
    }


    /**
     * Sets the brancheId value for this Branches.
     * 
     * @param brancheId
     */
    public void setBrancheId(int brancheId) {
        this.brancheId = brancheId;
    }


    /**
     * Gets the location value for this Branches.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Branches.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Branches)) return false;
        Branches other = (Branches) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.branchName==null && other.getBranchName()==null) || 
             (this.branchName!=null &&
              this.branchName.equals(other.getBranchName()))) &&
            this.brancheId == other.getBrancheId() &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBranchName() != null) {
            _hashCode += getBranchName().hashCode();
        }
        _hashCode += getBrancheId();
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Branches.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.market.com", "Branches"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.market.com", "branchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brancheId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.market.com", "brancheId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.market.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
