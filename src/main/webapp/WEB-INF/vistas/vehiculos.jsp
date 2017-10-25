<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vehiculos</title>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet" >
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
  <h2>Vehiculos con >= cantidad</h2>            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Patente</th>
        <th>cantidad equipaje</th>
        <th>Cantidad personas</th>
        <th>Selecionar</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${vehiculos}" var="vehiculo">
      <tr>
        <td><c:out value="${vehiculo.patente}"/></td>
        <td><c:out value="${vehiculo.cantidadEquipaje}"/></td>
        <td><c:out value="${vehiculo.cantidadDePersonas}"/></td>
        <td><a href="" class="btn btn-success">Selecionar</a><td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  <div>
  	<a href="pasajeros" class="btn btn-danger">Volver</a>
  </div>
</div>

</body>
</html>