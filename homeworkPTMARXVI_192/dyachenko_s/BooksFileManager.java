package ua.org.oa.homeworkPTMARXVI_192.dyachenko_s;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by serj27 on 30.05.2016.
 */
public class BooksFileManager {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userName = null;
            char[] password = null;

            String command = null;
            String addInfo = null;
            String addInfo1 = null;

            userName = console.readLine("Enter your username" + '\n');
            password = console.readPassword("Enter password" + '\n');

            if (userName.equals("trouble") && new String(password).equals("11111")) {
                console.printf("login succesful" + '\n');
                while (true) {
                    command = console.readLine("Введите команду:" + '\n');
                    if (command.equals("help")) {
                        printF1();
                    } else if (command.equals("create")) {
                        addInfo = console.readLine("Введите путь и имя файла"+ '\n');
                        createFile(addInfo);
                    } else if (command.equals("delete")) {
                        addInfo = console.readLine("Введите путь и имя файла"+ '\n');
                        deleteFile(addInfo);
                    } else if (command.equals("rename")) {
                        addInfo = console.readLine("Введите путь и имя файла,который вы хотите переименовать" + '\n');
                        addInfo1 = console.readLine("Введите новое имя файла" + '\n');
                        renameFile(addInfo, addInfo1);
                    } else if (command.equals("show")) {
                        addInfo = console.readLine("Введите путь к папке" + '\n');
                        showListFiles(addInfo);
                    } else if (command.equals("exit") || command.equals("quit")) {
                        break;
                    } else {
                        System.out.println("Команда неизвестна");
                    }
                }
            } else {
                console.printf("Перезапустите приложение");
            }

            Arrays.fill(password, ' ');
        }
    }

    private static void printF1() {
        System.out.println("Список команд:" + '\n' + "create - создать;" + '\n' + "delete - удалить;" + '\n' + "rename - переименовать;" + '\n' + "show - показать список файлов внутри директории;");
    }

    private static void createFile(String pathFile) {
        File file = new File(pathFile);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deleteFile(String pathFile) {
        File file = new File(pathFile);
        file.delete();
    }

    private static void renameFile(String pathFile, String newName) {
        File file = new File(pathFile);
        file.getParent();
        file.getName();
        file.renameTo(new File(file.getParent() + newName));
    }

    private static void showListFiles(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            for (String s: file.list()) System.out.println(s);
        }
    }

}
