<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="js/jquery/plugin/ui/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="js/jquery/plugin/data_table/css/jquery.dataTables_themeroller.css">

<script type="text/javascript" language="javascript" src="js/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" language="javascript" src="js/jquery/plugin/jquery-ui-1.9.2.custom.js"></script>
<script type="text/javascript" language="javascript" src="js/jquery/plugin/data_table/jquery.dataTables.min.js"></script>
<script type="text/javascript" language="javascript" src="js/jquery/plugin/data_table/jquery.dataTables.plugins.js"></script>
<script language="javascript" type="text/javascript">

var oTable;
function renderTable(data){
	if(oTable != null){
		oTable.fnDestroy();
		oTable.empty();
	}
	
	oTable = $("#testTable").dataTable(JSON.parse(data, applyCallback)); 
}

$(document).ready(function(){
	$("#btnClient").click(function(){
		$.ajax({
			dataType: "text",
			url: "DataTableCtrl?side=client", 
			success: renderTable
		});
	});

	$("#btnServer").click(function(){
		$.ajax({
			dataType: "text",
			url: "DataTableCtrl?side=server", 
			success: renderTable
		});
	});
});

</script>
</head>
<body>
<h2>Datatables On Demand Rendering!</h2>

<input type="button" id="btnClient" value="Create Static Data Table" />
<input type="button" id="btnServer" value="Create Dynamic Data Table" /> 

<table width="100%" id="testTable"></table>
</body>
</html>