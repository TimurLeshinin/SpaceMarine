import data.ConsoleCommands;

public class Main {

    public static void main(String[] args) {

        MarineManager marineManager = new MarineManager();
        System.out.println(marineManager.getInfo());



    }


    public static void parseCommand(ConsoleCommands command)
    {
        switch (command)
        {
            case ADD -> {

            }
            case HELP -> {
                getInfo();
            }

            default -> {
                System.out.println("Unknown command\n help for ");
            }
        }
    }


    public static String getInfo() {
        return """
                help : ������� ������� �� ��������� ��������
                info : ������� � ����������� ����� ������ ���������� � ��������� (���, ���� �������������, ���������� ��������� � �.�.)
                show : ������� � ����������� ����� ������ ��� �������� ��������� � ��������� �������������
                add {element} : �������� ����� ������� � ���������
                update id {element} : �������� �������� �������� ���������, id �������� ����� ���������
                remove_by_id id : ������� ������� �� ��������� �� ��� id
                clear : �������� ���������
                save : ��������� ��������� � ����
                execute_script file_name : ������� � ��������� ������ �� ���������� �����. � ������� ���������� ������� � ����� �� ����, � ������� �� ������ ������������ � ������������� ������.
                exit : ��������� ��������� (��� ���������� � ����)
                add_if_max {element} : �������� ����� ������� � ���������, ���� ��� �������� ��������� �������� ����������� �������� ���� ���������
                add_if_min {element} : �������� ����� ������� � ���������, ���� ��� �������� ������, ��� � ����������� �������� ���� ���������
                remove_lower {element} : ������� �� ��������� ��� ��������, �������, ��� ��������
                print_unique_health : ������� ���������� �������� ���� health ���� ��������� � ���������
                print_field_descending_category : ������� �������� ���� category ���� ��������� � ������� ��������
                print_field_descending_melee_weapon : ������� �������� ���� meleeWeapon ���� ��������� � ������� ��������""";
    }
}
