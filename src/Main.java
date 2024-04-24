import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(newDirectory("C:\\games\\Games\\temp"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\savegames"));
        stringBuilder.append(newFile("C:\\games\\Games\\temp\\temp.txt"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\src"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\res"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\src\\main"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\src\\test"));
        stringBuilder.append(newFile("C:\\games\\Games\\src\\main\\Main.java"));
        stringBuilder.append(newFile("C:\\games\\Games\\src\\main\\Utils.java"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\res\\drawables"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\res\\vectors"));
        stringBuilder.append(newDirectory("C:\\games\\Games\\res\\icons"));

        String log = stringBuilder.toString();
        try (FileWriter writer = new FileWriter("C:\\games\\Games\\temp\\temp.txt", true)) {
            writer.write(log);
            writer.flush();
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }
    }
    public static String newDirectory (String path) {
        File directory = new File(path);
        if (directory.mkdirs()) {
            return path + " created\n";
        } else  return path + " not created\n";
    }
    public static String newFile (String path) {
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                return path + " created\n";
            } return path + " not created\n";
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
            return path + " not created\n";
        }
          }

}
