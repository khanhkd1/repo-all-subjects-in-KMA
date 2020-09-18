<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        if(!isset($_POST['gioitinh']))
            echo "Chon gioi tinh di";
        else {
            if($_POST['masv'] == NULL or $_POST['hoten'] == NULL)
                echo "Bat buoc nhap ma sv va ho ten nhe";
            else{
                echo "Ma SV: ".$_POST['masv']."<br>";
                echo "Ho ten: ".$_POST['hoten']."<br>";
                echo "Ngay sinh: ".$_POST['ngaysinh']."<br>";
                echo "Gioi tinh: ".$_POST['gioitinh']."<br>";
                echo "Noi sinh: ".$_POST['noisinh']."<br>";
                echo "Lop: ".$_POST['lop']."<br>";
            }
        }
        ?>
    </body>
</html>
