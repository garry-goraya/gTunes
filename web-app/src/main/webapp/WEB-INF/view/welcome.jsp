<!DOCTYPE html> 

<html lang="en">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<body>
<div class="container">
    <h2>Hello buddy!</h2>
    <form:form action="/dashboard/show" method="get">
        <h4>Cick here to greet</h4>
        <input type="submit" value="Cick"/>
    </form:form>

</div>
</body>

</html>
