<div class="container">

	<div class="row">

		<!-- would be to display sidebar -->
		<div class="col-lg-3">
		
			<%@include file="./shared/sidebar.jsp"%>
			
		</div>

		<!-- to display the actual products -->
		<div class="col-lg-9">

			<!-- 	added breadcrumb components -->
			<div class="row">

				<div class="col-md-12">
					<c:if test="${ userClickAllProducts==true}">
						
						<script>
							window.categoryId='';
						</script>
						
						
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Projects</li>


						</ol>
					</c:if>

					<c:if test="${ userClickCategoryProducts==true}">
						
						<script>
							window.categoryId='${category.id}';
						</script>
						
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">Collaborator</li>
							<li class="breadcrumb-item active">${category.name}</li>


						</ol>
					</c:if>

				</div>

			</div><!-- end of raw -->

			<div class="raw">
				
				<div class="col-xs-12">
				
					<table id="productListTable" class="table table-striped table-borderd ">
					
					
						<thead>
							<tr>
								<th></th>
								<th>Project Name</th>
								<th>Location</th>
								<th>Budget</th>
								<th>Human Resource</th>
								<th></th>
							</tr>
						
						</thead>
						
						<tfoot>
							<tr>
								
								<th></th>
								<th>Project Name</th>
								<th>Location</th>
								<th>Budget</th>
								<th>Human Resource</th>
								<th></th>
							</tr>
						
						</tfoot>
					</table>
				</div>
			
			
			</div>

		</div>


	</div>



</div>