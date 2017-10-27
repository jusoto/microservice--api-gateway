<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	List drivers = (List) session.getAttribute("drivers");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style>
#map {
	height: 100%;
}

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

	<div class="container">
		<div class="topright">Welcome ${sessionScope.name}</div>
		<div class="row">

			<div class="col-md-4">

				<div class="starter-template">
					<h1>Message from Requested Service</h1>
					<span>Message: ${message}</span>
				</div>

				<hr size="4" color="gray" />

				<h3>List of Available Drivers Nearby</h3>
				<table>
					<c:forEach items="${drivers}" var="driver">
						<tr>
							<td>Driver Name:
							    <c:forEach var="car" items="${driver.cars}">
									<c:out value="${driver.fname} ${driver.lname} - ${car.plate}" />
								</c:forEach>
							</td>
							<td>Driver Location: <c:out
									value="${driver.lastLocationLat},${driver.lastLocationLon}" /></td>
						</tr>
					</c:forEach>
				</table>

			</div>
			<div class="col-md-8">
				<!-- 				<h2>Map Pickup Place</h2> -->

				<!-- 				<iframe width="600" height="450" frameborder="0" style="border: 0" -->
				<!-- 					src="https://www.google.com/maps/embed/v1/place?key=AIzaSyA-A_VJjmiAKM-xwZpv7RdxDKkV5hzMh4Y -->
				<!--   &q=Ultimate+Software+Group+-+Phase+10,Weston+FL" -->
				<!-- 					allowfullscreen> </iframe> -->


				<div id="floating-panel">
					<b>Mode of Travel: </b> <select id="mode">
						<option value="DRIVING">Driving</option>
					</select>
				</div>
				<div id="map"></div>
				<script>
					function initMap() {
						var directionsDisplay = new google.maps.DirectionsRenderer;
						var directionsService = new google.maps.DirectionsService;
						var map = new google.maps.Map(document
								.getElementById('map'), {
							zoom : 14,
							center : {
								lat : 25.927786,
								lng : -80.397045
							}
						});
						directionsDisplay.setMap(map);

						calculateAndDisplayRoute(directionsService,
								directionsDisplay);
						document.getElementById('mode').addEventListener(
								'change',
								function() {
									calculateAndDisplayRoute(directionsService,
											directionsDisplay);
								});

					}

					function calculateAndDisplayRoute(directionsService,
							directionsDisplay) {
						var selectedMode = document.getElementById('mode').value;
						directionsService
								.route(
										{
											origin : {
												lat : 26.089545,
												lng : -80.367062
											}, // Haight.
											destination : {
												lat : 25.756606,
												lng : -80.373957
											}, // Ocean Beach.
											// Note that Javascript allows us to access the constant
											// using square brackets and a string value as its
											// "property."
											travelMode : google.maps.TravelMode[selectedMode]
										},
										function(response, status) {
											if (status == 'OK') {
												directionsDisplay
														.setDirections(response);
											} else {
												window
														.alert('Directions request failed due to '
																+ status);
											}
										});
					}
				</script>
				<script
					src="https://maps.googleapis.com/maps/api/js?key=AIzaSyARU2EByzzp_N6V-SYXW9U8n0yJQF2flxA&callback=initMap"
					async defer></script>


			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>