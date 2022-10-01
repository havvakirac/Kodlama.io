package sesliHarfler;

public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println(harf + " kalın seslidir");
                break;

            default:
                System.out.println(harf + "  ince seslidir");
                break;
        }
    }
}
