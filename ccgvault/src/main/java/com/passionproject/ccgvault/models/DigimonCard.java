package com.passionproject.ccgvault.models;

import javax.persistence.*;

@Entity
@Table(name="digimon")
public class DigimonCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    private String name;
    private String type;
    private String color;
    private String stage;
    private String digiType;
    private String attribute;
    private Integer level;
    private Integer playCost;
    private Integer evolutionCost;
    private String cardrarity;
    private String artist;
    private Integer dp;
    private String cardnumber;
    private String maineffect;
//    private Object soureeffect;
    private String setName;
//    private List<String> cardSets = null;
    private String imageUrl;

    public DigimonCard(Long id) {
        this.id = id;
    }
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


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

//    public Object getSoureeffect() {
//        return soureeffect;
//    }
//
//    public void setSoureeffect(Object soureeffect) {
//        this.soureeffect = soureeffect;
//    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

//    public List<String> getCardSets() {
//        return cardSets;
//    }
//
//    public void setCardSets(List<String> cardSets) {
//        this.cardSets = cardSets;
//    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}
