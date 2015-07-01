<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="name" value="${sessionScope.guest}" />
<html>
    <head>
        <title>${name}&apos;s Personalized Calculator</title>
        <link rel="stylesheet" type="text/css" href="calculator.css">
        <script>
            function validateOperands(operands) {
                var matches = operands.value.match(/^([0-9]+( )?)+$/g);

                if(matches) {
                    document.getElementsByClassName("error-message")[0].style.display = 'none';
                    document.forms[0].calculate.style.display = 'block';
                } else {
                    document.getElementsByClassName("error-message")[0].style.display = 'block';
                    document.forms[0].calculate.style.display = 'none';
                }
            }
        </script>
    </head>

    <body>
        <h1>Hi, ${name}</h1>

        <form method="get" action="calculator">
            <div>
                <label for="operation">What would you like to do?</label>
                <select name="operation">
                    <option value="1">Add</option>
                    <option value="2">Subtract</option>
                    <option value="3">Multiply</option>
                    <option value="4">Divide</option>
                    <option value="5">Factorial</option>
                </select>
            </div>
            <div>
                <label for="operands">Please enter some numbers separated by spaces</label>
                <input name="operands" type="text" onkeypress="validateOperands(this)"></input>
            </div>

            <div class="error-message">
                Please enter valid numbers
            </div>

            <div>
                <input name="calculate" type="submit" value="Calculate"></input>
            </div>
        </form>
        <div>${requestScope.resultText}</div>
        <a href="logout">Logout</a>
    </body>
</html>