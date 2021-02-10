
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyForm extends JFrame {
	private JTextField txtKeyword; //กำหนด Attribute JTextField ให้เป็น txtkeyword สำหรับกล่องงข้อความ เพราะเรา extends JFrame มาอีกที
	private JTable table; //กำหนด Attribute JTable ให้เป็น table สำหรับตาราง เพราะเรา extends JFrame มาอีกที
       
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				MyForm frame = new MyForm(); // สร้าง OBJ frame เพื่อดึงค่าจาก constructor MyForm() 
				frame.setVisible(true); //โชว์ GUI ที่สร้างจาก  constructor MyFrom หรือ OBJ frame นั่นแหละ
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyForm() {
                   
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 900, 350); // ใช้กำหนด (x , y, กว้าง, สูง) และขนาดของ component ของ ตัวหน้าต่าง GUI 
		setTitle("โปรแกรมค้นหาหนังสือ สำหรับร้าน Smartbook สาขา พลูโต>>>>เบอร์โทรติดต่อ (064-2232999) ฝ่าย Call Center"); // Set คำว่า โปรแกรมค้นหาหนังสือ สำหรับร้าน Smartbook
		getContentPane().setLayout(null); //โครงหน้าต่าง GUI โดยมีค่าว่าง เป็น Blackground 
		
		// ScrollPane การสร้างตัวเลื่อน Table ของเรานะครับ
		JScrollPane scrollPane = new JScrollPane(); //สร้าง JSrollPane เป็นตัวเลื่อนตารางครับ
		scrollPane.setBounds(50, 100, 800, 150); // ใช้กำหนด (x , y, กว้าง, สูง) และขนาดของ component ของ scrollPane  
		getContentPane().add(scrollPane); //วาง GUI OBJ scrollPane ลงใน ContentPane
		
		// Table กำหนดให้ Program ของเรามี table
		table = new JTable(); // สร้าง JTable
		scrollPane.setViewportView(table); //เอาตัวเลื่อนให้ balance กับ table ครับ
		
		// Label Search 
		JLabel lblSearch = new JLabel("Search Name"); //สร้าง JLabel เพื่อแสดงข้อความ Search Name
		lblSearch.setBounds(265, 27, 84, 14); // ใช้กำหนด(x , y, กว้าง, สูง) และขนาดของ component ของ lblSearch
		getContentPane().add(lblSearch); //วาง GUI OBJ lblSearch ลงใน ContentPane
		
		// Keyword เป็น Box สีขาวๆ สำหรับพิมพ์ข้อความลงไปครับ
		txtKeyword = new JTextField(); //สร้าง txtKeyword เป็น box ไว้กรอกข้อมูลครับ
		txtKeyword.setBounds(350, 24, 200, 25); // ใช้กำหนด (x , y, กว้าง, สูง) และขนาดของ component ของ txtKeyword
		getContentPane().add(txtKeyword); //วาง GUI OBJ txtKeyword ลงใน ContentPane
		txtKeyword.setColumns(10); // เป็นการกำหนดจำนวนคอลัมน์ที่สามารถมีได้ในแต่ละแถว 
		
		// Button Search อันนี้สร้างปุ่ม Seach สำหรับการค้นหาครับ 
		JButton btnSearch = new JButton("Search"); //สร้าง JButton เป็นปุ่มกดครับ โดยในปุ่มกดแสดงว่า Seach ด้วย
                
                // จากนั้น เราทำการ สร้างการกระทำ เมื่อเกิดมีการ คลิ๊กเมาส์ที่ปุ่ม Seach โดย ActionListener ที่ btnSeach
		btnSearch.addActionListener(new ActionListener() {
                   
                    
                        //ตรงนี้สร้าง การกระทำ สำหรับปุ่ม Seach
			public void actionPerformed(ActionEvent arg0) {
				
				PopulateData(); // เรียก Method นี้เมื่อคุณ คลิ๊กปุ่ม Search มันจะ Process ให้เราตามกระบวนการใน Method นี้ 
			}
		});
		btnSearch.setBounds(555, 23, 79, 23); // ใช้กำหนด (x , y, กว้าง, สูง) และขนาดของ component ปุ่ม Seach
		getContentPane().add(btnSearch);
		
		// Bind and PopulateData
		PopulateData();  // ดึงค่าจาก Database มาโชว์ทั้งหมด ในกรณีที่ไม่กด Search เพราะอยู่นอก ActionListener
		
	}
	
	private  void PopulateData() {
		
		// Clear table
		table.setModel(new DefaultTableModel()); //เตรียมทำการ set ค่าข้อมูลใน Table ครับ ดึง table จากตัวแปร table
		
		// Model for Table
		DefaultTableModel model = (DefaultTableModel)table.getModel(); // สร้าง object model ออกมาก ดึง table เป็นค่า Default ที่กำลังจะตั้งไว้
		model.addColumn("Book_ID");  //แสดงชื่อColumn เพื่อลงใน model
		model.addColumn("Book_name"); //แสดงชื่อColumn เพื่อลงใน model
		model.addColumn("Book_type"); //แสดงชื่อColumn เพื่อลงใน model
		model.addColumn("Author"); //แสดงชื่อ Column เพื่อลงใน model
		model.addColumn("หนังสือคงเหลือ"); //แสดงชื่อ Column เพื่อลงใน model
		model.addColumn("Price (หน่วย บาท)"); //แสดงชื่อ Column เพื่อลงใน model
		
		Connection connect = null; //สร้างการเชื่อมต่อ เก็บตัวแปร connect เพื่อเตรียมเชื่อม กับ Database
		Statement s = null; // ยังไม่ทำการเชื่อมต่อกับ Database ปล่อยให้ว่างก่อน เพราะ Try catch
                
		
		try { //ทำ Try เพื่อบอกว่า Funtion นี้มีโอกาส Error สูง ในกรณีที่ คำสั่งในนี้มันผิดพลาด
			Class.forName("com.mysql.jdbc.Driver"); //เอาไดร์เวอร์ของเรามาใช้

			connect =  DriverManager.getConnection("jdbc:mysql://localhost/bookstore" +
					"?user=root&password="); //เชื่อมต่อ Database
 
			s = connect.createStatement(); //lสร้าง Statement ที่เชื่อม Database เมื่อกี้ เก็บใน ตัวแปร s 
			
			String sql = "SELECT * FROM  book " +
					"WHERE Book_name like '%" + txtKeyword.getText() + "%' " +
					"ORDER BY Book_ID ASC"; 
                        //คำสั่ง query โดย โชว์ค่าทั้งหมด เพราะ * ทั้งหมดจาก book จากนั้น Where ที่ชื่อหนังสือ
                        //คำสั่ง like คือ เลือกคำนั้นๆ จาก box ที่เราพิมพ์ txtKeyword และดึงค่าออกจาก เเละเลือกคำที่พิมพ์
                        // จากนั้น ODER BY ก็คือ ให้ Book_ID เรียงข้อมูลจากน้อยไปมาก โดยใช้ ASC ครับ
                   
			ResultSet rec = s.executeQuery(sql); //ประมวลผลคำสั่ง และจะคืนค่าแถวข้อมูลที่ตรงตามเงื่อนไข จากตัวแปร sql แล้วเก็บในตัวแปร obj rec ครับ
                        
 
			int row = 0; // เริ่มที่ roll แรก
			while((rec!=null) && (rec.next())) //กำหนด loop ถ้า rec มีค่า หรือ ไม่มีค่า ให้เข้า loop
            {			
				model.addRow(new Object[0]); //สร้าง obj เพิ่มเตรียมเอาข้อมูลลง row เริ่มที่กล่อง แรก คือ 0
				model.setValueAt(rec.getString("Book_ID"), row, 0); // rec คือคำสั่ง query มันจะดึงค่าจาก database โดยดึงจาก Attribute Book_ID โชว์เรื่อยๆ Column แรก
				model.setValueAt(rec.getString("Book_name"), row, 1); // rec คือคำสั่ง query มันจะดึงค่าจาก database โดยดึงจาก Attribute Book_name โชว์เรื่อยๆ Column สอง
				model.setValueAt(rec.getString("Book_type"), row, 2); // rec คือคำสั่ง query มันจะดึงค่าจาก database โดยดึงจาก Attribute Book_type โชว์เรื่อยๆ Column สาม
				model.setValueAt(rec.getString("Author"), row, 3); // rec คือคำสั่ง query มันจะดึงค่าจาก database โดยดึงจาก Attribute Author โชว์เรื่อยๆ Column สี่
				model.setValueAt(rec.getInt("Number"), row, 4); // rec คือคำสั่ง query มันจะดึงค่าจาก database โดยดึงจาก Attribute Number โชว์เรื่อยๆ Column ห้า
				model.setValueAt(rec.getString("Price"), row, 5); // rec คือคำสั่ง query มันจะดึงค่าจาก database โดยดึงจาก Attribute Price โชว์เรื่อยๆ Column หก
				row++; //ดึงค่าจาก Database ไปเรื่อยๆ จนจบที่เล่ม 52 ครับ อ.โอ๊ค
            }

			rec.close(); //จบการดึงค่าจาก Database 
             
                       
                        //สร้างขึ้นมาเมื่อเกิดกรณี ข้อผิดพลาด catch try เอาไว้โชว์ Error 
		} catch (Exception e) { //catch เพื่อบอกว่า Error ที่เกิดขึ้นตรงกับ case ไหนในโปรแกรม เพื่อสั่งให้มันเข้ามาทำงานเมื่อเกิด Error ขึ้นมา
			
			JOptionPane.showMessageDialog(null, e.getMessage()); //ไม่โชว์ Pop up ครับ
			e.printStackTrace(); // Print Error เลย ของ Exception จากตัวแปร e
                        
		}
		
		try { //สร้างในกรณีมีโอกาส Error ให้ทำการ Process 
			if(s != null) {
				s.close(); //จบการสร้าง Statement 
				connect.close(); //จบการเชื่อมต่อ Database
                                //เปิด GUI มา ข้อมูล Database มันจะไม่มาจ้า
			}
		} catch (SQLException e) { //catch เพื่อบอกว่า Error ที่เกิดขึ้นตรงกับ case ไหน เพื่อสั่งให้มันเข้ามาทำงานเมื่อเกิด Error ขึ้นมา
			
			e.printStackTrace(); // Print Error เลย สำหรับฐานข้อมูล
		}
		
	}// void
	
}