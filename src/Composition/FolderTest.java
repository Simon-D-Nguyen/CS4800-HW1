/*
FolderText.java
 */

package Composition;

public class FolderTest {

    public static void main(String[] args) {

        StringBuilder pathBuilder = new StringBuilder();
        pathBuilder.append("php_demo1");

        Folder rootFolder = new Folder();
        rootFolder.setName(pathBuilder.toString());


        rootFolder.addFolder("Source Files");
        rootFolder.addFolder("Include Path");
        rootFolder.addFolder("Remote Files");


        pathBuilder.append("//Source Files");
        rootFolder.addFolder(".phalcon", pathBuilder.toString());
        rootFolder.addFolder("app", pathBuilder.toString());
        rootFolder.addFolder("cache", pathBuilder.toString());
        rootFolder.addFolder("public", pathBuilder.toString());


        String sourceFile = pathBuilder.toString();
        pathBuilder.append("//app");
        rootFolder.addFolder("config", pathBuilder.toString());
        rootFolder.addFolder("controllers", pathBuilder.toString());
        rootFolder.addFolder("library", pathBuilder.toString());
        rootFolder.addFolder("migrations", pathBuilder.toString());
        rootFolder.addFolder("models", pathBuilder.toString());
        rootFolder.addFolder("views", pathBuilder.toString());

        String publicFolder = sourceFile + "//public";

        rootFolder.addFile(".htaccess", publicFolder);
        rootFolder.addFile(".htrouter.php", publicFolder);
        rootFolder.addFile("index.html", publicFolder);

        rootFolder.print();


        System.out.println("\n---\n");
        rootFolder.deleteFolder("app", sourceFile);

        rootFolder.print();


        System.out.println("\n---\n");
        rootFolder.deleteFolder("public", sourceFile);

        rootFolder.print();
    }
}
