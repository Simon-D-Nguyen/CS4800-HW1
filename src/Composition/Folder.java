package Composition;

import java.util.Map;

public class Folder {
    private String name;
    private Map<String, File> fileMap;
    private Map<String, Folder> folderMap;

    public Folder(String name) {
        this.name = name;
        fileMap = null;
        folderMap = null;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addFile(String fileName){
        File tempFile = new File(fileName);
        fileMap.put(fileName, tempFile);
    }

    public void addFolder(String folderName) {
        Folder tempFolder = new Folder(folderName);
        folderMap.put(folderName, tempFolder);
    }

    public void deleteFile(String fileName) {
        if (fileMap.containsKey(fileName)) {
            fileMap.remove(fileName);
        }
        else {
            System.out.println("File " + fileName + " was not found.\n");
        }
    }

    public void deleteFolder(String folderName) {
        if (folderMap.containsKey(folderName)) {
            folderMap.remove(folderName);
        }
        else {
            System.out.println("Folder " + folderName + "was not found.\n");
        }
    }

    public void print() {
        System.out.println(name);

        while(!folderMap.isEmpty()) {
            for(Folder entry : folderMap.values()){
                entry.print();
            }
        }

        while(!fileMap.isEmpty()) {
            for(File entry : fileMap.values()) {
                entry.print();
            }
        }

        //TODO: Prints out all files and subdirectories
    }
}
