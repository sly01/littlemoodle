/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatih.edu.tr;

import java.sql.Connection;
import java.sql.Date;
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
                Task t = new Task(rs.getInt("id"), rs.getString("title"), rs.getString("description"), rs.getDate("date"), rs.getDate("due_date"), rs.getString("file_name"), rs.getString("file_path"), rs.getInt("user_id"));
                tasks.add(t);
            }

        } catch (Exception e) {
            System.out.println("Error while fetching all tasks");
        }

        return tasks;
    }

        public void addTask(String title, String description, Date due_date, String file_name, String file_path, int user_id) {
             Connection conn = ConnectionManager.getConnection();
             DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             Calendar cal = Calendar.getInstance();
             String query = "insert into announcements(title, description, date, due_date, file_name, file_path, user_id) values("+title+","+description+","+dateFormat.format(cal.getTime())+","+due_date+","+file_name+","+file_path+","+user_id+")";
             
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(TaskDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error while adding task");
        }
             
        }
}
