package com.gwtplatform.carstore.shared.dto;

import java.util.ArrayList;
import java.util.List;

import com.gwtplatform.carstore.shared.domain.BaseEntity;

public class ManufacturerDto extends BaseEntity {
    private String name;
    private List<CarDto> carDtos;

    public ManufacturerDto() {
        this.name = "";
        this.carDtos = new ArrayList<CarDto>();
    }

    public ManufacturerDto(String name) {
        this.name = name;
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

    public List<CarDto> getCars() {
        return carDtos;
    }

    public void setCars(List<CarDto> carDtos) {
        this.carDtos = carDtos;
    }
}
