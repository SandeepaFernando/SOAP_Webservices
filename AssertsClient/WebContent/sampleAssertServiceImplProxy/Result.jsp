<%@page import="com.market.model.Asserts"%>
<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAssertServiceImplProxyid" scope="session" class="com.market.service.AssertServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAssertServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAssertServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAssertServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.market.service.AssertServiceImpl getAssertServiceImpl10mtemp = sampleAssertServiceImplProxyid.getAssertServiceImpl();
if(getAssertServiceImpl10mtemp == null){
%>
<%=getAssertServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String assertName_2id=  request.getParameter("assertName20");
            java.lang.String assertName_2idTemp = null;
        if(!assertName_2id.equals("")){
         assertName_2idTemp  = assertName_2id;
        }
        String quantity_3id=  request.getParameter("quantity22");
        int quantity_3idTemp  = Integer.parseInt(quantity_3id);
        String assertId_4id=  request.getParameter("assertId24");
        int assertId_4idTemp  = Integer.parseInt(assertId_4id);
        %>
        <jsp:useBean id="com1market1model1Asserts_1id" scope="session" class="com.market.model.Asserts" />
        <%
        com1market1model1Asserts_1id.setAssertName(assertName_2idTemp);
        com1market1model1Asserts_1id.setQuantity(quantity_3idTemp);
        com1market1model1Asserts_1id.setAssertId(assertId_4idTemp);
        boolean addAssert15mtemp = sampleAssertServiceImplProxyid.addAssert(com1market1model1Asserts_1id);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addAssert15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 26:
        gotMethod = true;
        String id_5id=  request.getParameter("id29");
        int id_5idTemp  = Integer.parseInt(id_5id);
        boolean deleteAssert26mtemp = sampleAssertServiceImplProxyid.deleteAssert(id_5idTemp);
        String tempResultreturnp27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteAssert26mtemp));
        %>
        <%= tempResultreturnp27 %>
        <%
break;
case 31:
        gotMethod = true;
        com.market.model.Asserts[] getAllAsserts31mtemp = sampleAssertServiceImplProxyid.getAllAsserts();
if(getAllAsserts31mtemp == null){
%>
<%=getAllAsserts31mtemp %>
<%
}else{
        String tempreturnp32 = null;
        if(getAllAsserts31mtemp != null){
        	java.util.List<Asserts> listreturnp43= java.util.Arrays.asList(getAllAsserts31mtemp);
            for(Asserts a : listreturnp43){
            	int assertId = a.getAssertId();
            	int quantity = a.getQuantity();
            	String assertName=a.getAssertName();
            	%>
            	AssertID : <%=assertId%>:: Quantity of Assert : <%=quantity %>:: Assert Name : <%=assertName %>
            	<%
            	}
        }
        %>
        <%=tempreturnp32%>
        <%
}
break;
case 34:
        gotMethod = true;
        String id_6id=  request.getParameter("id43");
        int id_6idTemp  = Integer.parseInt(id_6id);
        com.market.model.Asserts getAssert34mtemp = sampleAssertServiceImplProxyid.getAssert(id_6idTemp);
if(getAssert34mtemp == null){
%>
<%=getAssert34mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">assertName:</TD>
<TD>
<%
if(getAssert34mtemp != null){
java.lang.String typeassertName37 = getAssert34mtemp.getAssertName();
        String tempResultassertName37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeassertName37));
        %>
        <%= tempResultassertName37 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">quantity:</TD>
<TD>
<%
if(getAssert34mtemp != null){
%>
<%=getAssert34mtemp.getQuantity()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">assertId:</TD>
<TD>
<%
if(getAssert34mtemp != null){
%>
<%=getAssert34mtemp.getAssertId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>