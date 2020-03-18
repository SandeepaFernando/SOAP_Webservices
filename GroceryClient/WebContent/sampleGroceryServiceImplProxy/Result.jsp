<%@page import="com.market.model.Grocery"%>
<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGroceryServiceImplProxyid" scope="session" class="com.market.service.GroceryServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGroceryServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleGroceryServiceImplProxyid.getEndpoint();
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
        sampleGroceryServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.market.service.GroceryServiceImpl getGroceryServiceImpl10mtemp = sampleGroceryServiceImplProxyid.getGroceryServiceImpl();
if(getGroceryServiceImpl10mtemp == null){
%>
<%=getGroceryServiceImpl10mtemp %>
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
        String id_1id=  request.getParameter("id24");
        int id_1idTemp  = Integer.parseInt(id_1id);
        com.market.model.Grocery getItem15mtemp = sampleGroceryServiceImplProxyid.getItem(id_1idTemp);
if(getItem15mtemp == null){
%>
<%=getItem15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">itemName:</TD>
<TD>
<%
if(getItem15mtemp != null){
java.lang.String typeitemName18 = getItem15mtemp.getItemName();
        String tempResultitemName18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeitemName18));
        %>
        <%= tempResultitemName18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">quantity:</TD>
<TD>
<%
if(getItem15mtemp != null){
%>
<%=getItem15mtemp.getQuantity()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">itemId:</TD>
<TD>
<%
if(getItem15mtemp != null){
%>
<%=getItem15mtemp.getItemId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 26:
        gotMethod = true;
        String itemName_3id=  request.getParameter("itemName31");
            java.lang.String itemName_3idTemp = null;
        if(!itemName_3id.equals("")){
         itemName_3idTemp  = itemName_3id;
        }
        String quantity_4id=  request.getParameter("quantity33");
        int quantity_4idTemp  = Integer.parseInt(quantity_4id);
        String itemId_5id=  request.getParameter("itemId35");
        int itemId_5idTemp  = Integer.parseInt(itemId_5id);
        %>
        <jsp:useBean id="com1market1model1Grocery_2id" scope="session" class="com.market.model.Grocery" />
        <%
        com1market1model1Grocery_2id.setItemName(itemName_3idTemp);
        com1market1model1Grocery_2id.setQuantity(quantity_4idTemp);
        com1market1model1Grocery_2id.setItemId(itemId_5idTemp);
        boolean addItem26mtemp = sampleGroceryServiceImplProxyid.addItem(com1market1model1Grocery_2id);
        String tempResultreturnp27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addItem26mtemp));
        %>
        <%= tempResultreturnp27 %>
        <%
break;
case 37:
        gotMethod = true;
        String id_6id=  request.getParameter("id40");
        int id_6idTemp  = Integer.parseInt(id_6id);
        boolean deleteItem37mtemp = sampleGroceryServiceImplProxyid.deleteItem(id_6idTemp);
        String tempResultreturnp38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteItem37mtemp));
        %>
        <%= tempResultreturnp38 %>
        <%
break;
case 42:
        gotMethod = true;
        com.market.model.Grocery[] getAllItems42mtemp = sampleGroceryServiceImplProxyid.getAllItems();
if(getAllItems42mtemp == null){
%>
<%=getAllItems42mtemp %>
<%
}else{
        String tempreturnp43 = null;
        if(getAllItems42mtemp != null){
        	java.util.List<Grocery> listreturnp43= java.util.Arrays.asList(getAllItems42mtemp);
        	for(Grocery g : listreturnp43){
            	int id = g.getItemId();
            	String iName = g.getItemName();
            	int quantity = g.getQuantity();
            	%>
            	Item Name : <%=iName%>:: Item Id : <%=id %>:: Quantity : <%=quantity %>
            	<%
            	}
        }
        %>
        <%=tempreturnp43%>
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