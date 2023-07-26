package model;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
   
   Connection conn = null;
   PreparedStatement psmt = null;
   ResultSet rs = null;
   int cnt = 0;
   String data = "";
   boolean check = false;
   UserDTO dto = null;
   
   // getCon : DB에 연결권한을 확인하는 메서드(기능)
      public void getCon() {
         try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
            String db_id = "campus_e_0718_3";
            String db_pw = "smhrd3";
            conn = DriverManager.getConnection(url, db_id, db_pw);

         } catch (ClassNotFoundException e) {
            System.out.println("connection 문제");
            e.printStackTrace();
         } catch (SQLException e) {
            System.out.println("db연결 문제");
            e.printStackTrace();
         }

      }

      // getClose
      public void getClose() {
         try {
            if (rs != null)
               rs.close();
            if (psmt != null)
               psmt.close();
            if (conn != null)
               conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   
   
   
   
   // User 참가자등록
      public int user(UserDTO dto) {
         getCon();
         String sql = "insert into SQ_user (mb_id ,name , backnum) values(?, ?, ?) ";
               
            try {
               psmt = conn.prepareStatement(sql);

               psmt.setString(1, dto.getMb_id());
               psmt.setString(2, dto.getName());
               psmt.setInt(3, dto.getBacknum());
               

               cnt = psmt.executeUpdate();
            } catch (SQLException e) {
               System.out.println("sql 문제");

               e.printStackTrace();
            } finally {
               getClose();
            }
            return cnt;
         }   
      
      // User 참가자 확인
      public  UserDTO selectOne(String id) {
         getCon();
         
         try {
            String sql = "SELECT * FROM SQ_user WHERE mb_id = ?";
            psmt = conn.prepareStatement(sql);

            psmt.setString(1, id);

            // select는 insert, update, delete와는 달리 DB에서 조회한 결과를 반환
            // ResultSet -> 커서객체
            rs = psmt.executeQuery();

            if (rs.next()) {
               String mb_id = rs.getString(1);
               String name = rs.getString(2);
               int backnum = rs.getInt(3);

               dto = new UserDTO(mb_id, name,backnum);

            } 
         } catch (SQLException e) {
            e.printStackTrace();
         } finally {
            // 자원을 반납
            getClose();
         }
         return dto;
      }
      
      
}