package com.friday;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {

    private String message;
    private String status;
    private Map<String, UserDetails[]> users = new HashMap<String, UserDetails[]>();

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Map<String, UserDetails[]> getUsers() {
        return users;
    }
    public void setUsers(Map<String, UserDetails[]> users) {
        this.users = users;
    }

    private static class UserDetails {
        private String time;
        private String age;
        private Map<String, String> props = new HashMap<String, String>();
        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }
        public String getAge() {
            return age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public Map<String, String> getProps() {
            return props;
        }
        public void setProps(Map<String, String> props) {
            this.props = props;
        }
    }
}
