<%@page import="com.market.model.User"%>
<%@page contentType="text/html;charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
	<H1>Result</H1>

	<jsp:useBean id="sampleUserServiceImplProxyid" scope="session"
		class="com.market.service.UserServiceImplProxy" />
	<%
		if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
			sampleUserServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
	%>

	<%
		String method = request.getParameter("method");
		int methodID = 0;
		if (method == null)
			methodID = -1;

		if (methodID != -1)
			methodID = Integer.parseInt(method);
		boolean gotMethod = false;

		try {
			switch (methodID) {
			case 2:
				gotMethod = true;
				java.lang.String getEndpoint2mtemp = sampleUserServiceImplProxyid.getEndpoint();
				if (getEndpoint2mtemp == null) {
	%>
	<%=getEndpoint2mtemp%>
	<%
		} else {
					String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils
							.markup(String.valueOf(getEndpoint2mtemp));
	%>
	<%=tempResultreturnp3%>
	<%
		}
				break;
			case 5:
				gotMethod = true;
				String endpoint_0id = request.getParameter("endpoint8");
				java.lang.String endpoint_0idTemp = null;
				if (!endpoint_0id.equals("")) {
					endpoint_0idTemp = endpoint_0id;
				}
				sampleUserServiceImplProxyid.setEndpoint(endpoint_0idTemp);
				break;
			case 10:
				gotMethod = true;
				com.market.service.UserServiceImpl getUserServiceImpl10mtemp = sampleUserServiceImplProxyid
						.getUserServiceImpl();
				if (getUserServiceImpl10mtemp == null) {
	%>
	<%=getUserServiceImpl10mtemp%>
	<%
		} else {
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
				String id_1id = request.getParameter("id26");
				int id_1idTemp = Integer.parseInt(id_1id);
				com.market.model.User getUser15mtemp = sampleUserServiceImplProxyid.getUser(id_1idTemp);
				if (getUser15mtemp == null) {
	%>
	<%=getUser15mtemp%>
	<%
		} else {
	%>
	<TABLE>
		<TR>
			<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
		<TR>
			<TD WIDTH="5%"></TD>
			<TD COLSPAN="2" ALIGN="LEFT">position:</TD>
			<TD>
				<%
					if (getUser15mtemp != null) {
									java.lang.String typeposition18 = getUser15mtemp.getPosition();
									String tempResultposition18 = org.eclipse.jst.ws.util.JspUtils
											.markup(String.valueOf(typeposition18));
				%> <%=tempResultposition18%> <%
 	}
 %>
			</TD>
		<TR>
			<TD WIDTH="5%"></TD>
			<TD COLSPAN="2" ALIGN="LEFT">age:</TD>
			<TD>
				<%
					if (getUser15mtemp != null) {
				%> <%=getUser15mtemp.getAge()%>
				<%
					}
				%>
			</TD>
		<TR>
			<TD WIDTH="5%"></TD>
			<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
			<TD>
				<%
					if (getUser15mtemp != null) {
									java.lang.String typename22 = getUser15mtemp.getName();
									String tempResultname22 = org.eclipse.jst.ws.util.JspUtils
											.markup(String.valueOf(typename22));
				%> <%=tempResultname22%> <%
 	}
 %>
			</TD>
		<TR>
			<TD WIDTH="5%"></TD>
			<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
			<TD>
				<%
					if (getUser15mtemp != null) {
				%> <%=getUser15mtemp.getId()%>
				<%
					}
				%>
			</TD>
	</TABLE>
	<%
		}
				break;
			case 28:
				gotMethod = true;
				com.market.model.User[] getAllUsers28mtemp = sampleUserServiceImplProxyid.getAllUsers();
				if (getAllUsers28mtemp == null) {
	%>
	<%=getAllUsers28mtemp%>
	<%
		} else {
					String tempreturnp29 = null;
					if (getAllUsers28mtemp != null) {
						java.util.List<User> listreturnp29 = java.util.Arrays.asList(getAllUsers28mtemp);
						for (User u : listreturnp29) {
							int id = u.getId();
							int age = u.getAge();
							String name = u.getName();
							String position = u.getPosition();
	%>
	Id :
	<%=id%>:: Name :
	<%=name%>:: Age :
	<%=age%>:: Position :
	<%=position%>
	<%
		}
					}
	%>
	<%=tempreturnp29%>
	<%
		}
				break;
			case 31:
				gotMethod = true;
				String position_3id = request.getParameter("position36");
				java.lang.String position_3idTemp = null;
				if (!position_3id.equals("")) {
					position_3idTemp = position_3id;
				}
				String age_4id = request.getParameter("age38");
				int age_4idTemp = Integer.parseInt(age_4id);
				String name_5id = request.getParameter("name40");
				java.lang.String name_5idTemp = null;
				if (!name_5id.equals("")) {
					name_5idTemp = name_5id;
				}
				String id_6id = request.getParameter("id42");
				int id_6idTemp = Integer.parseInt(id_6id);
	%>
	<jsp:useBean id="com1market1model1User_2id" scope="session"
		class="com.market.model.User" />
	<%
		com1market1model1User_2id.setPosition(position_3idTemp);
				com1market1model1User_2id.setAge(age_4idTemp);
				com1market1model1User_2id.setName(name_5idTemp);
				com1market1model1User_2id.setId(id_6idTemp);
				boolean addUser31mtemp = sampleUserServiceImplProxyid.addUser(com1market1model1User_2id);
				String tempResultreturnp32 = org.eclipse.jst.ws.util.JspUtils
						.markup(String.valueOf(addUser31mtemp));
	%>
	<%=tempResultreturnp32%>
	<%
		break;
			case 44:
				gotMethod = true;
				String id_7id = request.getParameter("id47");
				int id_7idTemp = Integer.parseInt(id_7id);
				boolean deleteUser44mtemp = sampleUserServiceImplProxyid.deleteUser(id_7idTemp);
				String tempResultreturnp45 = org.eclipse.jst.ws.util.JspUtils
						.markup(String.valueOf(deleteUser44mtemp));
	%>
	<%=tempResultreturnp45%>
	<%
		break;
			}
		} catch (Exception e) {
	%>
	Exception:
	<%=org.eclipse.jst.ws.util.JspUtils.markup(e.toString())%>
	Message:
	<%=org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage())%>
	<%
		return;
		}
		if (!gotMethod) {
	%>
	result: N/A
	<%
		}
	%>
</BODY>
</HTML>