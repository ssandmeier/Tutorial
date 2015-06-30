<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="name" value="${sessionScope.guest}" />
<html>
    <head>
        <title>${name}&apos;s Personalized Calculator</title>
    </head>

    <body>
        <h1>Hi, ${name}</h1>

        <form method="get" action="calculator">
            <div>
                <label for="operands">Please enter some numbers separated by spaces</label>
                <input name="operands" type="text"></input>
            </div>
            <div>
                <input name="calculate" type="submit" value="Calculate"></input>
            </div>
        </form>
        <div>${requestScope.resultText}</div>
        <a href="logout">Logout</a>
    </body>
</html>