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

    <link href="<c:url value="/static/css/search_doctor_form.css" />" rel="stylesheet"/>


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


<div class="blue-box">
    <div class='pad'>
        <div class='find-doctor-intro'>
            Find a doctor you love. <br/>
            Get the care you need.
        </div>
        <div>
            <div class='find-doctor-intro'>
                Get started
            </div>
            <select>
                <option disabled selected>Choose a Specialty</option>
                <option value="Чебурашка">Чебурашка</option>
                <option value="Крокодил Гена">Крокодил Гена</option>
                <option value="Шапокляк">Шапокляк</option>
                <option value="Лариса">Лариса</option>
            </select>
        </div>
        <div class='find-doctor-intro'>
            In
        </div>
        <div>
            <select>
                <option disabled selected>Region</option>
                <option value="Чебурашка">Ukrainin</option>
                <option value="Крокодил Гена">Some</option>
                <option value="Шапокляк">Some2</option>
                <option value="Лариса">Some4</option>
            </select>
        </div>
    </div>

</div>
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
