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

        print(0);

//        System.out.println(name);
//        int spacing = 1;
//
//        while(!folderMap.isEmpty()) {
//            System.out.print("\t-");
//            for(Folder entry : folderMap.values()){
//                entry.print(spacing);
//            }
//        }
//
//        while(!fileMap.isEmpty()) {
//            System.out.print("\t-");
//            for(File entry : fileMap.values()) {
//                entry.print();
//            }
//        }
//
//
        //TODO: Prints out all files and subdirectories
    }

    public void print(int spacing) {

        StringBuilder nameLine = new StringBuilder();

        for(int i = 0; i < spacing; i++){
            nameLine.append("\t");
        }

        nameLine.append("- " + name);
        System.out.println(nameLine.toString());

        int newSpacing = spacing + 1;

        while(!folderMap.isEmpty()) {
            System.out.println();
            for(Folder entry : folderMap.values()){
                entry.print(newSpacing);
            }
        }

        while(!fileMap.isEmpty()) {
            System.out.print("\t-");
            for(File entry : fileMap.values()) {
                entry.print(newSpacing);
            }
        }

    }

}
