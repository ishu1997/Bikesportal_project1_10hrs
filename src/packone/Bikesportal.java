package packone;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Bikesportal implements ActionListener{
	
	
	JFrame mainframe = new JFrame();
	JPanel posterpnl = new JPanel();
	JLabel posterlbl = new JLabel();
	JPanel logopnl = new JPanel();
	JLabel logolbl = new JLabel();
	 
	JPanel  buttonpnl = new JPanel();
	JButton buybutton = new JButton("BUY");
	JButton sellbutton = new JButton("SELL");
	JButton searchbutton = new JButton("SEARCH");
	JButton updatebutton = new JButton("UPDATE");	
	
	//building buy panel
	JPanel buypnl = new JPanel();
	JLabel bunamelbl = new JLabel("NAME");
	JLabel bumfglbl = new JLabel("MFG.YEAR");
	JLabel buratinglbl = new JLabel("RATINGS");	
	JLabel bupricelbl = new JLabel("PRICE");	
	JButton nextbtn = new JButton(">");
	JButton prevbtn = new JButton("<");
	JButton firstbtn = new JButton("<<");
	JButton lastbtn = new JButton(">>");	
	JTextField butxtname = new JTextField(10);
	JTextField butxtmfg = new JTextField(5);
	JTextField butxtrating = new JTextField(4);
	JTextField butxtprice = new JTextField(10);
	
	

	//building sell panel
	JLabel senamelbl = new JLabel("NAME");
	JLabel semfglbl = new JLabel("MFG.YEAR");
	JLabel seratinglbl = new JLabel("RATINGS");	
	JLabel sepricelbl = new JLabel("PRICE");	
	JTextField setxtname = new JTextField(10);
	JTextField setxtmfg = new JTextField(5);
	JTextField setxtrating = new JTextField(4);
	JTextField setxtprice = new JTextField(10);
	JPanel sellpnl = new JPanel();
	JLabel selllbl = new JLabel();
	JButton enterbtn = new JButton("ENTER");
	
	//building search panel
	JLabel srnamelbl = new JLabel("NAME");
	JLabel srmfglbl = new JLabel("MFG.YEAR");
	JLabel srratinglbl = new JLabel("RATINGS");	
	JLabel srpricelbl = new JLabel("PRICE");	
	JTextField srtxtname = new JTextField(10);
	JTextField srtxtmfg = new JTextField(5);
	JTextField srtxtrating = new JTextField(4);
	JTextField srtxtprice = new JTextField(10);
	JPanel searchpnl = new JPanel();
	JLabel searchlbl = new JLabel();
	JButton searchbtn = new JButton("search");
	
	//building update panel
	JLabel upnamelbl = new JLabel("NAME");
	JLabel upmfglbl = new JLabel("MFG.YEAR");
	JLabel upratinglbl = new JLabel("RATINGS");	
	JLabel uppricelbl = new JLabel("PRICE");	
	JTextField uptxtname = new JTextField(10);
	JTextField uptxtmfg = new JTextField(5);
	JTextField uptxtrating = new JTextField(4);
	JTextField uptxtprice = new JTextField(10);
	JPanel updatepnl = new JPanel();
	JLabel updatelbl = new JLabel();
	JButton updatebtn = new JButton("update");

	
public Bikesportal(){
	
	//connecting db
	Function f4 = new Function();
	f4.dbcommon();
	// designing of the main frame 
	mainframe.setSize(400,400);
	mainframe.setTitle("BIKE PORTAL");
	mainframe.setResizable(false);
	mainframe.getContentPane().setBackground(Color.WHITE);
	//mainframe.setVisible(true);
	
	//making poster pannel
	posterpnl.setLayout(null);
	posterpnl.setSize(400,190); 
	//posterpnl.setLayout(new BoxLayout(posterpnl, BoxLayout.Y_AXIS));
	posterpnl.setAlignmentX(posterpnl.LEFT_ALIGNMENT);
	posterpnl.setAlignmentX(posterpnl.TOP_ALIGNMENT);
	
	posterlbl.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
	posterlbl.setAlignmentX(posterlbl.LEFT_ALIGNMENT);
	posterlbl.setAlignmentX(posterlbl.TOP_ALIGNMENT);
	//yeahhhhhh!!!!!!!!!!!!!!
	posterlbl.setIcon(new ImageIcon("images\\moto.png"));
    posterlbl.setSize(395,190);
	posterpnl.add(posterlbl);

	
	//making panel to add buttons and 
	buttonpnl.setLayout(null);
	buttonpnl.setBounds(0,185 ,395,40);
	//buttonpnl.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
	
	// setting up buttons for the main frame
	buybutton.setBounds(0,0,100,40);
	buybutton.addActionListener(this);
	sellbutton.setBounds(100,0,100,40);
	sellbutton.addActionListener(this);
	searchbutton.setBounds(200,0,100,40);
	searchbutton.addActionListener(this);
	updatebutton.setBounds(300,0,100,40);
	updatebutton.addActionListener(this);
	
	buttonpnl.add(buybutton);
	buttonpnl.add(sellbutton);
	buttonpnl.add(searchbutton);
	buttonpnl.add(updatebutton);
	//creating logo panel
	logopnl.setBounds(0,226 ,395,144);
	//logopnl.setBorder(BorderFactory.createLineBorder(Color.BLUE,3));
	//logolbl.setIcon(new ImageIcon("imagy\\moto.png"));
    Font f  = new Font("Arial",Font.BOLD,26);
    logolbl.setFont(f);
    logolbl.setText("WHEN IN DOUBT, RIDE IT OUT");
	logolbl.setSize(395,190);
    logolbl.setBackground(Color.WHITE);
    logopnl.add(logolbl);
    //editing buy panel
	
   	buypnl.setBounds(0,226 ,395,144);
   	//GridBagLayout mgr =new GridBagLayout();
   	buypnl.setLayout(null);
    //buypnl.setBorder(BorderFactory.createLineBorder(Color.RED,5));
    
    bunamelbl.setBounds(20, 10, 80,20);
  	bumfglbl.setBounds(20,30 , 80, 20);
	buratinglbl.setBounds(20,60 , 80, 20);
	bupricelbl.setBounds(20,90,80,20);
	
	butxtname.setBounds(100, 10, 80,20);
	butxtname.addActionListener(this);
	butxtmfg.setBounds(100, 35, 80,20);
	butxtmfg.addActionListener(this);
	butxtrating.setBounds(100, 60, 80,20);
	butxtrating.addActionListener(this);
	butxtprice.setBounds(100, 90, 80,20);	
	butxtprice.addActionListener(this);
	
	//adding navigation buttons
	prevbtn.setBounds(250,10,50,50);
	prevbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
						
			if(e.getSource()==prevbtn){
			f4.prev();
			}
			
			
		}
	});
	nextbtn.setBounds(310,10,50,50);
	nextbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
        			
			if(e.getSource()==nextbtn){
			f4.next();
			}
		}
			
		}
	);
		
		
	firstbtn.setBounds(250,70,50,50);
	firstbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==firstbtn){
			f4.first();
			}
			
		}
	});
	lastbtn.setBounds(310,70,50,50);
	lastbtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==lastbtn){
			f4.last();
			}
		}
	});
	
	
	
	
	
	
	
	//adding components to the buy panel
	buypnl.add(firstbtn);
	buypnl.add(lastbtn);
	buypnl.add(nextbtn);
	buypnl.add(prevbtn);
	buypnl.add(bunamelbl);
	buypnl.add(butxtname);
	buypnl.add(bumfglbl);
	buypnl.add(butxtmfg);
	buypnl.add(buratinglbl);
	buypnl.add(butxtrating);
	buypnl.add(bupricelbl);
	buypnl.add(butxtprice);
	
	
	//building sellpanel
 	sellpnl.setBounds(0,226 ,395,144);
	sellpnl.setLayout(null);
	 
	senamelbl.setBounds(20, 10, 80,20);
	 semfglbl.setBounds(20,30 , 80, 20);
	 seratinglbl.setBounds(20,60 , 80, 20);
	 sepricelbl.setBounds(20,90,80,20);
	
	setxtname.setBounds(100, 10, 80,20);
	setxtname.addActionListener(this);
	setxtmfg.setBounds(100, 35, 80,20);
	setxtmfg.addActionListener(this);
	setxtrating.setBounds(100, 60, 80,20);
	setxtrating.addActionListener(this);
	setxtprice.setBounds(100, 90, 80,20);	
	setxtprice.addActionListener(this);
	
	sellpnl.add(senamelbl);
	sellpnl.add(setxtname);
	sellpnl.add( semfglbl);
	sellpnl.add(setxtmfg);
	sellpnl.add( seratinglbl);
	sellpnl.add(setxtrating);
	sellpnl.add(sepricelbl);
	sellpnl.add(setxtprice);
	
	//selling instructions
	Font f1  = new Font("Arial",Font.BOLD,12);
    selllbl.setFont(f1);
    selllbl.setText("---ENTER BIKE DETAILS---");
	selllbl.setBounds(220,10,150,40);
    selllbl.setBackground(Color.WHITE);
    
    //adding enter button to sell panel--
    	enterbtn.setBounds(250, 70, 100, 50);
    	enterbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==enterbtn){
					//main function starts here
					Function f1 = new Function();
					ResultSet rs = null;
					
				f1.insert(setxtname.getText(),setxtmfg.getText(),setxtmfg.getText(),setxtmfg.getText());					
				}
				
			}
				
			
		});
    sellpnl.add(enterbtn);
	sellpnl.add(selllbl);
	
	
	//creating search panel
	searchpnl.setBounds(0,226 ,395,144);
	searchpnl.setLayout(null);
	
	 srnamelbl.setBounds(20, 10, 80,20);
	 srmfglbl.setBounds(20,30 , 80, 20);
	 srratinglbl.setBounds(20,60 , 80, 20);
	 srpricelbl.setBounds(20,90,80,20);
	
	srtxtname.setBounds(100, 10, 80,20);
	srtxtname.addActionListener(this);
	srtxtmfg.setBounds(100, 35, 80,20);
	srtxtmfg.addActionListener(this);
	srtxtrating.setBounds(100, 60, 80,20);
	srtxtrating.addActionListener(this);
	srtxtprice.setBounds(100, 90, 80,20);	
	srtxtprice.addActionListener(this);
	
	searchpnl.add(srnamelbl);
	searchpnl.add(srtxtname);
	searchpnl.add( srmfglbl);
	searchpnl.add(srtxtmfg);
	searchpnl.add( srratinglbl);
	searchpnl.add(srtxtrating);
	searchpnl.add(srpricelbl);
	searchpnl.add(srtxtprice);
	
	//searching instructions
	Font f2  = new Font("Arial",Font.BOLD,13);
	searchlbl.setFont(f2);
	searchlbl.setText("---ENTER BIKE NAME---");
	searchlbl.setBounds(220,10,150,40);
	searchlbl.setBackground(Color.WHITE);
    
    //adding search button to search panel--
    	searchbtn.setBounds(250, 70, 100, 50);
    	searchbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(e.getSource()==searchbtn){
					//main function starts here
					Function f = new Function();
					ResultSet rs = null;
					
					rs=f.find(srtxtname.getText());
					try{
					if(rs.next()){
						String name = Integer.toString(rs.getInt(2));
						String mfg = Integer.toString(rs.getInt(3));
						String price = Integer.toString(rs.getInt(4));
						srtxtmfg.setText(name);
						srtxtrating.setText(mfg);
						srtxtprice.setText(price);
					}
					else{
						JOptionPane.showMessageDialog(mainframe, "Record not found");
					}
					}
					catch(Exception ex){
						JOptionPane.showMessageDialog(null,ex.getMessage());
					}
							
				}
				
			}
		});
    	
    searchpnl.add(searchbtn);
	searchpnl.add(searchlbl);
	
	//creating update panel
	updatepnl.setBounds(0,226 ,395,144);
	updatepnl.setLayout(null);
	uptxtname.setBounds(100, 10, 80,20);
	
	 upnamelbl.setBounds(20, 10, 80,20);
	  	upmfglbl.setBounds(20,30 , 80, 20);
		upratinglbl.setBounds(20,60 , 80, 20);
		uppricelbl.setBounds(20,90,80,20);
	
	uptxtname.addActionListener(this);
	uptxtmfg.setBounds(100, 35, 80,20);
	uptxtmfg.addActionListener(this);
	uptxtrating.setBounds(100, 60, 80,20);
	uptxtrating.addActionListener(this);
	uptxtprice.setBounds(100, 90, 80,20);	
	uptxtprice.addActionListener(this);
	
	updatepnl.add(upnamelbl);
	updatepnl.add(uptxtname);
	updatepnl.add( upmfglbl);
	updatepnl.add(uptxtmfg);
	updatepnl.add( upratinglbl);
	updatepnl.add(uptxtrating);
	updatepnl.add(uppricelbl);
	updatepnl.add(uptxtprice);
	
	//updating instructions
	Font f3  = new Font("Arial",Font.BOLD,10);
	updatelbl.setFont(f3);
	updatelbl.setText("GIVE DETAILS TO UPDATE");
	updatelbl.setBounds(230,10,150,40);
	updatelbl.setBackground(Color.WHITE);
    
    //adding update button to UPDATE panel--
	updatebtn.setBounds(250, 70, 100, 50);
	updatebtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==updatebtn){
				//main function starts here
				Function f2 = new Function();
				ResultSet rs = null;
				
			f2.update(uptxtname.getText(),uptxtmfg.getText(),uptxtmfg.getText(),uptxtmfg.getText());					
			}
			
		}
	});
	updatepnl.add(updatebtn);
	updatepnl.add(updatelbl);
	
///adding update panel
	mainframe.add(updatepnl);
	//adding searchpanel to the main frame
	mainframe.add(searchpnl);
	//adding sellpanel to the main frame
	mainframe.add(sellpnl); 
   //adding buy panel to main frame
   mainframe.add(buypnl);
   
     
    //adding components to the main frame 
   
	mainframe.add(logopnl);
	mainframe.add(buttonpnl);
	mainframe.add(posterpnl);
	logopnl.setVisible(true);
	buttonpnl.setVisible(true);
	posterpnl.setVisible(true);
	
	 buypnl.setVisible(false);
	sellpnl.setVisible(false);
	searchpnl.setVisible(false);
	updatepnl.setVisible(false);
	
	mainframe.setVisible(true);
	mainframe.validate();
}
	
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==buybutton){
		logopnl.setVisible(false);
		sellpnl.setVisible(false);
		searchpnl.setVisible(false);
		updatepnl.setVisible(false);
		buypnl.setVisible(true);
	}
	else if(e.getSource()==sellbutton){
		logopnl.setVisible(false);
		searchpnl.setVisible(false);
		updatepnl.setVisible(false);
		buypnl.setVisible(false);
		sellpnl.setVisible(true);
		
	}
	else if(e.getSource()==searchbutton){
		logopnl.setVisible(false);
		updatepnl.setVisible(false);
		buypnl.setVisible(false);
		sellpnl.setVisible(false);
		searchpnl.setVisible(true);
	
		
		
	}		
	else if(e.getSource()==updatebutton){
		logopnl.setVisible(false);
		buypnl.setVisible(false);
		sellpnl.setVisible(false);
		searchpnl.setVisible(false);
		updatepnl.setVisible(true);
		
	}
	
}



	
	


//creatin class to perform jdbc operations
public class Function{
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	
	public ResultSet find(String s){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","1234");
		ps=con.prepareStatement("select * from bikeportal where bname = ?");
		ps.setString(1, s);
		rs=ps.executeQuery();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block

	}
			
		return rs;
	}
	
	
	public void insert(String s1,String s2, String s3,String s4){
	
		String name = setxtname.getText();;
		int mfg =Integer.parseInt(setxtmfg.getText());
		int rating =Integer.parseInt(setxtrating.getText());
		int price =Integer.parseInt(setxtprice.getText());
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","1234");
		Statement st=con.createStatement();
		st.executeUpdate("INSERT INTO bikeportal values ('"+name+"',"+mfg+","+rating+","+price+");"); 		
		
		JOptionPane.showMessageDialog(mainframe, "Record got inserted!!");
	
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null," something went wrong");
		e.printStackTrace();
	}
			
		
	}
	public void update(String s1,String s2, String s3,String s4){
		
		String name = uptxtname.getText();;
		int mfg =Integer.parseInt(uptxtmfg.getText());
		int rating =Integer.parseInt(uptxtrating.getText());
		int price =Integer.parseInt(uptxtprice.getText());
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","1234");
		Statement st=con.createStatement();
		st.executeUpdate("update bikeportal set bmfg="+mfg+",brating ="+rating+",bprice ="+price+" where bname='"+name+"';"); 		
		JOptionPane.showMessageDialog(mainframe, "Record got updated!!");
	
	} catch (SQLException e) {
		JOptionPane.showMessageDialog(null," something went wrong");
		e.printStackTrace();
	}
			
		
	}
	
	public void last(){
			try {
				
				if(rs.last())
			{
				
				butxtname.setText(rs.getString(1));
				butxtmfg.setText(Integer.toString(rs.getInt(2)));
				butxtrating.setText(Integer.toString(rs.getInt(3)));
				butxtprice.setText(Integer.toString(rs.getInt(4)));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void next(){
			try{
				
				if(rs.next())
				{
					
					butxtname.setText(rs.getString(1));
					butxtmfg.setText(Integer.toString(rs.getInt(2)));
					butxtrating.setText(Integer.toString(rs.getInt(3)));
					butxtprice.setText(Integer.toString(rs.getInt(4)));
					
				}
				else {
					rs.previous();
					JOptionPane.showMessageDialog(mainframe, "You are at the last record");

				}
			} catch (Exception ex) {
				
				ex.printStackTrace();
			}
		
	}
	
	public void first(){
		     try{
		    	
		    	 if(rs.first())
			{
				
				butxtname.setText(rs.getString(1));
				butxtmfg.setText(Integer.toString(rs.getInt(2)));
				butxtrating.setText(Integer.toString(rs.getInt(3)));
				butxtprice.setText(Integer.toString(rs.getInt(4)));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void prev(){
		try{
			
			if(rs.previous())
			{
				
				butxtname.setText(rs.getString(1));
				butxtmfg.setText(Integer.toString(rs.getInt(2)));
				butxtrating.setText(Integer.toString(rs.getInt(3)));
				butxtprice.setText(Integer.toString(rs.getInt(4)));
				
			}
			else {
				rs.next();
				JOptionPane.showMessageDialog(mainframe, "You are at veryfirst record");

			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void dbcommon(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","1234");
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from bikeportal;");
			rs.next();
			}
			catch(Exception e){
			e.printStackTrace();
			
			}
	
	}

}

	
public static void main(String[] args) {
			Bikesportal b = new Bikesportal();
			
			
	}
	
}
