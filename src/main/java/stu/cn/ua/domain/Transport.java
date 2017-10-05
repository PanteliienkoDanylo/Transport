package stu.cn.ua.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "transport")
public class Transport {

    @Id
    @NotNull
    private Long id;

    @NotNull
    @Column(name = "number")
    private String number;

    @NotNull
    @Column(name = "type")
    private Integer type;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    @JsonIgnore
    @JoinColumn(name = "route_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Route route;

    public Transport() {
    }

    public Transport(String number, Integer type, Double longitude, Double latitude) {
        this.number = number;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Transport(Long id, String number, Integer type, Double longitude, Double latitude) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Transport(Long id, String number, Integer type, Double longitude, Double latitude, Route route) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
        this.route = route;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
