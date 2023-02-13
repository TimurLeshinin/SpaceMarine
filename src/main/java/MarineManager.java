import data.*;

import java.io.*;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.util.Scanner;

public class MarineManager {
    private LinkedList<SpaceMarine> spaceMarines;
    private final ZonedDateTime creationDate;

    public MarineManager() {
        this.spaceMarines = new LinkedList<>();
        creationDate = ZonedDateTime.now();
    }

    public void setSpaceMarinesFromFile(String path) throws FileNotFoundException,IllegalArgumentException, NullPointerException {
        Scanner scanner = new Scanner(new FileInputStream(path));

        String line;
        while (scanner.hasNext()) {
            line = scanner.nextLine();

            try {
                spaceMarines.add(SpaceMarine.parseSpaceMarine(line));
            }catch (IllegalArgumentException | NullPointerException exception)
            {
                System.err.println(exception);
            }
        }

        scanner.close();
    }

    public void addSpaceMarine(SpaceMarine spaceMarine)
    {
        spaceMarines.add(spaceMarine);
    }

    public void addSpaceMarine(String str) throws IllegalArgumentException, NullPointerException
    {
        SpaceMarine.parseSpaceMarine(str);
    }


    public String getInfo()
    {
        String str = "";
        str += "Date: " +creationDate+ "\n";

        return str;
    }


    public void outputFile(String path) throws IOException {
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(path));

        for(int i =0; i <spaceMarines.size(); i++ )
        {
            outputStream.write(spaceMarines.get(i).toString().getBytes());
            if(i < spaceMarines.size() -1)
                outputStream.write('\n');
        }

        outputStream.flush();
        outputStream.close();
    }

}
