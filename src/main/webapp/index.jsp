<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
</h1>
<br/>
<button class="btn btn-info" type="submit"><a href="">Add New Product</a></button>


<table class="table table-striped text-center">
    <thead>
    <tr>
        <th scope="col"></th>
        <th scope="col">Image</th>
        <th scope="col">Product</th>
        <th scope="col">Detail</th>
        <th scope="col">Price</th>
        <th scope="col">Action</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td><img style="width: 100px ;height: 100px"
                 src="https://bizweb.dktcdn.net/thumb/1024x1024/100/299/798/products/217009883-apple-iphone-5s-16gb-7d5b2fd3-f05f-4f7d-85ad-d87d74e2605e.jpg?v=1525697665790">
        </td>
        <td>Iphone 5S</td>
        <td>Điện thoại iPhone 5S 16GB</td>
        <td>3000000 VNĐ</td>
        <td>
            <button class="btn btn-danger">Edit</button>
            <button class="btn btn-danger">Remove</button>
        </td>
    </tr>
    </tbody>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>