public class AmateurRadio extends CommunicationDevice {
    private String callSign;
    private Long freq = 472_000L;
    private int tone = 550;

    public AmateurRadio(String callSign, Long freq) {
        this.callSign = callSign;
        this.freq = freq;
    }

    public AmateurRadio(String callSign) {
        this.callSign = callSign;
    }

    public void startContact() {
        System.out.printf("CQ CQ CQ DE %s", callSign); // seek you x3, from {callSign}
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    public void endContact() {
        System.out.printf("THX FER QSO 88"); // Thanks for contact, love and kisses
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public Long getFreq() {
        return freq;
    }

    public void setFreq(Long freq) {
        this.freq = freq;
    }

    public int getTone() {
        return tone;
    }

    public void setTone(int tone) {
        this.tone = tone;
    }

    @Override
    public String toString() {
        return "AmateurRadio [callSign=" + callSign + ", freq=" + freq + ", tone=" + tone + "]";
    }

    @Override
    public void greet() {
        sendMessage("DE "+ callSign + " IM GUD HW K");
    }

}
