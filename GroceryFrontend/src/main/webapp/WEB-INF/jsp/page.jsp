<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/rs/css" />
<spring:url var="images" value="/rs/images" />

<spring:url var="js" value="/rs/js" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}" /> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
   
    <script>
	window.contextRoot = '${contextRoot}';
</script>
 <!-- Bootstrap Core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    
    <!-- Bootstrap Datatable CSS -->
    <link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
    <link href="${css}/jquery.dataTables.css" rel="stylesheet">
    
    
     <!-- Custom CSS -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">
       <link href="${css}/productcard.css" rel="stylesheet">
   
   
</head>
<body>


 <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>
 
    <!-- Page Content -->
    <c:if test="${userclickhome==true}">
   		 <%@include file="home.jsp" %>
    </c:if>
    
     <c:if test="${userclickallproducts==true || userclickcategoryproducts==true}">
   		 <%@include file="product.jsp" %>
    </c:if>
    
     <c:if test="${userclicksingleproduct==true }">
   		 <%@include file="singleproduct.jsp" %>
    </c:if>
    
       <c:if test="${userclickaboutus==true }">
   		 <%@include file="about.jsp" %>
    </c:if>
    
     <c:if test="${userclickservice==true || userclicklogin==true}">
   		 <%@include file="service.jsp" %>
    </c:if>

    
     <c:if test="${userclickmanageproduct==true }">
   		 <%@include file="manageproduct.jsp" %>
    </c:if>
    
      <c:if test="${userclickcontact==true }">
   		 <%@include file="contact.jsp" %>
    </c:if>
    
    <c:if test="${userclicksuccess==true }">
   		 <%@include file="loginsuccess.jsp" %>
    </c:if>
    
 <!-- footer -->
    <%@include file="./shared/footer.jsp" %>


<!-- /.container -->


    <!-- jQuery -->
    <script src="${js}/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="${js}/bootstrap.min.js"></script>
    
     <!-- Datatable Core  -->
    <script src="${js}/dataTables.bootstrap.js"></script>
    
    <!-- Datatable jquery JavaScript -->
    <script src="${js}/jquery.dataTables.js"></script>
    
      
      
    <!-- BootBoc jquery JavaScript -->
    <script src="${js}/bootbox.min.js"></script>
      
    <!-- custom JavaScript -->
    <script src="${js}/myScript.js"></script>

</body>
</html>