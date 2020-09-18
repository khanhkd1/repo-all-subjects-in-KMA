<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        if($_POST['ten'] == NULL or $_POST['diachi'] == NULL or $_POST['nghe'] == NULL)
            echo "quay lai va nhap du thong tin";
        else {
            if($_POST['ten'] == '' or $_POST['diachi'] == '' or $_POST['nghe'] == '')
                echo "dung de trong du lieu nha";
            else {
                echo "Ten: ".$_POST['ten']."<br>";
                echo "Dia chi: ".$_POST['diachi']."<br>";
                echo "Nghe: ".$_POST['nghe']."<br>";
                echo "Ghi chu: ".$_POST['ghichu']."<br>";
            }
        }
        ?>
    </body>
</html>
