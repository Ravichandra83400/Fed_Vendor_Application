<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
<link rel="stylesheet" type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">


<title>Tax Deduction Details</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">
	function gstVerify(widget) {

		console.log("Enter Into gstVerify", this, " widget ",widget);
		var inputvalues = $('#'+widget.id).val();
		console.log(" inputvalues  ", inputvalues)
		var gstinformat = new RegExp(
				'^[0-9]{2}[A-Z]{5}[0-9]{4}[A-Z]1}[1-9A-Z]{1}Z[0-9A-Z]{1}$');
		if (gstinformat.test(inputvalues)) {
			return true;
			alert();
		} else {
			alert('Please Enter Valid GSTIN Number');
			return false;
			}

	}
</script>







<!-- <script type="text/javascript">
function readURL() {
	alert("sffad");
	var input="";
	if (input.files && input.files[0]) {
		var reader = new FileReader();

		reader.onload = function(e) {
			$('<iframe />', {
				name : 'frame1',
				id : 'frame1',
				src : e.target.result
			}).show();
			console.log($("#frame1"));
			var win = window.open("", "window", "width=200,height=100");
			;
			win.document
					.write('<iframe width="560" height="315" src='+e.target.result+' frameborder="0" allowfullscreen></iframe>')

		}

		reader.readAsDataURL(input.files[0]);
	}
}

</script>
                    
 -->







</head>

<body>

	<div class="card-header bg-info text-center text-white">
		<h3>Vendor Registration Form</h3>
	</div>
	<br>
	<br>
	<br>
	<div class="container">
		<form:form method="POST" action="/submit"
			enctype="multipart/form-data" modelAttribute="taxdeduction">



			<div class="container">
				<div class="row">
					<label for="panNumber" class="col-sm-2 col-form-label">PAN
						Number</label>

					<div class="col">
						<input class="form-control" type="text" required="required"
							name="pan_number" pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}" />
					</div>
					<div class="col">
						<input type="file" class="form-control" accept="application/pdf"
							id="panDocument" name="panDocument"
							data-buttonText="Select a File">
					</div>
					<div class="col">
						<input type="button" class="btn btn-info" id="panDocumentView" value="preview"
							onclick="readURL(this)">
					</div>
				</div>
				<br>
				<!-- 
				<div class="row">
					<label for="gst_number" class="col-sm-2 col-form-label">GST Number</label>
					
					<div class="col">
						<input class="form-control" type="text" name="gst_number" />
					</div>
					<div class="col">

						<input type="file" class="form-control"
							name="gstDocument"></td>
					</div>
				</div> -->
				<br>


				<div class="row">
					<label for="Cin_number" class="col-sm-2 col-form-label">CIN
						Number</label>

					<div class="col">
						<input class="form-control" type="text" name="Cin_number" />
					</div>
					<div class="col">
						<input type="file" class="form-control" accept="application/pdf"
							id="CinDocument" name="CinDocument">
					</div>
					<div class="col">
						<input type="button" id="CinDocumentView" class="btn btn-info" value="preview"
							onclick="readURL(this)">
					</div>
				</div>
				<br>

				<div class="row">
					<label for="esic_regestration_no" class="col-sm-2 col-form-label">ESIC
						Number</label>

					<div class="col">
						<input class="form-control" type="text"
							name="esic_regestration_no" />
					</div>
					<div class="col">

						<input type="file" class="form-control" accept="application/pdf"
							id="esicDocument" name="esicDocument">
					</div>
					<div class="col">
						<input type="button" id="esicDocumentView"  class="btn btn-info" value="preview"
							onclick="readURL(this)">

					</div>
				</div>
				<br>
				<div class="row">
					<label for="pf_regestration_no" class="col-sm-2 col-form-label">PF
						Registration Number</label>

					<div class="col">
						<input class="form-control" type="text" name="pf_regestration_no" />
					</div>
					<div class="col">

						<input type="file" class="form-control" accept="application/pdf"
							id="pfDocument" name="pfDocument">
					</div>
					<div class="col">
						<input type="button" id="pfDocumentView" class="btn btn-info" value="preview"
							onclick="readURL(this)">

					</div>
				</div>
				<br>


				<div class="row">
					<label for="msme_regestration" class="col-sm-2 col-form-label">MSME
						Registration Number</label>

					<div class="col">
						<input class="form-control" type="text" name="msme_regestration" />
					</div>
					<div class="col">

						<input type="file" class="form-control" id="MsmeDocument"
							accept="application/pdf" name="msmeDocument">
					</div>
					<div class="col">
						<input type="button" id="MsmeDocumentView" value="preview" class="btn btn-info"
							onclick="readURL(this)">

					</div>

				</div>
				<br>

				<div class="row">
					<label for="tds_certificate" class="col-sm-2 col-form-label">TDS
						Certificate</label>

					<div class="col">
						<input class="form-control" type="text" name="tds_certificate" />
					</div>
					<div class="col">

						<input type="file" class="form-control" id="tdsDocument"
							accept="application/pdf" name="tdsDocument">
					</div>
					<div class="col">
						<input type="button" id="tdsDocumentView" value="preview" class="btn btn-info"
							onclick="readURL(this)">

					</div>
				</div>
				<br>
				<div class="row">
					<label for="tds_deduction_limit" class="col-sm-2 col-form-label">TDS
						Limit Certificate</label>

					<div class="col">
						<input class="form-control" type="text" name="tds_deduction_limit" />
					</div>
					<div class="col">

						<input type="file" class="form-control" accept="application/pdf"
							id="" name="tdsLimitDocument">
					</div>
					<div class="col">
						<input type="button" id="MsmeDocumentView" value="preview" class="btn btn-info"
							onclick="readURL(this)">

					</div>
				</div>
				<br>
				<div class="row">
					<label for="tds_start_date" class="col-sm-2 col-form-label">TDS
						Start Date</label>

					<div class="col">
						<input class="form-control" type="date" id="join_datepicker" required="required" name=tds_start_date />
					</div>


					<div class="col">
						<input type="date" class="form-control"  id="end_datepicker" required="required" name="tds_end_date">
					</div>
					<div class="col"></div>

				</div>
	

				
				
				<br>
				<div>
					<table class="table table-hover small-text" id="tb">
						<tr class="tr-header">
							<th>GST Number</th>
							<th>GST Document</th>
							<th></th>
							<th>State</th>

							<th><a href="javascript:void(0);" style="font-size: 18px;"
								id="addMore" title="Add More Person"><span
									class="glyphicon glyphicon-plus"></span></a></th>
						<tr>
							<td><input type="text" name="gstNumber"
								onkeypress="gstVerify(this)" required="required" class="form-control"></td>

							<td><input type="file" name="gstDocument"
								accept="application/pdf" class="form-control"
								required="required"></td>
							<td><input type="button" 
								 class="btn btn-info"  value="preview"></td>

							<td><select name="state" class="form-control"
								required="required" id="state">
									<option value="">Select</option>
									<option value="AP">Andhra Pradesh</option>
									<option value="AL">Arunachal Pradesh</option>
									<option value="AS">Assam</option>
									<option value="BI">Bihar</option>
									<option value="CH">Chhattisgarh</option>
									<option value="Goa">Goa</option>
									<option value="GU">Gujarat</option>
									<option value="HA">Haryana</option>
									<option value="HP">Himachal Pradesh</option>
									<option value="JK">Jammu & Kashmir</option>
									<option value="JH">Jharkhand</option>
									<option value="KA">Karnataka</option>
									<option value="KE">Kerala</option>
									<option value="MP">Madhya Pradesh</option>
									<option value="MH">Maharashtra</option>
									<option value="MI">Manipur</option>
									<option value="MG">Meghalaya</option>
									<option value="MZ">Mizoram</option>
									<option value="NG">Nagaland</option>
									<option value="OR">Orissa</option>
									<option value="PB">Punjab</option>
									<option value="RJ">Rajasthan</option>
									<option value="SI">Sikkim</option>
									<option value="TN">Tamil Nadu</option>
									<option value="TE">Telangana</option>
									<option value="TR">Tripura</option>
									<option value="UP">Uttar Pradesh</option>
									<option value="UK">Uttarakhand</option>
									<option value="WB">West Bengal</option>






							</select>
							<td><a href='javascript:void(0);' class='remove'><span
									class='glyphicon glyphicon-remove'></span></a></td>
						</tr>
					</table>
				</div>
				<script
					src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
				<script
					src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
				<script>
				$('#tb tr td:eq(2)').click(function() {
					console.log($(this));
					var self = $(this);
					var tr =  $(self[0].parentElement);
					var td = $(tr[0].cells[1]);
					var lastChild =  td[0].lastChild;
					console.log(" lastChild ",lastChild)
					var input = $(lastChild);
					console.log(" input ",input)
						if (input[0].files && input[0].files[0]) {
							var reader = new FileReader();

							reader.onload = function(e) {
								$('<iframe />', {
									name : 'frame1',
									id : 'frame1',
									src : e.target.result
								}).show();
								console.log($("#frame1"));
								var win = window.open("", "window",
										"width=800,height=800");
								;
								win.document
										.write('<iframe width="100%" height="800" src='
												+ e.target.result
												+ ' frameborder="0" allowfullscreen></iframe>')

							}

							reader.readAsDataURL(input[0].files[0]);
						}
				  
				});
					$(function() {
						$('#addMore').on(
								'click',
								function() {
									var data = $("#tb tr:eq(1)").clone(true)
											.appendTo("#tb");
									data.find("input").not(':input[type=button], :input[type=submit], :input[type=reset]').val('');
								});
						$(document).on('click', '.remove', function() {
							var trIndex = $(this).closest("tr").index();
							if (trIndex > 1) {
								$(this).closest("tr").remove();
							} else {
								alert("Sorry!! Can't remove first row!");
							}
						});
					});
				</script>






				<div class="d-grid gap-2">
					<button class="btn btn-primary" type="submit" id="submit">Submit</button>

				</div>

				<script type="text/javascript">
					function readURL(input) {
						console.log(" input  ", input.id);
						var id = input.id.replace("View", "");
						var input = $("#" + id);
						if (input[0].files && input[0].files[0]) {
							var reader = new FileReader();

							reader.onload = function(e) {
								$('<iframe />', {
									name : 'frame1',
									id : 'frame1',
									src : e.target.result
								}).show();
								console.log($("#frame1"));
								var win = window.open("", "window",
										"width=800,height=800");
								;
								win.document
										.write('<iframe width="100%" height="800" src='
												+ e.target.result
												+ ' frameborder="0" allowfullscreen></iframe>')

							}

							reader.readAsDataURL(input[0].files[0]);
						}
					}
				</script>
				<br>
			</div>




		</form:form>
	</div>
</body>
</html>