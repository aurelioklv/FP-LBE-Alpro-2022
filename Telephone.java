public class Telephone {
    private String phoneNumber;

    Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void call() {
        System.out.printf("Calling from: %s\n", phoneNumber);
    }

    public final void defaultCall() {
        System.out.println("Mr. Watson, come here, i want to see you.");
    }

    @Override
    public String toString() {
        return "Phone number: " + phoneNumber;
    }
}