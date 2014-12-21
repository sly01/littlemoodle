/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatih.edu.tr;

import java.sql.Date;

/**
 *
 * @author erkoc
 */
public class Task {
    private int id;
    private String title;
    private String description;
    private Date date;
    private Date due_data;
    private String file_name;
    private String file_path;
    private int user_id;

    public Task() {
    }

    public Task(int id, String title, String description, Date date, Date due_data, String file_name, String file_path, int user_id) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.due_data = due_data;
        this.file_name = file_name;
        this.file_path = file_path;
        this.user_id = user_id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the due_data
     */
    public Date getDue_data() {
        return due_data;
    }

    /**
     * @param due_data the due_data to set
     */
    public void setDue_data(Date due_data) {
        this.due_data = due_data;
    }

    /**
     * @return the file_name
     */
    public String getFile_name() {
        return file_name;
    }

    /**
     * @param file_name the file_name to set
     */
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    /**
     * @return the file_path
     */
    public String getFile_path() {
        return file_path;
    }

    /**
     * @param file_path the file_path to set
     */
    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    /**
     * @return the user_id
     */
    public int getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    
    
        
}
