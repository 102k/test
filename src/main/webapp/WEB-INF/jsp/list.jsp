<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">

		<title>Dashboard Template for Bootstrap</title>
		<!-- Bootstrap core CSS -->
		<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

		<!-- Custom styles for this template -->
		<link href="${pageContext.request.contextPath}/css/dashboard.css" rel="stylesheet">
	</head>

	<body>
				<main role="main" class="col-md-12 ml-sm-auto col-lg-12 pt-3 px-4">
					<h2>Section title</h2>
					<div class="table-responsive">
						<table class="table table-striped table-sm">
							<thead>
								<tr>
									<th>全选<input type="checkbox" name="checkAll"></th>
									<th>商品编号</th>
									<th>商品名称</th>
									<th>商品价格</th>
									<th>商品描述</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach items="${product.list}" var="product">
								<tr>
									<td><input type="checkbox" name="checkOne"></td>
									<input type="hidden" name="pid" value="${product.pid}">
									<td>${product.code}</td>
									<td>${product.pname}</td>
									<td>${product.money}</td>
									<td>${product.remark}</td>
									<td>
										<a href="#" class="btn btn-dark">修改</a>
										<a href="#" class="btn btn-danger">删除</a>
									</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>

					<!--  分页样式  -->
					<div>
						<span>
							<c:forEach items="${product.pageView}" var="page">
								${page}
							</c:forEach>
						</span>
					</div>
				</main>
			</div>
		</div>

		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/popper.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	</body>

</html>