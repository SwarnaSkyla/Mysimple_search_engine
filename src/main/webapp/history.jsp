<%@page import="java.util.ArrayList"%>
<%@page import ="com.Project.Historyresult"%>

<html>
<body>
<head>
  <link rel="stylesheet" type="text/css" href="style.css">
  <title>History</title>
</head>
<body>

   <div class="resultTable">

   <table border =2>
      <tr>
         <td>Name</td>
         <td>Link</td>
      </tr>
      <%
         ArrayList<Historyresult> results=(ArrayList<Historyresult>)request.getAttribute("results");
         for(Historyresult result:results){
      %>
      <tr>
         <td><%out.println(result.getName());%></td>
         <td><a href="<%out.println(result.getLink());%>"><%out.println(result.getLink());%></a></td>
      </tr>
      <%
          }
      %>
      </table>
      </div>

</body>
</html>