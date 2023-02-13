package data;

import java.time.ZonedDateTime;

public class SpaceMarine {
    private static int counter;
    private final ZonedDateTime creationDate; //���� �� ����� ���� null, �������� ����� ���� ������ �������������� �������������
    private final int id; //�������� ���� ������ ���� ������ 0, �������� ����� ���� ������ ���� ����������, �������� ����� ���� ������ �������������� �������������
    private float health; //�������� ���� ������ ���� ������ 0
    private String name; //���� �� ����� ���� null, ������ �� ����� ���� ������
    private Coordinates coordinates; //���� �� ����� ���� null
    private AstartesCategory category; //���� ����� ���� null
    private Weapon weaponType; //���� �� ����� ���� null
    private MeleeWeapon meleeWeapon; //���� �� ����� ���� null
    private Chapter chapter; //���� ����� ���� null

    private SpaceMarine() {
        this.creationDate = ZonedDateTime.now();
        this.id = ++counter;
    }

    public SpaceMarine(String name, float health, Coordinates coordinates,
                       AstartesCategory category, Weapon weaponType, MeleeWeapon meleeWeapon){
        this();
        if (health > 0 && name.length() > 0 && coordinates != null && category != null && weaponType != null && meleeWeapon != null) {
            this.health = health;
            this.name = name;
            this.coordinates = coordinates;
            this.category = category;
            this.weaponType = weaponType;
            this.meleeWeapon = meleeWeapon;
        }else
            throw new NullPointerException("Every argument must be not-null");
    }


    public SpaceMarine(String name,float health, Coordinates coordinates,
                       AstartesCategory category, Weapon weaponType, MeleeWeapon meleeWeapon, Chapter chapter){
        this(  name, health, coordinates, category,  weaponType, meleeWeapon);
         this.chapter = chapter;
    }


    @Override
    public String toString() {
        return "SpaceMarine{" +
                "creationDate=" + creationDate +
                ", id=" + id +
                ", health=" + health +
                ", name='" + name + '\'' +
                coordinates.toString() +
                ", category=" + category +
                ", weaponType=" + weaponType +
                ", meleeWeapon=" + meleeWeapon +
                ", chapter=" + chapter +
                '}';
    }


    public String getStringToCSV()
    {
        return "" + creationDate +
                "," +id +
                "," + health +
                "," + name +
                "," + coordinates.getX() +
                "," + coordinates.getY() +
                "," + category +
                "," + weaponType +
                "," + meleeWeapon +
                "," + chapter;
    }

    static public SpaceMarine parseSpaceMarine(String line) throws IllegalArgumentException, NullPointerException {
        String values[] = line.split(",");

        if (values.length < 9) {
            throw new IllegalArgumentException("IllegalArgumentException");
        }


        String name = values[0];
        float health = Integer.parseInt(values[1]); //�������� ���� ������ ���� ������ 0

        Coordinates coordinates = new Coordinates(values[2], values[3]); //���� �� ����� ���� null
        AstartesCategory category = AstartesCategory.valueOf(values[4]); //���� ����� ���� null

        Weapon weaponType = Weapon.valueOf(values[5]); //���� �� ����� ���� null
        MeleeWeapon meleeWeapon = MeleeWeapon.valueOf(values[6]); //���� �� ����� ���� null
        Chapter chapter = new Chapter(values[7],values[8]);

        return new SpaceMarine(name,health,coordinates,category,weaponType,meleeWeapon,chapter);
    }

    public Chapter getChapter() {
        return chapter;
    }

    public MeleeWeapon getMeleeWeapon() {
        return meleeWeapon;
    }

    public Weapon getWeaponType() {
        return weaponType;
    }

    public AstartesCategory getCategory() {
        return category;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    public float getHealth() {
        return health;
    }

    public int getId() {
        return id;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }
}
