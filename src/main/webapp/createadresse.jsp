<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Test Talentroc</title>
 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>

<form class="form-horizontal"  action="/InserCarnet" method="POST">
<fieldset>

<!-- Form Name -->
<legend>Formulaire de Création d'un Carnet</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nom">Nom</label>  
  <div class="col-md-4">
  <input id="nom" name="nom" type="text" value="" placeholder="" class="form-control input-md" required="" title="Vous devez specifier votre nom">

  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="Prenom">Prénom</label>  
  <div class="col-md-4">
  <input id="prenom" name="prenom" type="text" value="" class="form-control input-md" required="" title="Vous devez specifier votre prenom">
 
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="pays">Pays</label>  
  <div class="col-md-4">
  <input id="pays" name="pays" type="text" value="" class="form-control input-md" >
 
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="rue">Rue</label>  
  <div class="col-md-4">
  <input id="rue" name="rue" type="text" value="" placeholder="" class="form-control input-md">
  
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="ville">Ville</label>  
  <div class="col-md-4">
  <input id="ville" name="ville" type="text" value="" placeholder="" class="form-control input-md">
 
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="zip">Code Postal</label>  
  <div class="col-md-4">
  <input id="zip" name="zip" type="text" value="" placeholder="" class="form-control input-md" required="">
 
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="creer"></label>
  <div class="col-md-4">
    <button id="creer" name="creer" value="" class="btn btn-primary">Ajouter</button>
  </div>
</div>

</fieldset>
</form>

       


</body>
</html>