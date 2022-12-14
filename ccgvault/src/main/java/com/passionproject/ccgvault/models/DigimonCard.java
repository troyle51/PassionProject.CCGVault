package com.passionproject.ccgvault.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table(name="digimon")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DigimonCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @JsonProperty("id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="type")
    private String type;
    @Column(name="color")
    private String color;
    @Column(name="stage")
    private String stage;
    @Column(name="digi_Type")
    private String digiType;
    @Column(name="attribute")
    private String attribute;
    @Column(name="level")
    private Integer level;
    @Column(name="play_Cost")
    private Integer playCost;
    @Column(name="evolution_Cost")
    private Integer evolutionCost;
    @Column(name="cardrarity")
    private String cardrarity;
    @Column(name="artist")
    private String artist;
    @Column(name="dp")
    private Integer dp;
    @Column(name="cardnumber")
    private String cardnumber;
    @Column(name="maineffect", length = (10000))
    private String maineffect;
    @Column(name="set_Name")
    private String setName;
    @Column(name="image_Url", length = (10000))
    private String imageUrl;

    public DigimonCard() {
    }

    public DigimonCard(Long id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDigiType() {
        return digiType;
    }

    public void setDigiType(String digiType) {
        this.digiType = digiType;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPlayCost() {
        return playCost;
    }

    public void setPlayCost(Integer playCost) {
        this.playCost = playCost;
    }

    public Integer getEvolutionCost() {
        return evolutionCost;
    }

    public void setEvolutionCost(Integer evolutionCost) {
        this.evolutionCost = evolutionCost;
    }

    public String getCardrarity() {
        return cardrarity;
    }

    public void setCardrarity(String cardrarity) {
        this.cardrarity = cardrarity;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getDp() {
        return dp;
    }

    public void setDp(Integer dp) {
        this.dp = dp;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getMaineffect() {
        return maineffect;
    }

    public void setMaineffect(String maineffect) {
        this.maineffect = maineffect;
    }


    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



}
