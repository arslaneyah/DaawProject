<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
h1 { color: black ;
 font-family: 'Raleway',sans-serif;
  font-size: 62px;
   font-weight: 800;
    line-height: 72px; 
    margin: 0 0 24px;
     text-align: center;
      text-transform: uppercase; 
      margin-top:200px ;}
      body{
      background-color:beige ;
      
      }


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Au Revoir</title>
</head>
<body>
	<h1>Au revoir <% out.print(request.getSession().getAttribute("user")) ;%></h1>
</body>
</html>