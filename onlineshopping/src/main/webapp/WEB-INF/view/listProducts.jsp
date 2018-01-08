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
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>


						</ol>
					</c:if>

					<c:if test="${ userClickCategoryProducts==true}">
						<ol class="breadcrumb">

							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>


						</ol>
					</c:if>

				</div>

			</div><!-- end of raw -->


		</div>


	</div>



</div>