<%@page import="com.market.model.Branches"%>
<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBranchesServiceImplProxyid" scope="session" class="com.market.service.BranchesServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBranchesServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBranchesServiceImplProxyid.getEndpoint();
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
        sampleBranchesServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.market.service.BranchesServiceImpl getBranchesServiceImpl10mtemp = sampleBranchesServiceImplProxyid.getBranchesServiceImpl();
if(getBranchesServiceImpl10mtemp == null){
%>
<%=getBranchesServiceImpl10mtemp %>
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
        com.market.model.Branches getBranch15mtemp = sampleBranchesServiceImplProxyid.getBranch(id_1idTemp);
if(getBranch15mtemp == null){
%>
<%=getBranch15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">branchName:</TD>
<TD>
<%
if(getBranch15mtemp != null){
java.lang.String typebranchName18 = getBranch15mtemp.getBranchName();
        String tempResultbranchName18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebranchName18));
        %>
        <%= tempResultbranchName18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">location:</TD>
<TD>
<%
if(getBranch15mtemp != null){
java.lang.String typelocation20 = getBranch15mtemp.getLocation();
        String tempResultlocation20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelocation20));
        %>
        <%= tempResultlocation20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">brancheId:</TD>
<TD>
<%
if(getBranch15mtemp != null){
%>
<%=getBranch15mtemp.getBrancheId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 26:
        gotMethod = true;
        String id_2id=  request.getParameter("id29");
        int id_2idTemp  = Integer.parseInt(id_2id);
        boolean deleteBranch26mtemp = sampleBranchesServiceImplProxyid.deleteBranch(id_2idTemp);
        String tempResultreturnp27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteBranch26mtemp));
        %>
        <%= tempResultreturnp27 %>
        <%
break;
case 31:
        gotMethod = true;
        com.market.model.Branches[] getAllBranches31mtemp = sampleBranchesServiceImplProxyid.getAllBranches();
if(getAllBranches31mtemp == null){
%>
<%=getAllBranches31mtemp %>
<%
}else{
        String tempreturnp32 = null;
        if(getAllBranches31mtemp != null){
        	java.util.List<Branches> listreturnp43= java.util.Arrays.asList(getAllBranches31mtemp);
            for(Branches b : listreturnp43){
            	int bid = b.getBrancheId();
            	String bName = b.getBranchName();
            	String location = b.getLocation();
            	%>
            	Branch Name : <%=bName%>:: Branch Id : <%=bid %>:: Location : <%=location %>
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
        String branchName_4id=  request.getParameter("branchName39");
            java.lang.String branchName_4idTemp = null;
        if(!branchName_4id.equals("")){
         branchName_4idTemp  = branchName_4id;
        }
        String location_5id=  request.getParameter("location41");
            java.lang.String location_5idTemp = null;
        if(!location_5id.equals("")){
         location_5idTemp  = location_5id;
        }
        String brancheId_6id=  request.getParameter("brancheId43");
        int brancheId_6idTemp  = Integer.parseInt(brancheId_6id);
        %>
        <jsp:useBean id="com1market1model1Branches_3id" scope="session" class="com.market.model.Branches" />
        <%
        com1market1model1Branches_3id.setBranchName(branchName_4idTemp);
        com1market1model1Branches_3id.setLocation(location_5idTemp);
        com1market1model1Branches_3id.setBrancheId(brancheId_6idTemp);
        boolean addBranch34mtemp = sampleBranchesServiceImplProxyid.addBranch(com1market1model1Branches_3id);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addBranch34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
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