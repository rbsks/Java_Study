``` html  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
</script>
<html>
<head>
<title>Google Map</title>
<meta charset="utf-8">
<style type="text/css">
/* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
#map {
	height: 400px;
	width : 100%;
}

/* Optional: Makes the sample page fill the window. */
html, body {
	height: 100%;
	margin: 0;
	padding: 0;
}
</style>
</head>
<script src="https://polyfill.io/v3/polyfill.min.js?features=default"></script>
<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC8Un5TEXbB8cb1ZVWxDjP84a8xkS5a5RM&callback=initMap&libraries=&v=weekly"></script>
<body>
	<div id="mapdiv">
		<div id="map"></div>
	</div>
	<input type="text" class="form-control form-join" id="address">
	<button name="subject" class="btn button-success" id="btn-mapchange" value="trans">지도변경</button>
	
	<script>
		function initMap(){
			let latitude = 37.566536;
			let longitude = 126.97797;

			let seoul = {lat : latitude, lng : longitude};
			let map = new google.maps.Map(document.getElementById("map"),{
				zoom : 15,
				center : seoul
				});
			// marker
			let marker = new google.maps.Marker({
				position : seoul,
				title : "Hello Marker"
				});
			marker.setMap(map);
		} 

		function reloadMap(latitude, longitude){
			var searchlocation = {lat: Number(latitude), lng: Number(longitude)};
			var map = new google.maps.Map(document.getElementById('map'),{
				zoom: 12,
				center: searchlocation
			});
			//마커설정//
			var marker = new google.maps.Marker({
				position: searchlocation,
				title: "Hello Marker"
			});
			
			//마커추가//
			marker.setMap(map);
		}

		$("#btn-mapchange").click(function(){
			let adress_text = $("#address").val();
			let trans_object = 
				{
					"address" : adress_text
					
				}
			let trans_json = JSON.stringify(trans_object); // json으로 변환
			console.log(trans_json);
			$.ajax({
				url : "https://maps.googleapis.com/maps/api/geocode/json?address=" + adress_text + "&key=AIzaSyC8Un5TEXbB8cb1ZVWxDjP84a8xkS5a5RM",
				type : "POST",
				dataType :"json",
				data : trans_json,
				//contentType : "application/json",
				//mimeType : "application/json",
				success : function(retVal){
					alert(JSON.stringify(retVal));
					reloadMap(retVal.results[0].geometry.location.lat, retVal.results[0].geometry.location.lng);
					//reloadMap(retVal.results[0].geometry.viewport.northeast.lat, retVal.results[0].geometry.viewport.northeast.lng);
					//reloadMap(retVal.results[0].geometry.viewport.southwest.lat, retVal.results[0].geometry.viewport.southwest.lng);
				},
				error : function(){
					alert("error");
				}
					
			});
		});S
	</script>
</body>
</html>
```  
