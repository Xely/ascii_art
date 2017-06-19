import java.util.Arrays;
import java.util.Objects;

public class Template {
    private int height;
    private int width;
    private String[] content = new String[27];

    Template(int height, int width, String[] template) {
        this.height = height;
        this.width = width;
        this.content = template;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String[] getContent() {
        return content;
    }

    public void setContent(String[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        String res = "";
        for (int row = 0; row < this.height; row++) {
            for (int letter = 0; letter < 26; letter++) {
                if (!Objects.equals(this.content[letter], "")) {
                    res += this.content[letter].substring(row * this.width, (row + 1) * this.width);
                    res += " ";
                }
            }
            res += "\n";
        }
        return res;
    }
}
