package Composition;

public class FolderTest {

    public static void main(String[] args) {

        Folder phpFolder = new Folder("php_demo1");

        Folder sourceFilesFolder = new Folder("Source Files");

        Folder phalconFolder = new Folder(".phalcon");
        Folder appFolder = new Folder("app");
        appFolder.addFolder(new Folder("cache"));
        appFolder.addFolder(new Folder("controllers"));
        appFolder.addFolder(new Folder("library"));
        appFolder.addFolder(new Folder("migrations"));
        appFolder.addFolder(new Folder("models"));
        appFolder.addFolder(new Folder("views"));

        Folder cacheFolder = new Folder("cache");

        Folder publicFolder = new Folder("public");
        publicFolder.addFile(".htaccess");
        publicFolder.addFile(".htrouter.php");
        publicFolder.addFile("index.html");

        Folder includePathFolder = new Folder("Include Path");
        Folder remoteFilesFolder = new Folder("Remote Files");

        phpFolder.addFolder(sourceFilesFolder);
        phpFolder.addFolder(includePathFolder);
        phpFolder.addFolder(remoteFilesFolder);

        sourceFilesFolder.addFolder(phalconFolder);
        sourceFilesFolder.addFolder(appFolder);
        sourceFilesFolder.addFolder(cacheFolder);
        sourceFilesFolder.addFolder(publicFolder);

        phpFolder.print();

//        System.out.println("\n\n");
//        System.out.println(phpFolder.getSubFolder("app").getName());

        sourceFilesFolder.deleteFolder("app");

        phpFolder.print();

    }
}
