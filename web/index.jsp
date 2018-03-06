<%-- 
    Document   : index
    Created on : 06-mar-2018, 14:09:02
    Author     : sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
            <%-- start web service invocation --%><hr/>
    <%
    try {
	services.FactorialWebService_Service service = new services.FactorialWebService_Service();
	services.FactorialWebService port = service.getFactorialWebServicePort();
	 // TODO initialize WS operation arguments here
	int factorial = 0;
	// TODO process result here
	int result = port.factorial(factorial);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
