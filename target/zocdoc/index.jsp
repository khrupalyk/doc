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

    <script src="<c:url value="/resources/js/react/react.js" />"></script>
    <script src="<c:url value="/resources/js/react/JSXTransformer.js" />"></script>
    <script src="<c:url value="/resources/js/react/react-with-addons.min.js" />"></script>
    <script src="<c:url value="/resources/js/jquery/jquery-1.11.3.min.js" />"></script>



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
<c:url value="/rest/doctor" />

<div id="container"></div>
<script type="text/jsx">

    var HelloMessage = React.createClass({
        getInitialState: function() {
            return {
                doctors: []
            };
        },

        componentDidMount: function() {
            console.log("Load data start!");
            $.get( "<c:url value="/rest/doctor" />", function(result) {
                console.log("Load data!  " + result);
                this.state.doctors = JSON.parse(result);
            }.bind(this));
        },

        render: function () {
            var data = this.state.doctors;

            var messages = data.map(function(d){
                return <div>{d.firstName}</div>;
            });

            return ( <div className="commentList">
                {messages}
            </div>);
        }
    });



        React.render(<HelloMessage/>, document.getElementById("container"));

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
