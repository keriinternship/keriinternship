<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <?php
    use PHPMailer\PHPMailer\PHPMailer;
    use PHPMailer\PHPMailer\SMTP;
    use PHPMailer\PHPMailer\Exception;
    require ('PHPMailerAutoload.php');
    if(isset($_POST["send"])){
        
        $mail = new PHPMailer;
        $mail->isSMTP();                                            // Send using SMTP
        $mail->Host       = 'smtp.gmail.com';                    // Set the SMTP server to send through
        $mail->SMTPAuth   = true;                                   // Enable SMTP authentication
        $mail->Username   = 'phamduong0977801937@gmail.com';                     // SMTP username
        $mail->Password   = '0977801937';                               // SMTP password
        $mail->SMTPSecure = 'tls';         // Enable TLS encryption; `PHPMailer::ENCRYPTION_SMTPS` encouraged
        $mail->Port       = 587;
        
        $mail->isHTML(true);
        $mail->setFrom('ptduonga7tqtpy@gmail.com', 'Mailer');
        $mail->addAddress($_POST['email'], 'Joe User');
        $mail->Subject = $_POST["chude"];
        $mail->Body    = $_POST["content"];
        if(!$mail->send()){
        echo 'Message could not be sent';
        echo 'Mailer Error : '. $mail->ErrorInfo;
        }else{
            echo'Message has been sent';
        }
    }
    ?>
    <form action="" method ="POST">
    <h3>Send Email</h3>
    <table width="500">
        <tr>
            <td>Họ Tên</td>
            <td>
            <input type="text" name="fullname" id="fullname">
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
            <input type="text" name="email" id="email">
            </td>
        </tr>
        <tr>
            <td>Chủ đề</td>
            <td>
            <input type="text" name="chude" id="chude">
            </td>
        </tr>
        <tr>
            <td>Nội dung</td>
            <td>
            <textarea name="content" id="content" cols="30" rows="10"></textarea>
            </td>
        </tr>
        <tr>
            
            <td>
            <input type="submit" value ="Send" name="send">
            </td>
        </tr>
    </table>
    
    </form>
</body>
</html>