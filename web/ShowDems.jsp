<!adapted from http://www.codejava.net/java-ee/jsp/how-to-list-records-in-a-database-table-using-jsp-and-jstl>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Candidate Records</title>
</head>
<body>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://pinq.cdmazu6ezgrk.us-west-2.rds.amazonaws.com:3306/PresidentialInquirer"
        user="JStaples" password="whatever"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM Candidates;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Candidates</h2></caption>
            <tr>
                <th>Name</th>
                <th>Bio</th>
                <th>Pic</th>
            </tr>
            <c:forEach var="Candidates" items="${listCandidates.rows}">
                <tr>
                    <td><c:out value="${Candidates.Candidate}" /></td>
                    <td><c:out value="${Candidates.Bio}" /></td>
                    <td><c:out value="${Candidates.Pic}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>