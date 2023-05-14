package Main;

public class MethodTask {
    private final String[] alphabets = {"abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "абвгдеёжзийклмнопрстуфхцчшщъыьэюя", "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ"};
    private final String engLowAlphabet = "abcdefghijklmnopqrstuvwxyz";
    private final String engHighAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String rusLowAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private final String rusHighAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private String line;
    private int shift;
    MethodTask(String l, int s, String d) {
        this.line = l;
        if (d.equals("вправо") | d.equals("Вправо")) {
            this.shift = s;
        } else if (d.equals("влево") | d.equals("Влево")) {
            this.shift = -1 * s;
        } else {
            this.shift = s;
        }
    }
    public String encrypt() {
        for (int i = 0; i < this.line.length(); i++) {
            this.line = changeChar(this.line, i, findChar(this.line.charAt(i)));
        }
        return line;
    }
    private String changeChar(String startLine, int index, char letter) {
        return startLine.substring(0, index) + letter + startLine.substring(index + 1);
    }
    private char findChar(char start) {
        char result = '1';
        if (this.shift > 0) {
            for (int i = 0; i < alphabets.length; i++) {
                if (String.valueOf(alphabets[i]).contains(String.valueOf(start))) {
                    int space = alphabets[i].length() - alphabets[i].indexOf(start) - 1;
                    if (this.shift > space) {
                        return alphabets[i].charAt(shift - space - 1);
                    } else {
                        return alphabets[i].charAt(alphabets[i].indexOf(start) + this.shift);
                    }
                }
            }
        } else if (this.shift < 0) {
            for (int i = 0; i < alphabets.length; i++) {
                if (String.valueOf(alphabets[i]).contains(String.valueOf(start))) {
                    int space = alphabets[i].indexOf(start);
                    if ((this.shift * (-1)) > space) {
                        return alphabets[i].charAt(alphabets[i].length() + (shift + space));
                    } else {
                        return alphabets[i].charAt(alphabets[i].indexOf(start) + this.shift);
                    }
                }
            }
        }
        return result;
    }
}
