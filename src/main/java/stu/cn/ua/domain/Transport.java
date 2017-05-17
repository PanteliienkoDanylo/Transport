package stu.cn.ua.domain;


import stu.cn.ua.domain.enumeration.TransportType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
    private TransportType type;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private String latitude;

    @JoinColumn(name = "route_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Route route;

    public Transport() {
    }

    public Transport(String number, TransportType type, Double longitude, String latitude) {
        this.number = number;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Transport(Long id, String number, TransportType type, Double longitude, String latitude) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.longitude = longitude;
        this.latitude = latitude;
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

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
