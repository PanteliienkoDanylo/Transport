package stu.cn.ua.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @NotNull
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    
    @ManyToMany(mappedBy = "routes", fetch = FetchType.LAZY)
    private List<Station> stations;

    @OneToMany(mappedBy = "route", cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    private List<Transport> transports;


    public Route() {
    }

    public Route(Long id, String name, Date startTime, Date endTime) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Route(String name, Date startTime, Date endTime, List<Station> stations, List<Transport> transports) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stations = stations;
        this.transports = transports;
    }

    public Route(Long id, String name, Date startTime, Date endTime, List<Station> stations, List<Transport> transports) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stations = stations;
        this.transports = transports;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }
}
