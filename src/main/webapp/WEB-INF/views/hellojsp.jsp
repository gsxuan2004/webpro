<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>spring boot vue's test!</title>
<script src="./js/vue.js"></script>

</head>
<body>
hi JSP. it's time ${now}
<div id="app">

<span v-bind:title="message">
click left key,show message!
</span>


</div>

<script src="./js/webpro/testvue.js"></script>
</body>


</html>
