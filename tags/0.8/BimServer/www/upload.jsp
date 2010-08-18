<form action="upload" method="post" enctype="multipart/form-data">
<fieldset>
<legend>Upload IFC file</legend>
<table>
<tr><td>IFC File</td><td><input type="file" name="file"/></td></tr>
<tr><td>Comment</td><td><input type="text" name="comment"/></td></tr>
</table>
<input type="hidden" name="pid" value="<%=request.getParameter("projectId") %>"/>
<input type="hidden" name="type" value="ifc"/>
<input type="submit" name="upload" value="Upload"/>
</fieldset>
</form>