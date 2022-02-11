<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
<title>Bank Details</title>
<!-- <script type = "text/javascript" >  
    function preventBack() { window.history.forward(); }  
    setTimeout("preventBack()", 0);  
    window.onunload = function () { null };  
</script>  -->
</head>
<body>

	<div class="card-header bg-info text-center text-white">
		<h3>Vendor Registration Form</h3>
	</div>

	<br>
	<br>

	<div class="container">

		<form method="post" enctype="multipart/form-data"
			action="/savebankdetails">
			
			<div class="container">
				<div class="row">
				<div class="col">
			<label>Bank Name</label> 
			<input type="text"	class="form-control mb-2 mr-sm-2 mb-sm-0" id="bankname"
				name="bank_name" placeholder="Bank name" maxlength="100" required="required" />
				
				</div>
				<div class="col"> 
				<label>Bank Address</label> 
			 <input	type="text" class="form-control mb-2 mr-sm-2 mb-sm-0"
				id="bankbranchaddress" name="bank_branch_address" placeholder="Bank Address" maxlength="100" /></div>
				
				
				<div class="container">
				<div class="row">
				<div class="col">
				 <label>Account
				Hoder Name</label> 
				<input type="text" class="form-control mb-2 mr-sm-2 mb-sm-0" id="accountholdername" name="account_holder_name" 
				placeholder="Account Holder Name"  maxlength="300" required="required" /></div>
				
				<div class="col">
				 <label>Account Type</label>
				 <select class="form-control mb-2 mr-sm-2 mb-sm-0"
				id="accounttype" name="account_type" required="required">
				<option value="">Select</option>
				<option value="Savings">Savings</option>
				<option value="Current">Current</option>
				<option value="NRI Account">NRI</option>
			</select> 
			</div>
			<div class="container">
				<div class="row">
				<div class="col">
			 <label>IFSC Code</label> 
			<input type="text"	class="form-control mb-2 mr-sm-2 mb-sm-0"
				pattern="^[A-Za-z]{4}[a-zA-Z0-9]{7}$" id="bankname" name="ifsc_code"
				placeholder="IFSC Code" maxlength="20" required="required" /></div>
				
				<div class="col">
			<label>Bank Account Document</label> <input type="file"
				class="form-control mb-2 mr-sm-2 mb-sm-0" id="accountdocument"
				name="bankdocfile" placeholder="Bank Account Document"
				required="required" /></div>
				
				
				<div class="container">
				<div class="row">
				<div class="col">
				 <label>Agreement Copy</label> <select
				class="form-control mb-2 mr-sm-2 mb-sm-0" id="aggrementCopy"
				name="agreement_copy" placeholder="Agreement Copy">
				<option value="">Select</option>
				<option value="Yes">Yes</option>
				<option value="No">No</option>
			</select> 
			</div>
			
			<div class="col">
             <label>Agreement Document</label> <input type="file"
				class="form-control mb-2 mr-sm-2 mb-sm-0" id="aggrementdocument"
				name="agrementfile" placeholder="Agreement Document" />
				</div>

       <div class="container">
				<div class="row">
				<div class="col">
      <label>Agreement Start Date</label>
				 
			<input type="date"	class="form-control mb-2 mr-sm-2 mb-sm-0" id="aggStartDate"
				placeholder="Aggrement Start Date" name="agreement_start_date"  required="required"/> </div>
				<div class="col">
				<label>Agreement End Date</label>
				 <input type="date"
				class="form-control mb-2 mr-sm-2 mb-sm-0" id="aggEndDate"
				placeholder="Aggrement End Date" name="agreement_end_date" required="required" /></div>
				</div>

            <div class="col-6">
			<label>Status</label> <select
				class="form-control mb-2 mr-sm-2 mb-sm-0" id="status"
				name="status">
				<option value="active">Active</option>
				<option value="inactive">InActive</option>
				</select> 
				</div>
				</div>
				</div>
				
				
			<br>
			<br>	
				
			<button type="submit" class="btn btn-primary">Add</button> </div></div>
			
             
			<div class="d-grid gap-2 d-md-flex justify-content-md-end">
				<a href="/getTaxdetails" class="btn btn-primary" id="next"
					type="submit">Next </a>

			</div>
		</form>
		<br />
		<table id="bankdetails" class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>Bank Name</th>
					<th>Account Holder Name</th>
					<th>Account Type</th>
					<th>IFSC Code</th>
					<th>Status</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="bankdata" items="${bankdetails}">
					<tr>
						<th scope="row">${bankdata.vendor_id}</th>
						<td>${bankdata.bank_name}</td>
						<td>${bankdata.accont_holder_name}</td>
						<td>${bankdata.account_type}</td>
						<td>${bankdata.ifsc_code}</td>
						<td>${bankdata.status}</td>
						<%-- <td><a class="btn btn-sm btn-warning" role="button"
							href="/delete/${bankdata.customerId}">Delete</a></td> --%>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
		<script>
			$(document).ready(function() {
				$("#next").click(function() {

					// Select all the rows in the table
					// and get the count of the selected elements
					var rowCount = $("#bankdetails tr").length;
					if (rowCount == 1) {
						alert("At least one bank entry is required");
						return false;
					}
				});

				$("#aggrementCopy").change(function() {
					var aggrementCopy = $(this).find(":selected").val();
					console.log(' aggrementCopy ', aggrementCopy);
					if (aggrementCopy == 'Yes') {
						$("#aggrementdocument").prop('required', true);
						$("#aggStartDate").prop('required', true);
						$("#aggEndDate").prop('required', true);

					} else if (aggrementCopy == 'No') {
						$("#aggrementdocument").prop('required', false);
						$("#aggStartDate").prop('required', false);
						$("#aggEndDate").prop('required', false);
					}

				});
			});
		</script>
	</div>
</body>
</html>