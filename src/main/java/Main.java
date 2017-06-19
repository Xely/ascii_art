public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Template template = game.chooseTemplate();
        String input = game.chooseString();
        game.printResult(input, template);
    }
}
