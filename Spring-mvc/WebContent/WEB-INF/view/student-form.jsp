<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
	<form:form action="processAnotherFormOne" modelAttribute="student">
		<!-- modelAttribute should match the model attribute provided in controller-->
		<!-- path should be same as property of class student -->
		
		<!-- Text Field -->
		FistName : <form:input path="firstName"/> <br><br>
		LastName : <form:input path="lastName"/>  <br><br>
	
		<!-- Drop Down List -->
			<!-- onSubmit it will call student.setCountry -->
		Country :
		<form:select path="country">
			<form:option value="India" label="India"></form:option >
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="USA" label="USA"></form:option>
		</form:select>
		
		
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>