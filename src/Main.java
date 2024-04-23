
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        File GamesTemp = new File("C:\\games\\Games\\temp");
        if (GamesTemp.mkdirs()) {
            stringBuilder.append("catalog temp created \n");
        } else stringBuilder.append("catalog temp not created \n");

        File Games_temp_tempTxt = new File("C:\\games\\Games\\temp\\temp.txt");
        try {
            if (Games_temp_tempTxt.createNewFile()) {
                stringBuilder.append("temp.txt created\n");
            }
        }catch (IOException iox) {
            stringBuilder.append("temp.txt not created\n");
        }


        File Games_src = new File("C:\\games\\Games\\src");
        if (Games_src.mkdirs()) {
            stringBuilder.append("catalog src created \n");
        } else stringBuilder.append("catalog src not created \n");

        File Games_res = new File("C:\\games\\Games\\res");
        if (Games_res.mkdirs()) {
            stringBuilder.append("catalog res created \n");
        } else stringBuilder.append("catalog res not created \n");

        File Games_src_main = new File("C:\\games\\Games\\src\\main");
        if (Games_src_main.mkdirs()) {
            stringBuilder.append("catalog main created \n");
        } else stringBuilder.append("catalog main not created \n");

        File Games_src_test = new File("C:\\games\\Games\\src\\test");
        if (Games_src_test.mkdirs()) {
            stringBuilder.append("catalog test created \n");
        } else stringBuilder.append("catalog test not created \n");

        File Games_src_main_mainJava = new File("C:\\games\\Games\\src\\main\\Main.java");
        try {
            if (Games_src_main_mainJava.createNewFile()) {
                stringBuilder.append("Main.java created \n");
            }
        } catch (IOException ioe) {
            stringBuilder.append("Main.java not created \n");
        }

        File Games_src_main_UtilsJava = new File("C:\\games\\Games\\src\\main\\Utils.java");
        try {
            if (Games_src_main_UtilsJava.createNewFile()) {
                stringBuilder.append("Utils.java created\n");
            }
        } catch (IOException ioe) {
            stringBuilder.append("Utils.java not created\n");
        }

        File Games_res_drawables = new File("C:\\games\\Games\\res\\drawables");
        if (Games_res_drawables.mkdirs()) {
            stringBuilder.append("catalog drawables created\n");
        } else stringBuilder.append("catalog drawables not created\n");

        File Games_res_vectors = new File("C:\\games\\Games\\res\\vectors");
        if (Games_res_vectors.mkdirs()) {
            stringBuilder.append("catalog vectors created\n");
        } else stringBuilder.append("catalog vectors not created\n");

        File Games_res_icons = new File("C:\\games\\Games\\res\\icons");
        if (Games_res_icons.mkdirs()) {
            stringBuilder.append("catalog icons created\n");
        } else stringBuilder.append("catalog icons not created\n");

        String log  = stringBuilder.toString();
        try (FileWriter writer = new FileWriter("C:\\games\\Games\\temp\\temp.txt", true)) {
            writer.write(log);
            writer.flush();
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        }
        }
    }
