/*
Folder.java
 */

package Composition;

import java.util.*;

public class Folder {
    private String name;
    private Map<String, File> fileMap;
    private Map<String, Folder> folderMap;

    private static final int DELETE_FILE= 0;
    private static final int DELETE_FOLDER = 1;
    private static final int ADD_FILE = 2;
    private static final int ADD_FOLDER=3;


    public Folder() {
        this.name = "n/a";
        fileMap = new HashMap<>();
        folderMap = new HashMap<>();
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    private Folder folderIsInFolder(List<String> pathList){
        String currentFolderName = pathList.getFirst();

        if (folderMap.containsKey(currentFolderName)){
            pathList.removeFirst();
            Folder currentFolder = folderMap.get(currentFolderName);

            if(pathList.isEmpty()){
                return currentFolder;
            }
            else{
                return currentFolder.folderIsInFolder(pathList);
            }
        }
        return null;
    }

    private List<String> folderPath(String path){
        List<String> output = new LinkedList<>();
        String[] pathArray = path.split("[\\\\|\\|/|//]+");
        for(String folderName : pathArray){
            output.add(folderName);
        }
        return output;
    }

    private void modifyFileSystem(String newName, String path, int modificationType){
        List<String> pathList = folderPath(path);
        pathList.removeFirst();

        Folder latestFolder = folderIsInFolder(pathList);
        if(latestFolder != null){

            if(modificationType == ADD_FILE) {
                latestFolder.addFile(newName);
            }
            else if(modificationType == ADD_FOLDER){
                latestFolder.addFolder(newName);
            }
            else if(modificationType == DELETE_FOLDER){
                latestFolder.deleteFolder(newName);
            }
            else if (modificationType == DELETE_FILE) {
                latestFolder.deleteFile(newName);
            }
        }

        else  {
            System.out.println("Path List was incorrect!");
        }
    }



    public void addFile(String fileName){
        File tempFile = new File();
        tempFile.setName(fileName);
        fileMap.put(fileName, tempFile);
    }

    public void addFile(String fileName, String path) {
        modifyFileSystem(fileName, path, ADD_FILE);
    }


    public void addFolder(String folderName) {
        Folder tempFolder = new Folder();
        tempFolder.setName(folderName);
        folderMap.put(folderName, tempFolder);
    }

    public void addFolder(String folderName, String path) {
        modifyFileSystem(folderName, path, ADD_FOLDER);
    }

    public void deleteFile(String fileName) {
        if (fileMap.containsKey(fileName)) {
            fileMap.remove(fileName);
            System.out.println("File \"" + fileName + "\" was deleted!");
        }
        else {
            System.out.println("File \"" + fileName + "\" was not found.");
        }
    }

    public void deleteFile(String fileName, String path) {
        modifyFileSystem(fileName, path, DELETE_FILE);
    }


    public void deleteFolder(String folderName) {
        if (folderMap.containsKey(folderName)) {
            folderMap.remove(folderName);
            System.out.println("Folder \"" + folderName + "\" was deleted!");
        } else {
            System.out.println("Folder \"" + folderName + "\" was not found!");
        }
    }

    public void deleteFolder(String folderName, String path) {
        modifyFileSystem(folderName, path, DELETE_FOLDER);
    }


    public void print() {
        print(0);
    }

    private void print(int spacing) {

        StringBuilder nameLine = new StringBuilder();

        for(int i = 0; i < spacing; i++){
            nameLine.append("\t");
        }

        nameLine.append("|- " + name + "\t---<Folder>");
        System.out.println(nameLine);

        int newSpacing = spacing + 1;

        if (!folderMap.isEmpty()) {
            for(Folder entry : folderMap.values()){
                entry.print(newSpacing);
            }
        }

        if (!fileMap.isEmpty()) {
            for(File entry : fileMap.values()) {
                entry.print(newSpacing);
            }
        }
    }

}
