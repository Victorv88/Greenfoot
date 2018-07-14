<?php
	$con=mysqli_connect("localhost", "id6481225_friends_database", "Nuegrabaman8","id6481225_friends_database");
	$username=$_POST["username"];
	$password=$_POST["password"];
	$mail=$_POST["mail"];
	$question1=$_POST["question1"];
	$ans11=$_POST["ans11"];
	$ans12=$_POST["ans12"];
	$ans13=$_POST["ans13"];
	$ans14=$_POST["ans14"];
	
	$statement=mysqli_prepare($con,"INSERT INTO user(username,mail,password,question1
	,ans11,ans12,ans13,ans14) VALUES (?,?,?,?,?,?,?,?)");
	
	mysqli_stmt_bind_param($statement,"siss", $username, $mail, $password, $question1,
	$ans11, $ans12, $ans13, $ans14);
	mysqli_stmt_execute($statement);
	$response=array();
	$response["success"]=true;
	echo json_encode($response);
?>
