<%@page import="java.util.ArrayList"%>
<%@page import ="com.Project.Searchresult"%>

<html>
<head>

  <link rel="stylesheet" type="text/css" href="style.css">
  <title>Search</title>
 </head>
<body>
   <form action="Search">
      <input type="text" name="keyword"></input>
      <button type="submit">Search</button>
   </form>
   <form action ="History">

        <button type="submit">History</button>
   </form>
   <div class="resultTable">

   <table border =2>
      <tr>
         <td>Name</td>
         <td>Link</td>
      </tr>
      <%
         ArrayList<Searchresult> results=(ArrayList<Searchresult>) request.getAttribute("results");
         for(Searchresult result:results){
      %>
      <tr>
         <td><%out.println(result.getTitle());%></td>
         <td><a href="<%out.println(result.getLink());%>"><%out.println(result.getLink());%></a></td>
      </tr>
      <%
          }
      %>
      </table>
      </div>

</body>
</html>