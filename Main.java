public class Main {
    public static void main(String[] args) {
        CommunicationDevice[] devices = new CommunicationDevice[4];

        devices[0] = new AmateurRadio("L2B0E22");
        devices[1] = new Telegraph("Telegraph1");
        devices[2] = new Telephone("2653589793");
        devices[3] = new MobilePhone("674162347314", "VO707EBIEX");

        for (CommunicationDevice device : devices){
            System.out.println(device);
            device.greet();
            System.out.println();
        }

        Telegraph t = (Telegraph) devices[1];
        System.out.println(t.morseToLatin("...-- / -.. .- - .- -... .- ... . / ... --.- .-.. / .-- .- .-.. -.- . -.. / .. -. - --- / .- / -. --- -....- ... --.- .-.. / -... .- .-. .-.-.- // .- / .-.. .. - - .-.. . / .-- .... .. .-.. . / .-.. .- - . .-. --..-- / - .... . -.-- / .-- .- .-.. -.- . -.. / --- ..- - // -... . -.-. .- ..- ... . / - .... . -.-- / -.-. --- ..- .-.. -.. -. .----. - / ..-. .. -. -.. / .- / .-..-. - .- -... .-.. . .-..-. .-.-.-"));
        System.out.println();
        System.out.println(t.morseToLatin(".- ..- . .. --- / .---- ..--- -...."));
    }
}
