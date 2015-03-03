<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<%
  
  String id=request.getParameter("id");
  String nom=request.getParameter("nom");
  String prenom=request.getParameter("prenom");
  String pays=request.getParameter("pays");
  String rue=request.getParameter("rue");
  String ville=request.getParameter("ville");
  String zip=request.getParameter("zip");

  	  if(nom==null) nom="";
  	if  (prenom==null) {prenom="";}
  	if(pays==null) pays="";
  	if(rue==null) rue="";
  	if(ville==null) ville="";
  	if(zip==null) zip="";
  
 
  %>
  


<form class="form-horizontal" action="/EditEntree?id=<%=id %>" method="POST">
<fieldset>

<!-- Form Name -->
<legend>Formulaire d'Edition </legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nom">Nom</label>  
  <div class="col-md-4">
  <input id="nom" name="nom" value="<%=nom%>" type="text" placeholder="" class="form-control input-md" required="">
  <input id="id" name="id" value="<%=id%>" type="hidden" placeholder="" class="form-control input-md" required="">  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="prenom">Prenom</label>  
  <div class="col-md-4">
  <input id="prenom" name="prenom" value="<%=prenom %>" type="text" placeholder="" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="pays">Pays</label>  
  <div class="col-md-4">
  <input id="pays" name="pays" value="<%=pays %>" type="text" placeholder="" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group"  >
  <label class="col-md-4 control-label" for="rue">Rue</label>  
  <div class="col-md-4">
  <input id="rue" name="rue" value="<%=rue %>" type="text" placeholder="" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="ville">Code Postal</label>  
  <div class="col-md-4">
  
  <input id="ville" name="ville" value=" <%=ville %>" type="text" placeholder="" class="form-control input-md">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="zip">Code Postal</label>  
  <div class="col-md-4">
  <input id="zip" name="zip" value="<%=zip %>" type="text" placeholder="" class="form-control input-md">
    
  </div>
</div>


<div class="form-group">
  <label class="col-md-4 control-label" for="modif"></label>
  <div class="col-md-8">
    <button id="modif" name="modif" class="btn btn-success">Modifier</button>
    
  </div>
</div>

</fieldset>
</form>








</body>
</html>