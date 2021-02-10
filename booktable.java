
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class booktable {
    public static void main(String[] args) throws SQLException{
        
String userName = "root"; /// ผู้ใช้งาน
String password = ""; /// รหัสผ่าน

String urlquery = "jdbc:mysql://localhost/bookstore"; 
Connection conn = DriverManager.getConnection(urlquery, userName, password); // สร้างการเชื่อมต่อไปยัง Database
    System.out.println("Connection Established"); // ตรวจสอบว่าการต่อเชื่อมสมบูรณ์หรือไม่
    Statement stmt = conn.createStatement() ; 
    

String createbook = "Create table book " +
 	"(Book_ID VARCHAR(50), Book_name VARCHAR(50),Book_type VARCHAR(50),Author VARCHAR(50),Number VARCHAR(50) " + ",Price VARCHAR(50))";
	stmt.executeUpdate(createbook);
 
    // Insert ข้อมูลของ book table
    
String insertbook= "Insert into book value " + "('01','JAVA PROGRAMMING','computer','Dr.Jirawat','2','450')";
        stmt.executeUpdate(insertbook);  
insertbook = "Insert into book values " +	"('02','C/C++ PROGRAMMING','computer','Dr.Pattaraphong','3','250')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('03','PYTHON PROGRAMMING','computer','Dr.Parin','5','1500')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('04','HOW TO PAY PHOTOSET BNK48','entertainment','Mr.Surapat','8','5500')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('05','TRAVEL TO AMERICA','travel','Mrs.Kesinee','7','380')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('06','TRAVEL TO JAPAN','travel','Mrs.Kesinee','9','550')";
	stmt.executeUpdate(insertbook);        
insertbook = "Insert into book values " +	"('07','HOW TO GO BANGNA WITH HANDSHAKE EVENT BNK48','entertainment','Mr.Surapat','11','1500')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('08','How TO FIND A GIRLFRIEND QUICKLY','psychology','Dr.Tanasak','12','50')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('09','HOW TO PRESENT PROJECT OOP GET A LOT OF POINTS','psychology','Dr.Piyagoon','13','500')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('10','HOW TO USE MICROSOFT OFFICE','computer','Mrs.Nui','22','189')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('11','THAI LANGUAGE','language','Dr.Piyagoon','25','89')";
	stmt.executeUpdate(insertbook);     
insertbook = "Insert into book values " +	"('12','HOW TO FIND A FOOD','food','Mrs.Chonlada','6','399')";
	stmt.executeUpdate(insertbook);    
insertbook = "Insert into book values " +	"('13','HOW TO FIND A SHOES STORE','shoes','Mr.Yuttapichai','17','450')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('14','REVIEW TO SUPERCAR','car','Dr.Surapat','19','3200')";
	stmt.executeUpdate(insertbook);   
insertbook = "Insert into book values " +	"('15','LEARN TO BLUESCREEN WINDOWS','computer','Dr.Surapat','22','329')";
	stmt.executeUpdate(insertbook);  

insertbook = "Insert into book values " +	"('16','PREMIERE PRO CC 2018','computer','Dr.Raweeroch','78','400')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('17','MARIO','cartoon','Dr.Surapat','3','399')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('18','PREMIERE PRO & AFTER EFFECTS CC 2018','computer','Ph.D.Samarn','12','2500')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('19','SUPER EASY EXCEL','computer','Mr.John','11','225')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('20','AUTOCAD 2019 : 2D DRAFTING','computer','Dr.Pattaraphong','5','990')";
	stmt.executeUpdate(insertbook);        
insertbook = "Insert into book values " +	"('21','WINDOWS 7','computer','Dr.Pattaraphong','11','250')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('22','WINDOWS XP','computer','Dr.Teerapat','45','250')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('23','GOOD KERWORD + SEO','computer','Dr.Parin','35','500')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('24','CG PAINTING BASIC','computer','Dr.Parin','32','750')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('25','NOTEBOOK & ULTRABOOK WINDOWS 8','computer','Dr.Jirawat','15','650')";
	stmt.executeUpdate(insertbook);     
insertbook = "Insert into book values " +	"('26','PRACTICAL IOT DESIGN AND IMPLEMENTATION FREE','computer','Dr.Jirawat','36','453')";
	stmt.executeUpdate(insertbook);    
insertbook = "Insert into book values " +	"('27','WEB SECURITY','computer','Dr.Pattaraphong','2','480')";
	stmt.executeUpdate(insertbook);
insertbook = "Insert into book values " +	"('28','PROGRAM OF THE YEAR','computer','Dr.Pattaraphong','1','1990')";
	stmt.executeUpdate(insertbook);   
insertbook = "Insert into book values " +	"('29','TRIP TO PLUTO ','travel','Mr.Ong','2','9950')";
	stmt.executeUpdate(insertbook);        
insertbook = "Insert into book values " +	"('30','TRIP TO OSAKA : KYOTO & KANSAI','travel','Mr.Ong','1','4500')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('31','LETS GO ITALY','travel','Mr.Injan','32','450')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('32','AROUND THE WORLD','travel','Mr.Injan','22','320')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('33','AFRICA A JOURNEY','travel','Mr.Injan','55','450')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('34','VISIT NEW YORK','travel','Mr.Injan','32','450')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('35','JAPAN FAMILY TRIP','travel','Mrs.Kesinee','32','799')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('36','JAPAN FIRST TIME','travel','Mrs.Kesinee','12','450')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('37','THAILAND GOLF GUIDE BY KBANK 2014','travel','Mr.Injan','32','450')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('38','PERFECT ENGLISH VOCABULARY','language','Dr.Jakkra','32','650')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('39','SHORTCUT CHINESE','language','Dr.Jakkra','2','450')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('40','ENJOY ENGLISH','language','Dr.Piyagoon','45','450')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('41','ENGLISH COMMUNICATION SKILLS FOR AIRLINE BUSINESS','language','Dr.Jakkra','5','550')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('42','EASY & PERFECT EMAIL WRITING','language','Dr.Jakkra','8','650')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('43','ENGLISH CONVERSATION FROM AM TO PM','language','Dr.Piyagoon','3','350')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('44','CINDERELLA','cartoon','Mr.Tanathip','8','399')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('45','TREASURE ISLAND','cartoon','Mr.Nonny','5','399')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('46','THE LITTLE MATCH GIRL','cartoon','Mr.Nonny','6','499')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('47','ALADDIN AND THE MAGIC LAMP','cartoon','Mr.Nonny','3','299')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('48','THE LITTLE MERMAID','cartoon','Mr.Tae','7','399')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('49','PINOCCHIO','cartoon','Mr.Tae','15','199')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('50','PETER PAN','cartoon','Mr.R','3','299')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('51','DORAEMON','cartoon','Mr.Tae','9','599')";
	stmt.executeUpdate(insertbook);      
insertbook = "Insert into book values " +	"('52','CONAN','cartoon','Mr.Tanathip','5','899')";
	stmt.executeUpdate(insertbook);     
        
   
    }
}


