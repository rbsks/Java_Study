	@ResponseBody
	@RequestMapping(value = "xmltest", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
	public String xmltest(HttpServletRequest request) throws IOException {
		
		String adress_text = request.getParameter("address");
		
		StringBuilder urlBulBuilder = new StringBuilder("http://openapi.forest.go.kr/openapi/service/trailInfoService/getforeststoryservice");
		urlBulBuilder.append("?" + URLEncoder.encode("mntnNm", "UTF-8") + "=" + URLEncoder.encode(adress_text, "UTF-8"));
		urlBulBuilder.append("&" + URLEncoder.encode("serviceKey", "UTF-8") + "=c343raXOth1d%2FoC9iVMmHjHi1oVCHNuiL1%2Bb%2FbJfoXLCDhMRMyiF8XwKSFrtNu%2F1fXVSoNl7HCw%2FzO2DS8g7uQ%3D%3D");
		
		System.out.println(adress_text);
		System.out.println(urlBulBuilder);
		
		URL url = new URL(urlBulBuilder.toString());
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		
		urlConnection.setDoOutput(true);
		
		urlConnection.setRequestProperty("CONTENT-TYPE", "application/xml");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));

		String inputLine;
		String buffer = "";
		
		while((inputLine = bufferedReader.readLine()) != null) {
			buffer += inputLine.trim();
		}
		bufferedReader.close();
		System.out.println(buffer);
		
		JSONObject xmlJSONObj = XML.toJSONObject(buffer.toString());
		String jsonPrettyProntString = xmlJSONObj.toString();
		System.out.println(jsonPrettyProntString);

		return jsonPrettyProntString;
				
	}
