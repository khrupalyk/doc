<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 26.09.15
  Time: 20:35
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


    <%--<title>jQuery UI Datepicker - Default functionality</title>--%>
    <%--<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">--%>
    <%--<script src="//code.jquery.com/jquery-1.10.2.js"></script>--%>
    <%--<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>--%>
    <%--<link rel="stylesheet" href="/resources/demos/style.css">--%>
    <%--<script>--%>
    <%--$(function() {--%>
    <%--$( "#datepicker" ).datepicker();--%>
    <%--});--%>
    <%--</script>--%>
</head>
<body>


<div id="container" style="margin: 0 auto;"></div>
<script type="text/jsx">

    React.render(<Doctors/>, document.getElementById("container"));

</script>


<%--<div id="datepicker"></div>--%>
<%--<script>--%>
<%--$("#datepicker").datepicker({--%>
<%--onSelect: function(dateText) {--%>
<%--console.log("Selected date: " + dateText + "; input's current value: " + this.value);--%>
<%--}--%>
<%--});--%>
<%--</script>--%>
</body>
</html>
