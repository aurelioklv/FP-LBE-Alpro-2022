public class Telegraph extends CommunicationDevice{
    private String name = "Telegraph Object";

    public Telegraph() {
    };

    public Telegraph(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    final String[] code = {
            ".-", "-...", "-.-.", "-..", ".",
            "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---",
            ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--",
            "--..",
            ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----",
            "--..--" , ".-.-.-" , "..--.." , "-.-.-." , "---..." ,
            "-..-." , "-....-" , ".----." , "-.--." , "-.--.-" ,
            "..--.-" , ".--.-." , "-.-.--" , ".-..." , "-...-" ,
            ".-.-." , ".-..-." , "...-..-", "/", "//" };

    final char[] letter = {
            'a', 'b', 'c', 'd', 'e',
            'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o',
            'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y','z',
            '1', '2', '3', '4', '5',
            '6', '7', '8', '9', '0',
            ',', '.', '?', ';', ':',
            '/', '-', '\'', '(', ')',
            '_', '@', '!', '&', '=',
            '+', '"', '$' , ' ', '\n'};

    public String morseToLatin(String morseCode) {
        String[] characters = morseCode.split(" ");
        StringBuilder latinMsg = new StringBuilder();

        for (int i = 0; i < characters.length; i++) {
            for (int j = 0; j < code.length; j++) {
                if (characters[i].compareTo(code[j]) == 0) {
                    latinMsg.append(letter[j]);
                    break;
                }
            }
        }

        return latinMsg.toString().toUpperCase();
    }

    public String latinToMorse(String message) {
        StringBuilder morseMsg = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            for (int j = 0; j < letter.length; j++) {
                if (message.toLowerCase().charAt(i) == letter[j]) {
                    morseMsg.append(" ");
                    morseMsg.append(code[j]);
                    break;
                }
            }
        }

        return morseMsg.toString();
    }

    @Override
    public String toString() {
        return "Telegraph [name=" + name + "]";
    }

    @Override
    public void greet() {
        System.out.println(latinToMorse("HELLO!"));
    }

}
