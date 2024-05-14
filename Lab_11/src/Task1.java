import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1{
        public static void main(String[] args) throws IOException{
                Scanner input = new Scanner(System.in);
                FileWriter output = null;
                String line;
                System.out.println("Podaj ścieżkę do pliku: ");

                try {
                        output = new FileWriter(input.nextLine());
                        System.out.println("Podaj zawartość pliku: ");
                    while (true){
                            line = input.nextLine();
                            if(line.equals("-")) break;
                            output.write(line);
                            output.write(System.lineSeparator());
                    }
                }
                finally {
                        if(output != null)
                                output.close();
                }
        }



}