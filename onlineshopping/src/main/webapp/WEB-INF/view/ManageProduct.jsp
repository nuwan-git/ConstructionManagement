<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">

	<div class="row">

		<c:if test="${not empty message}">
		
			<div class="col-md-12">
			
				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>
					${message}
				</div>
			</div>
			
		</c:if>
		<div class=" col-md-8 mx-auto">

			<div class="card text-center">
				<div class="card-header success-color white-text">
					<h4>Product Management</h4>
				</div>
				<div class="card-body">


					<sf:form class="form" role="form" autocomplete="off"
						modelAttribute="product" action="${contextRoot}/manage/products"
						method="POST">

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Enter
								Product Name</label>
							<div class="col-lg-9">
								<sf:input type="text" class="form-control" id="name" path="name"
									placeholder="Product Name"></sf:input>
								<sf:errors path="name" cssClass="help-block" element="em"/>
								
							</div>
						</div>
						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Enter
								Brand Name</label>
							<div class="col-lg-9">
								<sf:input type="text" class="form-control" id="brand"
									path="brand" placeholder="Brand Name"></sf:input>
									<sf:errors path="brand" cssClass="help-block" element="em"/>
								
							</div>
						</div>
						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Enter
								Unit Price</label>
							<div class="col-lg-9">
								<sf:input type="number" class="form-control" id="unitprice"
									path="unitprice" placeholder="Unit Price"></sf:input>
									<sf:errors path="unitprice" cssClass="help-block" element="em"/>
								
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Product
								Description</label>
							<div class="col-lg-9">
								<sf:textarea class="form-control" id="description"
									path="description" placeholder="Unit Price"></sf:textarea>
								<sf:errors path="description" cssClass="help-block" element="em"/>
								
							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Quantity
								Available</label>
							<div class="col-lg-9">
								<sf:input type="number" class="form-control" id="quantity"
									path="quantity" placeholder="Quantity Availble"></sf:input>

							</div>
						</div>

						<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Select
								Category</label>
							<div class="col-lg-9">
								<sf:select class="form-control" id="categoryId"
									path="categoryId" items="${categories}" itemLabel="name"
									itemValue="id">
									<option value="1">Category One</option>
									<option value="2">CAtegory Two</option>
								</sf:select>
							</div>
						</div>


						<div class="form-group">
							<input type="Submit" value="Submit"
								class="btn btn-success btn-lg float-right" />

							<!-- Hidden fields of Product -->
							<sf:hidden path="id" />
							<sf:hidden path="code" />
							<sf:hidden path="supplierId" />
							<sf:hidden path="active" />
							<sf:hidden path="purchases" />
							<sf:hidden path="views" />

						</div>
					</sf:form>

				</div>

				<div class="card-footer text-muted success-color white-text">
					<p class="mb-0"></p>
				</div>
			</div>



		</div>


	</div>



</div>