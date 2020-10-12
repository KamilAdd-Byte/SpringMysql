<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="post" modelAttribute="person">
    <form:input path="name" type="text" /><br/>
    <form:input path="lastname" type="text" /><br/>
    <form:input path="email" type="text" /><br/>
    <form:button type="submit">add</




</form:form>