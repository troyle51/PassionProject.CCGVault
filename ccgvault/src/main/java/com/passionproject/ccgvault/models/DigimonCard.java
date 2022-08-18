package com.passionproject.ccgvault.models;


import javax.persistence.*;


@Entity
@Table(name="digimon")
public class DigimonCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="type")
    private String type;
    @Column(name="color")
    private String color;
    @Column(name="stage")
    private String stage;
    @Column(name="digiType")
    private String digiType;
    @Column(name="attribute")
    private String attribute;
    @Column(name="level")
    private Integer level;
    @Column(name="playCost")
    private Integer playCost;
    @Column(name="evolutionCost")
    private Integer evolutionCost;
    @Column(name="cardrarity")
    private String cardrarity;
    @Column(name="artist")
    private String artist;
    @Column(name="dp")
    private Integer dp;
    @Column(name="cardnumber")
    private String cardnumber;
    @Column(name="maineffect")
    private String maineffect;
//    private Object soureeffect;
    @Column(name="setName")
    private String setName;
//    private List<String> cardSets = null;
    @Column(name="imageUrl")
    private String imageUrl;

    public DigimonCard() {
    }

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
