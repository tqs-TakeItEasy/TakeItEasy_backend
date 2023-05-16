package tie.backend.model;

import jakarta.persistence.GeneratedValue;

public class Delivery {
    @GeneratedValue
    private Long id;
    private String storeName;
    private String userName;
    private String userEmail;
    private Long packageId;
    private PickupPoint pickupPoint;
    private DeliveryStatus status;
    private String registeryDate;
    private String deliveryDate;
    private String pickupDate;

    public Delivery(){}

    public Delivery(String storeName, String userName, String userEmail, Long packageId, PickupPoint pickupPoint, DeliveryStatus status, String registeryDate) {
        this.storeName = storeName;
        this.userName = userName;
        this.userEmail = userEmail;
        this.packageId = packageId;
        this.pickupPoint = pickupPoint;
        this.status = status;
        this.registeryDate = registeryDate;
        this.deliveryDate = null;
        this.pickupDate = null;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }
    public Long getId() {
        return id;
    }
    public Long getPackageId() {
        return packageId;
    }
    public String getPickupDate() {
        return pickupDate;
    }
    public PickupPoint getPickupPoint() {
        return pickupPoint;
    }
    public String getRegisteryDate() {
        return registeryDate;
    }
    public DeliveryStatus getStatus() {
        return status;
    }
    public String getStoreName() {
        return storeName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public String getUserName() {
        return userName;
    }
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }
    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }
    public void setPickupPoint(PickupPoint pickupPoint) {
        this.pickupPoint = pickupPoint;
    }
    public void setRegisteryDate(String registeryDate) {
        this.registeryDate = registeryDate;
    }
    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
