<%@ page import="ru.kfu.itis.Game" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: mg
  Date: 12.02.15
  Time: 0:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Игра</title>
    <link rel="stylesheet" href="Style.css">
</head>
<body>
    <form action="/Game" method="get">
        <input type="submit" value="Переиграть">
    </form>
    <%Game game = (Game)request.getAttribute("game");%>
    <%ArrayList<ArrayList<String>> result = game.getResult();%>
    <table>
        <%for(int i = 0; i < result.size(); i++){%>
        <tr>
           <%for(int j = 0; j < result.get(i).size(); j++){%>
                <td><%=result.get(i).get(j)%></td>
            <%}%>
        </tr>
        <%}%>
        <tr>
            <td colspan = "<%=result.get(0).size() - 3%>">Победитель:</td>
            <td colspan = "3" style="text-align: right;"><%=game.getWinner()%></td>
        </tr>
    </table>

</body>
</html>
