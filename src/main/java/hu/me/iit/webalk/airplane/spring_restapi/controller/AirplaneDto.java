package hu.me.iit.webalk.airplane.spring_restapi.controller;

import hu.me.iit.webalk.airplane.spring_restapi.service.Airplane;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AirplaneDto {

    private Long id;
    @NotBlank
    private String manufacturer;
    @NotNull
    private String modelNumber;
    @NotBlank
    private String airline;
    @Min(1)
    private int capacity;

    public AirplaneDto() {
    }

    public AirplaneDto(Long id, String manufacturer, String modelNumber, String airline, int capacity) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.airline = airline;
        this.capacity = capacity;
    }

    public AirplaneDto(Airplane airplane){
        this.id = airplane.getId();
        this.manufacturer = airplane.getManufacturer();
        this.modelNumber = airplane.getModelNumber();
        this.airline = airplane.getAirline();
        this.capacity = airplane.getCapacity();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Airplane toAirplane(){
        return new Airplane(id, manufacturer, modelNumber, airline, capacity);
    }

}
