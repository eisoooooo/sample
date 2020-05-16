/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import 	java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Student 
{
    Connection con;
    public void insertDataToPlay( String fromdate,String todate,String psprice,int drinkprice,int totalprice) throws SQLException, Exception
    {
        con = MyConnection.getConnection();
			
        PreparedStatement ps;
        
        ps=con.prepareStatement("insert into play1(time_form,time_to,price,priced,totalprice)values(?,?,?,?,?)");
        ps.setString(1, fromdate);
        ps.setString(2, todate);
        ps.setString(3, psprice);
        ps.setInt(4, drinkprice);
        ps.setInt(5, totalprice);
        
        ps.executeUpdate();
        
  System.out.println("New recorded Added");
    }
    
     public void insertDataToPlay2( String fromdate,String todate,String psprice,int drinkprice,int totalprice) throws SQLException, Exception
    {
        con = MyConnection.getConnection();
			
        PreparedStatement ps;
        
        ps=con.prepareStatement("insert into play2(time_form,time_to,price,priced,totalprice)values(?,?,?,?,?)");
        ps.setString(1, fromdate);
        ps.setString(2, todate);
        ps.setString(3, psprice);
        ps.setInt(4, drinkprice);
        ps.setInt(5, totalprice);
        
        ps.executeUpdate();
        
  System.out.println("New recorded Added");
    }
      public void insertDataToPlay3( String fromdate,String todate,String psprice,int drinkprice,int totalprice) throws SQLException, Exception
    {
        con = MyConnection.getConnection();
			
        PreparedStatement ps;
        
        ps=con.prepareStatement("insert into play3(time_form,time_to,price,priced,totalprice)values(?,?,?,?,?)");
        ps.setString(1, fromdate);
        ps.setString(2, todate);
        ps.setString(3, psprice);
        ps.setInt(4, drinkprice);
        ps.setInt(5, totalprice);
       
        
        ps.executeUpdate();
        
  System.out.println("New recorded Added");
    }
        public void insertDataToPlay4( String fromdate,String todate,String psprice,int drinkprice,int totalprice) throws SQLException, Exception
    {
        con = MyConnection.getConnection();
			
        PreparedStatement ps;
        
        ps=con.prepareStatement("insert into play4(time_form,time_to,price,priced,totalprice)values(?,?,?,?,?)");
        ps.setString(1, fromdate);
        ps.setString(2, todate);
        ps.setString(3, psprice);
        ps.setInt(4, drinkprice);
        ps.setInt(5, totalprice);
        
        ps.executeUpdate();
        
  System.out.println("New recorded Added");
    }
          public void insertDataToPlay5( String fromdate,String todate,String psprice,int drinkprice,int totalprice) throws SQLException, Exception
    {
        con = MyConnection.getConnection();
			
        PreparedStatement ps;
        
        ps=con.prepareStatement("insert into play5(time_form,time_to,price,priced,totalprice)values(?,?,?,?,?)");
        ps.setString(1, fromdate);
        ps.setString(2, todate);
        ps.setString(3, psprice);
        ps.setInt(4, drinkprice);
        ps.setInt(5, totalprice);
        
        ps.executeUpdate();
        
  System.out.println("New recorded Added");
    }
            public void insertDataToPlay6( String fromdate,String todate,String psprice,int drinkprice,int totalprice) throws SQLException, Exception
    {
        con = MyConnection.getConnection();
			
        PreparedStatement ps;
        
        ps=con.prepareStatement("insert into play6(time_form,time_to,price,priced,totalprice)values(?,?,?,?,?)");
        ps.setString(1, fromdate);
        ps.setString(2, todate);
        ps.setString(3, psprice);
        ps.setInt(4, drinkprice);
        ps.setInt(5, totalprice);
        
        ps.executeUpdate();
        
  System.out.println("New recorded Added");
    }
                   public void insertDataToPlay7( String fromdate,String todate,String psprice,int drinkprice,int totalprice) throws SQLException, Exception
    {
        con = MyConnection.getConnection();
			
        PreparedStatement ps;
        
        ps=con.prepareStatement("insert into play7(time_form,time_to,price,priced,totalprice)values(?,?,?,?,?)");
        ps.setString(1, fromdate);
        ps.setString(2, todate);
        ps.setString(3, psprice);
        ps.setInt(4, drinkprice);
        ps.setInt(5, totalprice);
        
        ps.executeUpdate();
        
  System.out.println("New recorded Added");
    }
   public void truncateData() throws Exception
   {
       Statement st;
       
       ResultSet rs;
       
          con = MyConnection.getConnection();
          st=con.createStatement();
          st.executeQuery("truncate table play1");
         System.out.println("Successfully truncated play1");
         
          
   }
   public void truncateData2() throws Exception
   {
       Statement st;
       
       ResultSet rs;
       
          con = MyConnection.getConnection();
          st=con.createStatement();
          st.executeQuery("truncate table play2");
         System.out.println("Successfully truncated play2");    
   }
    public void truncateData3() throws Exception
   {
       Statement st;
       
       ResultSet rs;
       
          con = MyConnection.getConnection();
          st=con.createStatement();
          st.executeQuery("truncate table play3");
         System.out.println("Successfully truncated play3");    
   }
     public void truncateData4() throws Exception
   {
       Statement st;
       
       ResultSet rs;
       
          con = MyConnection.getConnection();
          st=con.createStatement();
          st.executeQuery("truncate table play4");
         System.out.println("Successfully truncated play4");    
   }
       public void truncateData5() throws Exception
   {
       Statement st;
       
       ResultSet rs;
       
          con = MyConnection.getConnection();
          st=con.createStatement();
          st.executeQuery("truncate table play5");
         System.out.println("Successfully truncated play5");    
   }
         public void truncateData6() throws Exception
   {
       Statement st;
       
       ResultSet rs;
       
          con = MyConnection.getConnection();
          st=con.createStatement();
          st.executeQuery("truncate table play6");
         System.out.println("Successfully truncated play6");    
   }
          public void truncateData7() throws Exception
   {
       Statement st;
       
       ResultSet rs;
       
          con = MyConnection.getConnection();
          st=con.createStatement();
          st.executeQuery("truncate table play7");
         System.out.println("Successfully truncated play7");    
   }
   public void fillStudentTable(JTable table) throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select * from play1");
       DefaultTableModel model=(DefaultTableModel)table.getModel();
       Object[]row;
    while (rs.next())
        {        
            row = new Object[6];
             row[0] =rs.getInt("id");
            row[1] =rs.getString("time_form");
            row[2] =rs.getString("time_to");
            row[3] =rs.getString("price");
            row[4] =rs.getInt("priced");
            row[5]=rs.getInt("totalprice");
            model.addRow(row);
        }
   }
  
   public void fillStudentTable2(JTable table) throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select * from play2");
       DefaultTableModel model=(DefaultTableModel)table.getModel();
       Object[]row;
    while (rs.next())
        {        
             row = new Object[6];
             row[0] =rs.getInt("id");
            row[1] =rs.getString("time_form");
            row[2] =rs.getString("time_to");
            row[3] =rs.getString("price");
            row[4] =rs.getInt("priced");
            row[5]=rs.getInt("totalprice");
            model.addRow(row);
        }
   }
   public void fillStudentTable3(JTable table) throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select * from play3");
       DefaultTableModel model=(DefaultTableModel)table.getModel();
       Object[]row;
    while (rs.next())
        {        
            row = new Object[6];
             row[0] =rs.getInt("id");
            row[1] =rs.getString("time_form");
            row[2] =rs.getString("time_to");
            row[3] =rs.getString("price");
            row[4] =rs.getInt("priced");
            row[5]=rs.getInt("totalprice");
            model.addRow(row);
        }
   }
   public void fillStudentTable4(JTable table) throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select * from play4");
       DefaultTableModel model=(DefaultTableModel)table.getModel();
       Object[]row;
    while (rs.next())
        {        
            row = new Object[6];
            row[0] =rs.getInt("id");
            row[1] =rs.getString("time_form");
            row[2] =rs.getString("time_to");
            row[3] =rs.getString("price");
            row[4] =rs.getInt("priced");
            row[5]=rs.getInt("totalprice");
            model.addRow(row);
        }
   }
   public void fillStudentTable5(JTable table) throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select * from play5");
       DefaultTableModel model=(DefaultTableModel)table.getModel();
       Object[]row;
    while (rs.next())
        {        
            row = new Object[6];
            row[0] =rs.getInt("id");
            row[1] =rs.getString("time_form");
            row[2] =rs.getString("time_to");
            row[3] =rs.getString("price");
            row[4] =rs.getInt("priced");
            row[5]=rs.getInt("totalprice");
            model.addRow(row);
        }
   }
    public void fillStudentTable6(JTable table) throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select * from play6");
       DefaultTableModel model=(DefaultTableModel)table.getModel();
       Object[]row;
    while (rs.next())
        {        
            row = new Object[6];
            row[0] =rs.getInt("id");
            row[1] =rs.getString("time_form");
            row[2] =rs.getString("time_to");
            row[3] =rs.getString("price");
            row[4] =rs.getInt("priced");
            row[5]=rs.getInt("totalprice");
            model.addRow(row);
        }
   }
    public void fillStudentTable7(JTable table) throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select * from play7");
       DefaultTableModel model=(DefaultTableModel)table.getModel();
       Object[]row;
    while (rs.next())
        {        
            row = new Object[6];
            row[0] =rs.getInt("id");
            row[1] =rs.getString("time_form");
            row[2] =rs.getString("time_to");
            row[3] =rs.getString("price");
            row[4] =rs.getInt("priced");
            row[5]=rs.getInt("totalprice");
            model.addRow(row);
        }
   }
   public void CalculateTotalSum() throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play1");
        while(rs.next())
       {
           String foo = rs.getString(1);
           JOptionPane.showMessageDialog(null,"total money of Device one is"+ rs.getString(1)+"L.E");  
          PlayStationOne.printtotal.setText(foo+"L.E");
        //   PlayStationOne.printtotal.
           
     //   play.totals.setText(foo); 
        System.out.println("added right");
       }

   }
   public void CalculateTotalSum2() throws Exception
   {
        con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play2");
        while(rs.next())
       {
           String foo = rs.getString(1);
           JOptionPane.showMessageDialog(null, "total money of Device Two is "+rs.getString(1)+ "L.E");  
           PlayStationTwo.printtotal2.setText(foo+"L.E");
     //   play.totals.setText(foo); 
        System.out.println("added right");
       }

   }
   public void CalculateTotalSum3() throws Exception
   {
      con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play3");
        while(rs.next())
       {
           String foo = rs.getString(1);
           JOptionPane.showMessageDialog(null,"total money of Device Three is "+ rs.getString(1)+ "L.E"); 
           PlayStationThree.printtotal3.setText(foo+"L.E");
     //   play.totals.setText(foo); 
        System.out.println("added right");
       }

   }
     public void CalculateTotalSum4() throws Exception
   {
        con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play4");
        while(rs.next())
       {
           String foo = rs.getString(1);
           JOptionPane.showMessageDialog(null,"total money of Device Four is "+ rs.getString(1)+ "L.E");   
           PlayStationFour.printtotal4.setText(foo+"L.E");
           PlayStationFour.printtotal4.setVisible(true);
     //   play.totals.setText(foo); 
        System.out.println("added right");
       }

   }
       public void CalculateTotalSum5() throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play5");
        while(rs.next())
       {
           String foo = rs.getString(1);
           JOptionPane.showMessageDialog(null, "total money of Device Five is "+rs.getString(1)+ "L.E");     
           PlayStationFive.printtotal5.setText(foo+"L.E");
     //   play.totals.setText(foo); 
        System.out.println("added right");
       }

   }
           public void CalculateTotalSum6() throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play6");
        while(rs.next())
       {
           String foo = rs.getString(1);
           JOptionPane.showMessageDialog(null,"total money of Device Sex is "+ rs.getString(1)+ "L.E"); 
           PlayStationSex.printtoal6.setText(foo+"L.E");
     //   play.totals.setText(foo); 
        System.out.println("added right");
       }

   }
            public void CalculateTotalSum7() throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
       ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play7");
        while(rs.next())
       {
           String foo = rs.getString(1);
           JOptionPane.showMessageDialog(null,"total money of Device Seven is "+ rs.getString(1)+ "L.E");  
           PlayStationVip.printtotal7.setText(foo+"L.E");
     //   play.totals.setText(foo); 
        System.out.println("added right");
       }

   }
     public void CalculateTotalSumForAllDevice() throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
     //ResultSet  rs=st.executeQuery("select sum(totalprice) as total from play1 union  select sum(totalprice) as total2 from play2 union  select sum(totalprice) as tota3 from play3 union  select sum(totalprice) as tota4 from play4 union  select sum(totalprice) as tota5 from play5 union  select sum(totalprice) as tota6 from play6 union select sum(totalprice) as tota7 from play7");     
  //  ResultSet  rs=st.executeQuery("select( sum(play1.totalprice)+sum(play2.totalprice)+sum(play3.totalprice)+sum(play4.totalprice)+sum(play5.totalprice)+sum(play6.totalprice)+sum(play7.totalprice)) as totalprice from play1,play2,play3,play4,play5,play6,play7");
// ResultSet  rs=st.executeQuery("select( sum(play1.totalprice) +sum(play2.totalprice) +sum(play3.totalprice)+sum(play4.totalprice) +sum(play5.totalprice) +sum(play6.totalprice) +sum(play7.totalprice)) from play1,play2,play3,play4,play5,play6,play7");
 //ResultSet  rs=st.executeQuery("select sum(play1.totalprice) +sum(play2.totalprice) +sum(play3.totalprice)+sum(play4.totalprice) +sum(play5.totalprice) +sum(play6.totalprice) +sum(play7.totalprice) from play1,play2,play3,play4,play5,play6,play7");
  ResultSet  rs=st.executeQuery("select sum(totalprice) totalprice\n" +
"from\n" +
"(\n" +
"select sum(totalprice) totalprice from play1\n" +
"union all\n" +
"select sum(totalprice) totalprice from play2\n" +
"union all\n" +
"select sum(totalprice) totalprice from play3\n" +
"union all\n" +
"select sum(totalprice) totalprice from play4\n" +
"union all\n" +
"select sum(totalprice) totalprice from play5\n" +
"union all\n" +
"select sum(totalprice) totalprice from play6\n" +
"union all\n" +
"select sum(totalprice) totalprice from play7\n" +
") s ;");
        while(rs.next())
       {
           String foo = rs.getString(1);
           MainForm.summ.setText(foo+"L.E");
        //   play.totals.setText(foo); 
       // System.out.println("added right");
        
       }

   }
  public void CalculateTotalSumForAllDevice2() throws Exception
   {
       con = MyConnection.getConnection();
       Statement st=con.createStatement();
  ResultSet  rs=st.executeQuery("select sum(sum(play1.totalprice) as totalprice1  union sum(play2.totalprice) as totalprice2 union sum(play3.totalprice) as totalprice3 union sum(play4.totalprice) as totalprice4 union sum(play5.totalprice) as totalprice5 union sum(play6.totalprice) as totalprice6 union sum(play7.totalprice) as  totalprice7) from play1,play2,play3,play4,play5,play6,play7");
 //ResultSet  rs=st.executeQuery("select sum(totalprice) from (select sum(totalprice) as totalprice1 from play1 union select sum(totalprice) as totalprice2 from play2 union select sum(totalprice) as totalprice3 from play3 union select sum(totalprice) as totalprice4 from play4 union select sum(totalprice) as totalprice5 from play5 union select sum(totalprice) as totalprice6 from play6 union select sum(totalprice) as totalprice7 from play7) as totalprice8");
   //  ResultSet  rs=st.executeQuery("select sum(sum(totalprice) as totalprice1 from play1 union select sum(totalprice) as totalprice2 from play2 union select sum(totalprice) as totalprice3 from play3 union select sum(totalprice) as totalprice4 from play4 union select sum(totalprice) as totalprice5 from play5 union select sum(totalprice) as totalprice6 from play6 union select sum(totalprice) as totalprice7 from play7))");    
        while (rs.next()) 
        {           
        String foo = rs.getString(1);
        MainForm.summ.setText(foo+"L.E");
       }
             
                     
        
       //int sum =Integer.parseInt(PlayStationOne.printtotal.getText())+Integer.parseInt(PlayStationTwo.printtotal2.getText())+Integer.parseInt(PlayStationThree.printtotal3.getText())+Integer.parseInt(PlayStationFour.printtotal4.getText())+Integer.parseInt(PlayStationFour.printtotal4.getText())+Integer.parseInt(PlayStationFive.printtotal5.getText())+Integer.parseInt(PlayStationSex.printtoal6.getText())+Integer.parseInt(PlayStationVip.printtotal7.getText());  
       //MainForm.summ.setText(PlayStationOne.printtotal.getText()+PlayStationTwo.printtotal2.getText()+PlayStationThree.printtotal3.getText()+PlayStationFour.printtotal4.getText()+PlayStationFive.printtotal5.getText()+PlayStationSex.printtoal6.getText()+PlayStationVip.printtotal7.getText());
   
}
}
     
