<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Marks</title>
</head>
<body>
<a href="profile">Profile</a><br>
<a href="notices">Notices</a><br>
<a href="schedules">Schedules</a><br>
<a href="marks">Marks</a><br>
<a href="attendance">Attendance</a><br>
<a href="logout">Logout</a><br>
<c:forEach var="u" items="${requestScope.marks}">
StudentID=${u.studentID.id} Practical=${u.practicalMarks} Internal=${u.internalMarks} CCEE=${u.cceeMarks} ModuleID=${u.moduleID.moduleID}<br>
	</c:forEach>
</body>
</html>