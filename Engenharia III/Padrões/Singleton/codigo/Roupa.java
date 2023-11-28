public class Roupa {
    private static Roupa roupa = null;

    private Roupa() {
    }

    public static Roupa getInstance() {
        if (roupa == null) {
            roupa = new Roupa();
        }
        return roupa;
    }

    public void escolher(String tipo) {
        switch (tipo.toLowerCase()) {
            case "camisa":
                System.out.println("Camisa escolhida.");
                break;
            case "short":
                System.out.println("Short escolhido.");
                break;
            case "vestido":
                System.out.println("Vestido escolhido.");
                break;
            default:
                System.out.println("Tipo de roupa inválido.");
        }
    }
}
