<%--
  Created by IntelliJ IDEA.
  User: ngcha
  Date: 17/11/2023
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button>Thêm Sản Phẩm</button>

<form>
    <fieldset disabled>
        <legend>Add Product</legend>
        <div class="mb-3">
            <label for="name" class="form-label">Product's name:</label>
            <input type="text" id="name" class="form-control" placeholder="Enter Product's name">
        </div>
        <div class="mb-3">
            <label for="detail" class="form-label">Detail:</label>
            <input type="text" id="detail" class="form-control" placeholder="Product's detail">
        </div>
        <div class="mb-3">
            <label for="img" class="form-label">Image's link:</label>
            <input type="text" id="img" class="form-control" placeholder="Image">
        </div>
        <div class="mb-3">
            <label for="price" class="form-label">Price:</label>
            <input type="text" id="price" class="form-control" placeholder="Product's price">
        </div>

        <div class="mb-3">
            <label for="disabledSelect" class="form-label">Select menu</label>
            <select id="disabledSelect" class="form-select">
                <option>On Sale</option>
                <option>Sold!</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </fieldset>
</form>
</body>
</html>
