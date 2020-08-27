<?php
DEFINE('DB_USER', 'root');
DEFINE('DB_PASSWORD', '');
DEFINE('DB_HOST', 'localhost');
DEFINE('DB_NAME', 'qlplanes');
$mysqli = @mysql_connect(DB_HOST, DB_USER, DB_PASSWORD) OR die('Could not connect to MySQL');
@mysql_select_db(DB_NAME) OR die('Could not select the database');
mysql_query("SET NAMES 'utf8'");
 
$query = "SELECT * FROM `airticket` WHERE `diemdi` = '" . $_GET["diemdi"] . "' AND `diemden` = '" . $_GET["diemden"] . "' AND `ngaydi` = '" .  $_GET["ngaydi"] . "'";
//$query = "SELECT * FROM `airticket`";
$resouter = mysql_query($query);
 
$temparray = array();
$total_records = mysql_num_rows($resouter);
 
if ($total_records >= 1) {
    while ($row = mysql_fetch_assoc($resouter)) {
        $temparray[] = $row;
    } 
}   
echo json_encode($temparray);
 
?>