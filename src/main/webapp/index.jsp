<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/index.css" />

<meta charset="ISO-8859-1">
<title>Travi:D</title>
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<img src="https://www.pharmaceutical-technology.com/wp-content/uploads/sites/10/2020/10/Macroeconomic-Influencers_15-October.jpg" class="img-thumbnail banner" style="height: '50px';" />
			<div class="row">
				<div class="col-md-12">
					<div class="page-header">
						<h1>
							Travi:D! <br/>
							<small> Seu ajudante do durante e pós pandemia para viagens.</small>
						</h1>
						<table class="table table-bordered">
						<thead>
							<tr>
								<th>
									#
								</th>
								<th>
									Product
								</th>
								<th>
									Payment Taken
								</th>
								<th>
									Status
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									1
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									Default
								</td>
							</tr>
							<tr class="table-active">
								<td>
									1
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									Approved
								</td>
							</tr>
							<tr class="table-success">
								<td>
									2
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									02/04/2012
								</td>
								<td>
									Declined
								</td>
							</tr>
							<tr class="table-warning">
								<td>
									3
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									03/04/2012
								</td>
								<td>
									Pending
								</td>
							</tr>
							<tr class="table-danger">
								<td>
									4
								</td>
								<td>
									TB - Monthly
								</td>
								<td>
									04/04/2012
								</td>
								<td>
									Call in to confirm
								</td>
							</tr>
						</tbody>
					</table>
					</div>

				</div>
				<div class="col-md-6">
					<div class="page-header">
						<h1>
							Faça um relatório para ajudar na próxima parada! <small>Travi:D</small>
						</h1>
					</div> 
					<button type="button" class="btn active btn-primary">
						Quero monitorar agora ;)
					</button>
				</div>
			</div>
		</div>
	</div>
	
	<form action="PersonService" method="get">
		<button type="submit">
		clicka porra bora de HTTP</button>
	</form>
	
	
	<form action="ReportController" method="post">
		<input type="text"
			   id="name" 
			   name="name"
			   class="form-control"
			   style="width: 50%"
			   placeholder="Digite o nome do relatório" />
		<input type="text"
			   id="description" 
			   name="description"
			   class="form-control"
			   style="width: 50%"
			   placeholder="Digite a descrição do relatório" />
		<button type="submit">
		clicka porra bora de BASE</button>
	</form>
	
	<form action="ReportController" method="get">
		<button type="submit">
		clicka porra bora de HTTP</button>
	</form>
	
</div>
</body>
</html>