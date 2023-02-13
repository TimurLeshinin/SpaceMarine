package data;

public class Chapter {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Long marinesCount; //Поле может быть null, Значение поля должно быть больше 0, Максимальное значение поля: 1000

    public Chapter(Long marinesCount, String name){

        if (name.length() > 0 && marinesCount > 0 && marinesCount <= 1000) {
            this.name = name;
            this.marinesCount = marinesCount;
        }else{
            throw new NullPointerException("Chapter name can't be empty");
        }
    }

    public Chapter(String marinesCount, String name) throws NullPointerException,IllegalArgumentException
    {
        this(Long.parseLong(marinesCount), name);
    }


}