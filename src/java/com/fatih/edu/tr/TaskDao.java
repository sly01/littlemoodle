/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatih.edu.tr;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author erkoc
 */
public class TaskDao {

    public ArrayList<Task> getAllTasks() {
        ArrayList<Task> tasks = new ArrayList<Task>();
        Connection conn = ConnectionManager.getConnection();

        String query = "select * from announcements";

        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Task t = new Task(rs.getInt("id"), rs.getString("title"), rs.getString("description"), rs.getString("date"), rs.getString("due_date"), rs.getString("file_name"), rs.getString("file_path"), rs.getInt("user_id"));
                tasks.add(t);
            }

        } catch (Exception e) {
            System.out.println("Error while fetching all tasks");
        }

        return tasks;
    }

        public void addTask(String title, String description, String due_date, String file_name, String file_path, int user_id) {
             Connection conn = ConnectionManager.getConnection();
             DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             //Calendar cal = Calendar.getInstance();
             Date date = new Date();
             //String query = "insert into announcements(title, description, due_date, file_name, file_path, user_id) values("+title+","+description+","+due_date+","+file_name+","+file_path+","+user_id+")";
             String query = "INSERT INTO announcements(title, description,date, due_date, file_name, file_path, user_id) VALUES(?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, title);
            pstmt.setString(2, description);
            pstmt.setString(3,dateFormat.format(date));
            pstmt.setString(4, due_date);
            pstmt.setString(5, file_name);
            pstmt.setString(6, file_path);
            pstmt.setInt(7, user_id);
            
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TaskDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error while adding task");
        }
             
        }
}
