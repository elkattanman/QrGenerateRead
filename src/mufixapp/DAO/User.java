/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mufixapp.DAO;

/**
 *
 * @author Mustafa Khaled
 */
public class User {
    private String id;
    private String name;
    private String track;

    public User(String id, String name, String track) {
        this.id = id;
        this.name = name;
        this.track = track;
    }
    

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", track=" + track + '}';
    }
    
}
