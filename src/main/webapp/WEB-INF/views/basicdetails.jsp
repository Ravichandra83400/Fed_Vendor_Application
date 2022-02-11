<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	

       
	
	
<script>
$(document).ready(function(){
  $("#pincode").change(function(){
	  $('#inputCity').empty();
	  $('#inputState').empty();
	  
    $.ajax(
    	    {
    	    	type: 'GET',
        	    url: "/getPincodeDetails/?pincode="+ $("#pincode").val(), 
        	    dataType: 'json',
        	    success: function(result){
            	    console.log("result ",result);
            	    $.each(result, function(index, value) {
                	    console.log("index ",index, " value ",value.city );
                	     $("#inputCity").append($('<option>').text(value.city).attr('value', value.city));
                	     $("#inputState").val(value.state);

            	    });
              	},
              	error : function(result){
            	    console.log("result ",result);
              	},

            });
  });
});
</script>

<script>
    function onlyNumberKey(evt) {
          
        // Only ASCII character in that range allowed
        var ASCIICode = (evt.which) ? evt.which : evt.keyCode
        if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
            return false;
        return true;
    }
    </script>


<title>Vendor Registration Form</title>
</head>
<script type="text/javascript">
function 	(evt) {
    
    // Only ASCII character in that range allowed
    var ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if (ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return true;
}


</script>
<body>
	<div class="card-header bg-info text-center text-white">
		<h3>Vendor Registration Form</h3>
	</div>
	<div class="container">
		<br>
		<form:form method="POST" action="/savebasicdetails"
			modelAttribute="vendordetails" class="containter">



			<div class="container">
				<div class="row">
				<div class="col">

				<label for="companyName" class="form-label">Company Name</label> 
				<input	type="text" class="form-control" id="companyname"
					name="companyName" required="required" />
			</div>
			
                  
                  <div class="col">
		         	<label for="gl_code" class="form-label">GL Code</label> <input
					type="text" class="form-control" id="glcode" name="gl_code" />
			</div>


			<br>

			<div class="container">
				<div class="row">
				<div class="col">

				<label class="visually-hidden" for="legalStatus">Legal
					Status</label> <select class="form-control" name="legalStatus"
					aria-label="Default select example" required="required">
					<option value="">Select</option>
					<option value="Partnership Firm">Partnership Firm</option>
					<option value="Proprietorship">Proprietorship</option>
					<option value="Limited Liability Partnership">Limited
						Liability Partnership</option>
					<option value="Public Limited Co">Public Limited Co</option>
					<option value="Private Limited Co">Private Limited Co</option>
				</select>
			</div>
		            <div class="col">
                 <label for="yearOfCorporation" class="form-label">Year Of
					Incorporation</label> <input type="number"    onkeypress="return onlyNumberKey(event)" name="yearOfCorporation"
					class="form-control" id="yearof" required="required">
			</div>





			

			<div class="container">
				<div class="row">
				<div class="col">
				<label class="visually-hidden" for="nature">Nature of
					business</label> <select class="form-control" id="nature" name="nature"
					required="required">
					<option selected>Manufacture</option>
					<option value="wholesaler">WholeSaler</option>
					<option value="Limited liability">Limited Liability
						Partnership</option>
					<option value="public limited ">Public Limited Co</option>
					<option value="private limited">Private Limited Co</option>
				</select>
			</div>

		        <div class="col">
				<label for="address1" class="form-label">Address 1</label> <input
					type="text" class="form-control" id="inputAddress" maxlength="50"
					name="address1" placeholder="1234 Main St" required="required">
			</div>
			<div class="container">
				<div class="row">
				<div class="col">
				<label for="address2" class="form-label">Address 2</label> <input
					type="text" class="form-control" id="inputAddress2" maxlength="50"
					name="address2" placeholder="Apartment, studio, or floor">
			</div>
			<div class="col">
				<label for="address3" class="form-label">Address 3</label> <input
					type="text" class="form-control" id="inputAddress2" maxlength="50"
					name="address3" placeholder="Apartment, studio, or floor">
			</div>
			
			<div class="container">
				<div class="row">
				<div class="col">
				<label for="pincode" class="form-label">PinCode</label> <input
					type="text"  onkeypress="return onlyNumberKey(event)" pattern="[0-9]{6}" class="form-control" name="pincode"
					maxlength="6" id="pincode" required="required">
			</div>
			<!-- 	<div class="col-md-6">
				<label for="city" class="form-label">City</label> <input type="text"
					class="form-control" id="inputCity" name="city" required="required">
			</div> -->

			<div class="col">
				<label for="city" class="form-label">State</label> <input
					type="text" class="form-control" id="inputState" name="state" readonly="readonly"
					required="required">
			</div>
			<div class="container">
				<div class="row">
				<div class="col">
				<label for="city" class="form-label">City</label> <select
					id="inputCity" class="form-control" name="city" required="required">
					<option value="">Select</option>
				</select>
			</div>



			<!-- <div class="col-md-6">
				<label for="state" class="form-label">State</label> <select
					id="inputState" class="form-control" name="state"
					required="required">
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
			</div> -->
			<div class="col">
				<label for="website" class="form-label">Website Address</label> <input
					type="text" maxlength="30" class="form-control" name="website"
					id="website">
			</div>
			<div class="container">
				<div class="row">
				<div class="col">
				<label for="name" class="form-label">Contact person Name</label> <input type="text"
					class="form-control" name="name" id="name" required="required">
			</div>

			   <div class="col">
				<label for="number" class="form-label">Mobile Number</label> <input
					type="tel" onkeypress="return onlyNumberKey(event)"  class="form-control" id="number"
					maxlength="10" name="number" required="required">
			</div>
           </div>
		     	
		    <div class="col-md-6">
				<label for="email" class="form-label" >Email</label> <input
					type="email" maxlength="30" class="form-control" name="email"
					id="email" required="required">
			</div>
		    
		    <br><br>


			<div class="d-grid gap-2 d-md-flex justify-content-md-end">
				<button class="btn btn-primary me-md-2" type="submit">Next</button>
			</div>

		</form:form>
	</div>


</body>
</html>








