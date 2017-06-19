import java.util.Objects;
import java.util.Scanner;

public class Game {

    private Template template1;
    private Template template2;

    public Game() {
        String[] template1String;
        template1String = new String[]{
                " # # ##### ## #",
                "## # ### # ### ",
                " ###  #  #   ##",
                "## # ## ## ### ",
                "####  ## #  ###",
                "####  ## #  #  ",
                " ###  # ## # ##",
                "# ## ##### ## #",
                "### #  #  # ###",
                " ##  #  ## # # ",
                "# ## ### # ## #",
                "#  #  #  #  ###",
                "# ######## ## #",
                "#### ## ## ## #",
                " # # ## ## # # ",
                "## # ### #  #  ",
                " # # ## # ##  #",
                "## # ### # ## #",
                " ###   #   ### ",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "###  # ##    # "
        };
        template1 = new Template(5, 3, template1String);
        //String[] template2String;
        //template2String = new String[]{
        //        " __  __ |  \/  || \  / || |\/| || |  | ||_|  |_|",
        //        " _   _ | \ | ||  \| || . ` || |\  ||_| \_|",
        //        " ____  / __ \ | |  | || |  | || |__| | \____/ ",
        //        "_____  |  __ \ | |__) ||  ___/ | |     |_|     ",
        //        " ____   / __ \ | |  | || |  | || |__| | \___\_\",
        //        "_____  |  __ \ | |__) ||  _  / | | \ \ |_|  \_\",
        //        "  _____  / ____|| (___   \___ \  ____) ||_____/ ",
        //        " _______ |__   __|   | |      | |      | |      |_|  "
        //        " ___  |__ \    ) |  / /  |_|   (_)  "

        //};
        //template2 = new Template(5, 3, template2String);
    }

    public Template getTemplate1() {
        return template1;
    }

    public void setTemplate1(Template template1) {
        this.template1 = template1;
    }

    public Template getTemplate2() {
        return template2;
    }

    public void setTemplate2(Template template2) {
        this.template2 = template2;
    }

    public Template chooseTemplate() {
        System.out.printf("template numéro 1 de hauteur: " + this.template1.getHeight() + " et de largeur: " + this.template1.getWidth());
        System.out.println("");
        printTemplate(this.template1);
        //System.out.printf("Second template de hauteur: " + this.template2.getHeight() + " et de largeur: " + this.template2.getWidth());
        //System.out.printf(template2.toString());

        int n = 0;
        while (n != 1) {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Veuillez choisir un template : ");
            n = reader.nextInt();
        }
        return template1;
    }

    public String chooseString() {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Saisissez une chaine de caractères à transformer: ");
        return reader.next();
    }

    public void printResult(String input, Template template) {
        char letterInput;
        int ascii;
        int letterPosition;
        String stringInTemplate;

        for (int row = 0; row < template.getHeight(); row++) {
            for (int letterInputPos = 0; letterInputPos < input.length(); letterInputPos++) {
                letterInput = input.charAt(letterInputPos);
                ascii = (int) letterInput;
                letterPosition = ascii - 97;
                if (letterPosition >= 26 || letterPosition < 0) {
                    stringInTemplate = template.getContent()[26];
                } else {
                    if (Objects.equals(template.getContent()[letterPosition], "")) {
                        stringInTemplate = template.getContent()[26];
                    } else {
                        stringInTemplate = template.getContent()[letterPosition];
                    }
                }
                String output = stringInTemplate.substring(row * template.getWidth(), (row + 1) * template.getWidth());
                System.out.printf(output);
                System.out.printf(" ");
            }
            System.out.println("");
        }
    }

    public void printTemplate (Template template) {
        System.out.printf(template.toString());
    }
}
