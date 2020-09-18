<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        if($_POST['sodong'] == NULL or $_POST['socot'] == NULL)
            echo "Khong du thong tin de ve.";
        else{
            echo "<table width=100 border=2>";
            for($i=1; $i<=$_POST['sodong']; $i++){
                echo "<tr height=20>";
                for($k=1; $k<=$i; $k++)
                    echo "<td width=100>$k</td>";
                for($j=$i+1; $j<=$_POST['socot']; $j++)
                    echo "<td width=100></td>";
                echo "</tr>";
            }
            echo "</table>";
        }
        ?>
    </body>
</html>
