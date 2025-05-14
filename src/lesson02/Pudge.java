package lesson02;

import java.io.Serializable;

public class Pudge implements Serializable {


    private static final long serialVersionUID = 3140500042499636870L;
    private String name;
    private int level;

    public Pudge(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLeve(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pudge{");
        sb.append("name='").append(name).append('\'');
        sb.append(", level=").append(level);
        sb.append('}');
        return sb.toString();
    }
}
