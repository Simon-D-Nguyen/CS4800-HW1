package Composition;

import java.util.List;

public class Folder {
    private String name;
    private List<File> fileList;
    private List<Folder> folderList;

    public Folder(String name) {
        this.name = name;
        fileList = null;
        folderList = null;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addFile(String fileName){
        File temp = new File(fileName);
        fileList.add(temp);
    }

    public void addFolder(String folderName) {
        Folder temp = new Folder(folderName);
        folderList.add(temp);
    }

    public void deleteFile(String fileName) {

    }

    public void print() {
        //TODO: Prints out all files and subdirectories
    }
}
