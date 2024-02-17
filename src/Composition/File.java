/*
File.java
 */

package Composition;

public class File {
    private String name;

    public File() {
        this.name = "n/a";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        print(0);
    }

    public void print(int spacing) {
        String format = "|- " + name + "\t---<File>";

        String nameLine = "\t".repeat(Math.max(0, spacing)) +
                format;
        System.out.println(nameLine);
    }
}
