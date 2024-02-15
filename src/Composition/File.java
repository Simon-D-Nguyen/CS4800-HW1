package Composition;

public class File {
    private String name;

    public File(String name) {
        this.name = name;
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
        StringBuilder nameLine = new StringBuilder();

        for(int i = 0; i < spacing; i++){
            nameLine.append("\t");
        }

        nameLine.append("|- " + name + "\t---<File>");
        System.out.println(nameLine.toString());
    }
}
