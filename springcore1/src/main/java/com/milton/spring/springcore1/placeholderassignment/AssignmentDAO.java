package com.milton.spring.springcore1.placeholderassignment;

public class AssignmentDAO {
    private String url;
    private String user;
    private String password;

    public AssignmentDAO(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "AssignmentDAO{" +
                "url='" + url + '\'' +
                ", userName='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
