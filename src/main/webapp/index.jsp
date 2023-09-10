<%--
  Created by IntelliJ IDEA.
  User: HaNdSyA
  Date: 09-Sep-23
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
 import="java.lang.* " %>
<html>
  <head>
    <title>JobHackerTASK1</title>
  </head>
  <body>
  <table border="2">

    <tr>
      <td>0</td>
      <td>1</td>
    </tr>
    <%  long res=1;
      for (int i=1;i<=10;i++,res=1) {
      for (int j=i;j>=1;j--) {
        res*=j;
      }
    %>

    <tr>
      <td><%= i %></td>
      <td><%= res %></td>
    </tr>

<% } %>

  </table>
  </body>
</html>
