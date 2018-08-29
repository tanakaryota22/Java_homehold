package Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dto.Dto;

public class Dao{

    public static Dto Search(int idkey){

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

		Dto Dto = new Dto();

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/household?useSSL=false",
					"root",
					"ryota22153");

            String sql =  "select id,name,price,day from kakeibo  where id = (?);";



        	pstmt = con.prepareStatement(sql);

			pstmt.setInt(1,idkey);

			rs = pstmt.executeQuery();


			while(rs.next() == true ){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            int day = rs.getInt("day");

            Dto = new Dto(id,name,price,day);
			}
        } catch (ClassNotFoundException e) {
            System.out.println("JDBCドライバが見つかりません。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DBアクセス時にエラーが発生しました。");
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("DBアクセス時にエラーが発生しました。");
                e.printStackTrace();
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                System.out.println("DBアクセス時にエラーが発生しました。");
                e.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("DBアクセス時にエラーが発生しました。");
                e.printStackTrace();
            }
        }
        return Dto;
    }

    public static void Add(Dto d ){


        Connection con = null;
        PreparedStatement pstmt = null;

        ResultSet rs = null;

		Dto Dto = new Dto();

        try{

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/household?useSSL=false",
					"root",
					"ryota22153");

            String sql = "insert into kakeibo values(?,?,?,?);";

            pstmt = con.prepareStatement(sql);

            int id = d.getId();
            String name = d.getName();
            int price = d.getPrice();
            int day = d.getDay();



            pstmt.setInt(1, id);
            pstmt.setString(2,name);
            pstmt.setInt(3,price);
            pstmt.setInt(4,day);

            pstmt.executeUpdate();

        } catch (SQLException e){
            System.out.println("DBアクセスに失敗しました。");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("DBアクセスに失敗しました。");
            e.printStackTrace();
        }
            try{
                if(pstmt != null){
                    pstmt.close();
                }
            } catch(SQLException e){
                System.out.println("DB切断時にエラーが発生しました。");
                e.printStackTrace();
            }
            try {
                if( pstmt != null){
                    pstmt.close();
                }
            } catch(SQLException e){
                System.out.println("DB切断時にエラーが発生しました。");
                e.printStackTrace();
            }
            try {
                if( con != null){
                    con.close();
                }
            } catch (SQLException e){
                System.out.println("DB切断時にエラーが発生しました。");
                e.printStackTrace();

            }
    }

    public static void Delete(int idkey){

        Connection con = null;
        PreparedStatement pstmt = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/household?useSSL=false",
					"root",
					"ryota22153");


        	String sql = "delete from kakeibo where id = (?)";

            pstmt = con.prepareStatement(sql);


        	pstmt.setInt(1,idkey);

            pstmt.executeUpdate();

        } catch (SQLException e){
            System.out.println("DBアクセスに失敗しました。");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try{
                if(pstmt != null){
                    pstmt.close();
                }
            } catch(SQLException e){
                System.out.println("DB切断時にエラーが発生しました。");
                e.printStackTrace();
            }
            try {
                if( pstmt != null){
                    pstmt.close();
                }
            } catch(SQLException e){
                System.out.println("DB切断時にエラーが発生しました。");
                e.printStackTrace();
            }
            try {
                if( con != null){
                    con.close();
                }

} catch (SQLException e){
                System.out.println("DB切断時にエラーが発生しました。");
                e.printStackTrace();
            }
        }
    }

	public static void Registration(int id, String name, int price, int day) {
		// TODO 自動生成されたメソッド・スタブ

	}





public static ArrayList<Dto> SearchAll(){
	//変数の初期化
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	ArrayList<Dto> Dto = new ArrayList<Dto>();

	try{
		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/household?useSSL=false",
				"root",
				"ryota22153");

		String sql = "select id,name,price,day from kakeibo;";

		pstmt = con.prepareStatement(sql);

		rs = pstmt.executeQuery();

		while(rs.next() == true ){
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int price = rs.getInt("price");
			int day = rs.getInt("day");

			Dto.add(new Dto(id,name,price,day));

		}
	}catch (SQLException e){
		System.out.println("DBアクセスに失敗しました。");
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		System.out.println("jdbcが見つかりません。");
		e.printStackTrace();
	} finally {
		try {
			if( pstmt != null){
				pstmt.close();
			}
		} catch(SQLException e){
			System.out.println("DB切断時にエラーが発生しました。");
			e.printStackTrace();
		}

		try {
			if( con != null){
				con.close();
			}
		} catch (SQLException e){
			System.out.println("DB切断時にエラーが発生しました。");
			e.printStackTrace();
		}
	}
	return Dto;
}
}

