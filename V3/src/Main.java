import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int  numThrows = 1000;
    public static void main(String[] args) {

        Shaker shaker = new Shaker();
        shaker.addDice(new RegularDice());
        shaker.addDice(new MultisidedDice(10));
        shaker.addDice(new LoadedDice());
        shaker.addDice(new ChaosDice());

        //MultisidedDice  multidice = new RegularDice();  //example
        /*
        while(true) {
            shaker.throwDice();
        }
        */

        List<int[]> results = new ArrayList<>();

        for (int i = 0; i < numThrows; i++) {
            int[] throwResult = shaker.throwDiceAndReturnValues();
            results.add(throwResult);
        }

        saveResultsToCSV(results, "results.csv");
        System.out.println("✅ Ergebnisse gespeichert in results.csv");
    }

    private static void saveResultsToCSV(List<int[]> results, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            // Kopfzeile schreiben
            int diceCount = results.get(0).length;
            for (int i = 0; i < diceCount; i++) {
                writer.append("Dice" + (i + 1));
                if (i < diceCount - 1) writer.append(",");
            }
            writer.append("\n");

            // Daten schreiben
            for (int[] row : results) {
                for (int j = 0; j < row.length; j++) {
                    writer.append(String.valueOf(row[j]));
                    if (j < row.length - 1) writer.append(",");
                }
                writer.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
