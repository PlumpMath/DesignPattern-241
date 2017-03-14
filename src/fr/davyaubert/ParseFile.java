package fr.davyaubert;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by daubert on 14/03/2017.
 */
public class ParseFile {
    /**
     * Parse a file and print result of him.
     * @param filePath
     */
    public static void Parse(String filePath) {
        try {
            int count = 0;
            String[] splitLine;
            Scanner scanner = new Scanner(new File("src/fr/davyaubert/plop.txt"));
            while(scanner.hasNext()) {
                splitLine = scanner.next().split("/");
                for (String currentLine : splitLine) {
                    if (count == 25) {
                        count = 0;

                        System.out.println(parseHexaLine(currentLine));
                    } else count++;
                }
            }
        }
        catch (IOException e) {
            System.out.println("IOException= " + e.getMessage());
        }
    }

    /**
     * Convert an hexa ASCII to String.
     * @param hex
     * @return
     */
    private static String convertHexToString(String hex) {
        StringBuilder sbIn = new StringBuilder();
        StringBuilder sbOut = new StringBuilder();

        for( int i = 0; i < hex.length()-1; i += 2 ){
            String output = hex.substring(i, (i + 2));
            int decimal = Integer.parseInt(output, 16);
            sbIn.append((char)decimal);
            sbOut.append(decimal);
        }

        return sbIn.toString();
    }

    /**
     * Decode an hexa ASCII line.
     * @param line
     * @return Line decoded
     */
    private static String parseHexaLine(String line) {
        StringBuilder sbIn = new StringBuilder();
        StringBuilder sbOut = new StringBuilder();

        for(int i = 0; i < line.length(); i++) {
            if (i != 0 && i%2 == 0) {
                sbOut.append(convertHexToString(sbIn.toString()));

                sbIn = new StringBuilder();
                sbIn.append(line.charAt(i));
            } else {
                sbIn.append(line.charAt(i));
            }
        }

        return sbOut.toString();
    }
}
