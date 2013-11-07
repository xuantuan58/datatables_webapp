<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="js/jquery/plugin/data_table/reset-min.css">
<link rel="stylesheet" type="text/css" href="js/jquery/plugin/data_table/complete.css">

<script type="text/javascript" language="javascript" src="js/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" language="javascript" src="js/jquery/plugin/data_table/jquery.dataTables.min.js"></script>
<script type="text/javascript" language="javascript" src="js/jquery/plugin/data_table/jquery.dataTables.plugins.js"></script>

<script language="javascript" type="text/javascript">
	var oTable;
	function renderTable(data){
		//Note: Due to limitation of json we cannot add callback code into json, 
		//therefore JSON.parse will substitute the callback name by callback function which usually defines in plugin file. 
		oTable = $("#testTable").dataTable(JSON.parse(data, applyCallback)); 
	}
	
	$(document).ready(function(){
		$.ajax({
			dataType: "text",			//force ajax return text in order to parse json latter.
			url: "DataTableCtrl", 
			success: renderTable
		});
	});
</script>
</head>
	<body>
		<table width="100%" id="testTable" class="pretty"></table>
	</body>
</html>