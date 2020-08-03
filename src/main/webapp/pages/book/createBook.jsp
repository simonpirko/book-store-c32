<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
        integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="/"> Home <span class="sr-only">(current)</span></a>
            </li>
        </ul>
    </div>
</nav>

<h2>Create a new book</h2>

<form action="/book/createBook" method="post">
<p><li>Name book <input type="text" name="name" placeholder="Name"></li></p>

<p><li> Author <input type="text" name="author" placeholder="Author"></li></p>

<p>
<li> Format <select name="format">
    <c:forEach items="${requestScope.format}" var="list">
        <option value="${list}"> ${list} </option>
    </c:forEach>
</select>
</li>
</p>

<p><li> Publisher <input type="text" name="publisher" placeholder="Publisher"></li></p>

<p>
<li> Publication Date <select name="publicationDate">
    <c:forEach items="${requestScope.listPublicationDate}" var="list">
        <option value="${list}"> ${list} </option>
    </c:forEach>
</select>
</li>
</p>

<p></li> Pages <input type="number" name="pages" placeholder="Pages"></p></p>

<p>
<li> Select Genres:
    <label class="container" na
<c:forEach items="${requestScope.allGenres}" var="list">
<div class="form-check form-check-inline">
    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" name="genres" value="${list.id}">
    <label class="form-check-label" for="inlineCheckbox1">${list.name}</label>
</div>
</c:forEach>
</li>
</p>

<dl class="row offset-sm-1">
    <div class="form-group  w-50">
        Описание
        <textarea class="form-control" name="description" id="exampleFormControlTextarea1"
                  rows="3"></textarea>
    </div>
</dl>


<p><li> Prise in BYN <input type="text" name="cost" placeholder="Prise"></li></p>

<p>
<li> Status <select name="statusBook">
    <c:forEach items="${requestScope.status}" var="list">
        <option value="${list}"> ${list} </option>
    </c:forEach>
</select>
</li>
</p>

<button>Submit</button>
</form>

</body>
</html>


<%--Create new Book--%>