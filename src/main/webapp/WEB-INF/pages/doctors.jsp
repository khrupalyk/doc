<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 03.10.15
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="<c:url value="/static/js/react/react.js" />"></script>
    <script src="<c:url value="/static/js/react/JSXTransformer.js" />"></script>
    <script src="<c:url value="/static/js/react/react-with-addons.min.js" />"></script>
    <script src="<c:url value="/static/js/jquery/jquery-1.11.3.min.js" />"></script>
    <script src="<c:url value="/static/js/components/DoctorTemplate.jsx" />" type="text/jsx"></script>
    <script src="<c:url value="/static/js/components/DoctorsTemplate.jsx" />" type="text/jsx"></script>
    <link href="<c:url value="/static/css/short_doctor_info.css" />" rel="stylesheet"/>
</head>
<body>

<div id="container" style="margin: 0 auto;"></div>
<script type="text/jsx">

    React.render(<Doctors/>, document.getElementById("container"));

</script>

</body>
</html>
