/**
 * Asserts.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.market.model;

public class Asserts  implements java.io.Serializable {
    private int assertId;

    private java.lang.String assertName;

    private int quantity;

    public Asserts() {
    }

    public Asserts(
           int assertId,
           java.lang.String assertName,
           int quantity) {
           this.assertId = assertId;
           this.assertName = assertName;
           this.quantity = quantity;
    }


    /**
     * Gets the assertId value for this Asserts.
     * 
     * @return assertId
     */
    public int getAssertId() {
        return assertId;
    }


    /**
     * Sets the assertId value for this Asserts.
     * 
     * @param assertId
     */
    public void setAssertId(int assertId) {
        this.assertId = assertId;
    }


    /**
     * Gets the assertName value for this Asserts.
     * 
     * @return assertName
     */
    public java.lang.String getAssertName() {
        return assertName;
    }


    /**
     * Sets the assertName value for this Asserts.
     * 
     * @param assertName
     */
    public void setAssertName(java.lang.String assertName) {
        this.assertName = assertName;
    }


    /**
     * Gets the quantity value for this Asserts.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Asserts.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Asserts)) return false;
        Asserts other = (Asserts) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.assertId == other.getAssertId() &&
            ((this.assertName==null && other.getAssertName()==null) || 
             (this.assertName!=null &&
              this.assertName.equals(other.getAssertName()))) &&
            this.quantity == other.getQuantity();
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
        _hashCode += getAssertId();
        if (getAssertName() != null) {
            _hashCode += getAssertName().hashCode();
        }
        _hashCode += getQuantity();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Asserts.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.market.com", "Asserts"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.market.com", "assertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.market.com", "assertName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.market.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
