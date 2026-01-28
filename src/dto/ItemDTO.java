package dto;

public class ItemDTO {
    private int itemId;
    private String itemName;
    private String description;
    private String location;
    private String reporterName;
    private String status;

    public ItemDTO() {
    }

    public ItemDTO(String itemName, String description, String location, String reporterName, String status) {
        this.itemName = itemName;
        this.description = description;
        this.location = location;
        this.reporterName = reporterName;
        this.status = status;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Name: " + itemName + ", Description: " + description +
                ", Location: " + location + ", Reporter: " + reporterName + ", Status: " + status;
    }
}
