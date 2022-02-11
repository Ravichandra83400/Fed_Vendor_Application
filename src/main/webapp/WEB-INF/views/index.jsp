<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
<title>Welcome</title>
</head>
<body>



	<div class="card-header bg-info text-center text-white">
			<h3>Vendor Registration Form</h3>
		</div>
		<div>
 	<div class="col-5">

		<br>
		<a href="/register" class="btn btn-success ">Register Vendor <i
							class="fa fa-plus-square" aria-hidden="true"></i></a>
		</div>
							<br>

		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Company Name</th>
					<th>Legal Status</th>
					<th>Year Of Corporation</th>
					<th>Nature of business</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="vendordata" items="${vendorList}">
					<tr>
						<th scope="row"><a href="/register"> ${vendordata.vendorID}</a></th>
						<td>${vendordata.companyName}</td>
						<td>${vendordata.legalStatus}</td>
						<td>${vendordata.yearOfCorporation}</td>
						<td>${vendordata.nature}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>