<%@page import="com.data.jersey.EntreeService"%>
<%@page import="com.data.entity.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
  <title>Test Talentroc</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
</head>
<body>
<h1>Mon Carnet d'Adresse</h1>
</body>
<%

EntreeService service=new EntreeService();
List<Carnet>carnets=service.getAllCarnets();


%>
<a href="createadresse.jsp"> Ajouter une adresse</a><br>
<div class="container">
<table class="table table-hover">
<thead>
<tr>
<th>Id</th>
<th>Nom</th>
<th>Pays</th>
<th>Prenom</th>
<th>Rue</th>
<th>Ville</th>
<th>ZIP</th>
</tr>
</thead>
<% for (Carnet c :carnets ){%>

<tr>
<td><%= c.getId() %></td>
<td><%= c.getNom() %></td>
<td><%= c.getPays() %></td>
<td><%= c.getPrenom() %></td>
<td><%= c.getRue() %></td>
<td><%= c.getVille() %></td>
<td><%= c.getZip()%></td>
<td><a href="edit.jsp?id=<%=c.getId()%>&nom=<%=c.getNom()%>&prenom=<%=c.getPrenom() %>&pays=<%=c.getPays() %>
&rue=<%=c.getRue() %>&ville=<%= c.getVille() %>&zip=<%=c.getZip() %>" > 

<img src="img/pencil_32.png"/></a> </td>
<td><a href="DeleteEntree?id=<%=c.getId()%>"  onclick="if (!confirm('Etes-vous sur de vouloir supprimer cet utilisateur?'))return false;" ><img src="img/supp.png"/></a> </td>

<%} %>
</tr>
</table>
</div>
</html>