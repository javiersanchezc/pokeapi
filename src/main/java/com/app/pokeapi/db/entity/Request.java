package com.app.pokeapi.db.entity;




import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class Request {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String ipOrigin;
    @Column
    private Timestamp time;
    @Column
    private String method;

    public Request() {
    }

    public Request(Long id, String ipOrigin, Timestamp time, String method) {
        this.id = id;
        this.ipOrigin = ipOrigin;
        this.time = time;
        this.method = method;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpOrigin() {
        return ipOrigin;
    }

    public void setIpOrigin(String ipOrigin) {
        this.ipOrigin = ipOrigin;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", ipOrigin='" + ipOrigin + '\'' +
                ", time=" + time +
                ", method='" + method + '\'' +
                '}';
    }

}
