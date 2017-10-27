<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style>
input, textarea, button {
	margin-top: 10px
}

/* Required field START */
.required-field-block {
	position: relative;
}

.required-field-block .required-icon {
	display: inline-block;
	vertical-align: middle;
	margin: -0.25em 0.25em 0em;
	background-color: #E8E8E8;
	border-color: #E8E8E8;
	padding: 0.5em 0.8em;
	color: rgba(0, 0, 0, 0.65);
	text-transform: uppercase;
	font-weight: normal;
	border-radius: 0.325em;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	-ms-box-sizing: border-box;
	box-sizing: border-box;
	-webkit-transition: background 0.1s linear;
	-moz-transition: background 0.1s linear;
	transition: background 0.1s linear;
	font-size: 75%;
}

.required-field-block .required-icon {
	background-color: transparent;
	position: absolute;
	top: 0em;
	right: 0em;
	z-index: 10;
	margin: 0em;
	width: 30px;
	height: 30px;
	padding: 0em;
	text-align: center;
	-webkit-transition: color 0.2s ease;
	-moz-transition: color 0.2s ease;
	transition: color 0.2s ease;
}

.required-field-block .required-icon:after {
	position: absolute;
	content: "";
	right: 1px;
	top: 1px;
	z-index: -1;
	width: 0em;
	height: 0em;
	border-top: 0em solid transparent;
	border-right: 30px solid transparent;
	border-bottom: 30px solid transparent;
	border-left: 0em solid transparent;
	border-right-color: inherit;
	-webkit-transition: border-color 0.2s ease;
	-moz-transition: border-color 0.2s ease;
	transition: border-color 0.2s ease;
}

.required-field-block .required-icon .text {
	color: #B80000;
	font-size: 26px;
	margin: -3px 0 0 12px;
}
/* Required field END */
</style>
<script>
	$(function() {
		$('.required-icon').tooltip({
			placement : 'left',
			title : 'Required field'
		});
	});
</script>
<title>UltiCar</title>
</head>
<body>
	<!--  <div>
		<div>
			<h1>Request New Trip</h1>
			<form action="/requestTrip">
				Please enter your Latitude <input type="text" name="latitude" /><br>
				Please enter your longitude <input type="text" name="longitude" /><br>
				Please enter your Destination Address <input type="text"
					name="destinationAddress" /><br> <input type="submit"
					value="submit">
			</form>
		</div>
		<div class="topright">Welcome ${sessionScope.name}</div>
	</div>
 -->

	<div class="container">

		<div class="topright">Welcome ${sessionScope.name}</div>
		<div class="row">
			
			<div class="col-md-6">
				<h2>Trip Information</h2>
				<div>

					<form action="/requestTrip" role="form"
						style="width: 400px; margin: 0 auto;">
						<div>
							<h1>Pickup location</h1>

							<div class="required-field-block">
								<input name="latitude" type="text" placeholder="Latitude"
									class="form-control" value="26.089545" />
								<div class="required-icon">
									<div class="text">*</div>
								</div>
							</div>

							<div class="required-field-block">
								<input name="longitude" type="text" placeholder="Longitude"
									class="form-control" value="-80.367062" />
								<div class="required-icon">
									<div class="text">*</div>
								</div>
							</div>
						</div>
						<div>
							<h1>Destination Address</h1>
							<div class="required-field-block">
								<textarea name="destinationAddress" rows="3"
									class="form-control" placeholder="Destination Address">11200 SW 8th St, Miami, FL 33199</textarea>
								<div class="required-icon">
									<div class="text">*</div>
								</div>
							</div>
						</div>
						<input type="hidden" name="idpassenger" value="${idpassenger}" />
						<input type="hidden" name="name" value="${sessionScope.name}" />
						<button class="btn btn-primary" type="submit">Send</button>
					</form>
				</div>
			</div>
			<div class="col-md-6">
				<h2>Map Pickup Place</h2>

				<iframe width="600" height="450" frameborder="0" style="border: 0"
					src="https://www.google.com/maps/embed/v1/place?key=AIzaSyA-A_VJjmiAKM-xwZpv7RdxDKkV5hzMh4Y
  &q=Ultimate+Software+Group+-+Phase+10,Weston+FL"
					allowfullscreen> </iframe>

			</div>
		</div>


	</div>
</body>
</html>