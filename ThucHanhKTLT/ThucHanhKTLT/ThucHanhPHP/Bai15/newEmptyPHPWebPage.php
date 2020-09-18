<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form action="index.php" method="post">
            <h1>Dang Ky</h1>
            <div>
                <label>Ma SV: </label>
                <input type="text" name="masv" size="45" />
            </div>
            <div>
                <label>Ho ten: </label>
                <input type="text" name="hoten" size="45" />
            </div>
            <div>
                <label>Ngay sinh: </label>
                <input type="date" name="ngaysinh" size="45" />
            </div>
            <div>
                <label>Gioi tinh: </label>
                <input type="radio" name="gioitinh" value="Nam" />Nam
                <input type="radio" name="gioitinh" value="Nu" />Nu
            </div>
            <div>
                <label>Noi sinh: </label>
                <input type="text" name="noisinh" size="45" />
            </div>
            <div>
                <label>Lop: </label>
                <input type="text" name="lop" size="45" />
            </div>
            <div>
                <input type="reset" name="del" value="Nhap Lai"/>
                <input type="submit" name="add" value="Dang Ky"/>
            </div>
        </form>
    </body>
</html>
