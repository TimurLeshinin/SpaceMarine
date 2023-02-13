import data.ConsoleCommands;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MarineManager marineManager = new MarineManager();
        Scanner scanner =new Scanner(System.in);

        String command[] = scanner.nextLine().split(" ");


    }


    public static void parseCommand( String args[])
    {
        String  command = (args[0]);
        switch (command)
        {
            case "ADD" -> {

            }
            case "HELP" -> {
                getInfo();
            }

            default -> {
                System.out.println("Unknown command\n help for ");
            }
        }
    }


    public static String getInfo() {
        return """
                help : вывести справку по доступным командам
                info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)
                show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении
                add {element} : добавить новый элемент в коллекцию
                update id {element} : обновить значение элемента коллекции, id которого равен заданному
                remove_by_id id : удалить элемент из коллекции по его id
                clear : очистить коллекцию
                save : сохранить коллекцию в файл
                execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.
                exit : завершить программу (без сохранения в файл)
                add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции
                add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции
                remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный
                print_unique_health : вывести уникальные значения поля health всех элементов в коллекции
                print_field_descending_category : вывести значения поля category всех элементов в порядке убывания
                print_field_descending_melee_weapon : вывести значения поля meleeWeapon всех элементов в порядке убывания""";
    }
}
