package com.softplan.logvalue.service.dto;

import java.time.ZonedDateTime;
import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

/**
 * A DTO for the Estimate entity.
 */
public class EstimateDTO implements Serializable {

    private Long id;

    private Integer pavedHighwayAmount;

    private Integer nonPavedHighwayAmount;

    private Integer loadAmount;

    private Boolean containsToll;

    private Float tollValue;

    private ZonedDateTime createdAt;

    private Long roadTypeId;

    private Long vehicleTypeId;

    private Long ownerId;

    private String ownerName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPavedHighwayAmount() {
        return pavedHighwayAmount;
    }

    public void setPavedHighwayAmount(Integer pavedHighwayAmount) {
        this.pavedHighwayAmount = pavedHighwayAmount;
    }

    public Integer getNonPavedHighwayAmount() {
        return nonPavedHighwayAmount;
    }

    public void setNonPavedHighwayAmount(Integer nonPavedHighwayAmount) {
        this.nonPavedHighwayAmount = nonPavedHighwayAmount;
    }

    public Boolean isContainsToll() {
        return containsToll;
    }

    public void setContainsToll(Boolean containsToll) {
        this.containsToll = containsToll;
    }

    public Float getTollValue() {
        return tollValue;
    }

    public void setTollValue(Float tollValue) {
        this.tollValue = tollValue;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getRoadTypeId() {
        return roadTypeId;
    }

    public void setRoadTypeId(Long roadTypeId) {
        this.roadTypeId = roadTypeId;
    }

    public Long getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(Long vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    /**
     * @return the loadAmount
     */
    public Integer getLoadAmount() {
        return loadAmount;
    }

    /**
     * @param loadAmount the loadAmount to set
     */
    public void setLoadAmount(Integer loadAmount) {
        this.loadAmount = loadAmount;
    }
    
    /**
     * @return the ownerId
     */
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId the ownerId to set
     */
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EstimateDTO estimateDTO = (EstimateDTO) o;
        if (estimateDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), estimateDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EstimateDTO{" +
            "id=" + getId() +
            ", pavedHighwayAmount=" + getPavedHighwayAmount() +
            ", nonPavedHighwayAmount=" + getNonPavedHighwayAmount() +
            ", containsToll='" + isContainsToll() + "'" +
            ", tollValue=" + getTollValue() +
            ", createdAt='" + getCreatedAt() + "'" +
            ", roadType=" + getRoadTypeId() +
            ", vehicleType=" + getVehicleTypeId() +
            "}";
    }
}