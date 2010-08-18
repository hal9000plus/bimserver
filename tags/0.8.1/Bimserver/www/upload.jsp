<fieldset>
<legend>Upload IFC file</legend>
<div id="uploadajaxloader">
Uploading... <img src="images/ajax-loader.gif"/>
</div>
<form action="upload" method="post" enctype="multipart/form-data" id="uploadform">
<table>
<tr><td>IFC File</td><td><input type="file" name="file"/></td></tr>
<tr><td>Comment</td><td><input type="text" name="comment"/></td></tr>
</table>
<input type="hidden" name="pid" value="<%=request.getParameter("pid") %>"/>
<input type="hidden" name="type" value="ifc"/>
<input type="submit" name="upload" value="Upload"/>
</form>
</fieldset>
<script>
	$(document).ready(function(){
		$("#uploadajaxloader").hide();
	});
	$("#uploadform").submit(function(){
		$("#uploadform").hide();
		$("#uploadajaxloader").show();
	});
</script>