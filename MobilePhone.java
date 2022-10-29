public class MobilePhone extends Telephone {
    private String serialNumber;

    MobilePhone(String phoneNumber, String serialNumber) {
        super(phoneNumber);
        this.serialNumber = serialNumber;
    }

    MobilePhone(String phoneNumber) {
        super(phoneNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return String.format("%s\nSerial Number: %s", super.toString(), serialNumber);
    }
}
