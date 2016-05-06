 selectMysql.jsp
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <title>The Presidential Enquirer</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
        <meta name="description" content="The Presidential Enquirer" />
        <link rel="shortcut icon" href="../favicon.ico"/> 
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link href="main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <header>
               <img src="http://i1224.photobucket.com/albums/ee374/staples_josh/Presidential%20Inquirer_zpsr68cy6cq.png" border="0" alt=" photo Presidential Inquirer_zpsr68cy6cq.png"/>
			</header>
        			
			<div id="tabs" >
				<ul class="nav nav-pills nav-justified">
					<li class="active"><a href="index.xhtml">Candidates</a></li>
					<li><a href="issues.xhtml">Issues</a></li>
				</ul>
			</div>
			<br>
			<div class="demParty">
				<header>
					<h1>Democratic Party</h1>
				</header>				
			</div>
			<div class="demCandidates">
                         Connection con;
                         Class.forName("com.mysql.jdbc.Driver");
                         con=(Connection)DriverManager.getConnection("jdbc:mysql://pinq.cdmazu6ezgrk.us-west-2.rds.amazonaws.com:3306", "JStaples", "whatever");
                         PreparedStatement ps=(PreparedStatement)con.prepareStatement("SELECT * from Candidates");
                         ResultSet rs=ps.executeQuery();
                         while(rs.next()){
                         String CName=rs.getString("Candidate");
                         String Bio=rs.getString("bio");
                         String Pic=rs.getString("pic");
                         out.println("CName "+Bio+" Pic "+"<hr>");
                           } 

			</div>
			<br>
			<div class="repParty">
				<header>
					<h1>Republican Party</h1>
				</header>
			</div>
			<div class="repCandidates">
				<br>
				<div id="repList">
					<!-- database calls being commented out here *different design having trouble having a row of 3
					<table>
						<?php foreach ($repCandidate as $repCandidate) : ?>
						<tr>
							<td><?php echo $repCandidateImg['repCandidateImg']; ?></td>
							<td><?php echo $repCandidate['repCandidate']; ?></td>
						<tr>
						<?php endforeach; ?> commenting DB data
					</table>	-->
					<!--- The following is for testing purposes only -->
					<table>
						<tr>
							<th><img src="images/tedcruz.jpg"  alt="Cruz"></th>
							<th><img src="images/Kasich16.jpg" alt="Kasich"></th>
							<th><img src="images/trump.jpg" alt="Trump"></th>
						</tr>
						<tr>
							<td>Ted Cruz</td>
							<td>John Kasich</td>
							<td>Donald Trump</td>
						</tr>
					</table>
				</div>
			</div>
			<br>
			<div class="otherParty">
				<header>
					<h1>Other Party</h1>
				</header>
			</div>
			<div class="otherCandidates">
				<br>
				<div id="otherList">
					<!-- database calls being commented out here *different design having trouble having a row of 3
					<table>
						<?php foreach ($otherCandidate as $otherCandidate) : ?>
						<tr>
							<td><?php echo $otherCandidateImg['otherCandidateImg']; ?></td>
						</tr>
						<tr>
							<td><?php echo $otherCandidate['otherCandidate']; ?></td>
						<tr>
						<?php endforeach; ?> commenting DB data
					</table>	-->
					<!--- The following is for testing purposes only -->
					<table>
						<tr>
							<th><img src="images/JohnMcAfee.jpg"  alt="McAfee" style="width:85px;height:125px;"></th>
							<th><img src="images/garyjohnson.jpg" alt="Johnson" style="width:85px;height:125px;"></th>
						</tr>
						<tr>
							<td>John McAfee</td>
							<td>Gary Johnson</td>
						</tr>
					</table>
				</div>
			</div>
			<br>			
		</div>
    </body>
</html>