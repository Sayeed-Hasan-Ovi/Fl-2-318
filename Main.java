import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //        read from file ./data/d-10-01.txt
        String path = "src/data/d-10-01.txt";
        //        read content from file

        try {
            FileInputStream fstream = new FileInputStream(path);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            // Read File Line By Line
            ArrayList<String> lines = new ArrayList<String>();
            String strLine;
            while ((strLine = br.readLine()) != null) {
                lines.add(strLine);
            }

            //# A Latin of N=10, extract grid from data, first line
            //# N=10, extract 10 from first line
            int N  = Integer.parseInt(lines.get(0).split("=")[1].split(";")[0]);
            System.out.println("N = " + N);

            int[][] grid = new int[N][N];
            ArrayList<Variable> variables = new ArrayList<Variable>();

            for (int i = 0; i < N; i++) {
                String[] line = lines.get(i+3).split(",");
                for (int j = 0; j < N - 1; j++) {
                    grid[i][j] = Integer.parseInt(line[j].strip());
                    //if integer is 0, assign it to variable
                    if (grid[i][j] == 0) {
                        variables.add(new Variable(i, j, N));
                    }
                }
                // last element split by |
                grid[i][N-1] = Integer.parseInt(line[N-1].split("\\|")[0].strip());
            }

            LatinSquare latinSquare = new LatinSquare(grid);
            System.out.println(latinSquare);
            for (Variable variable : variables) {
                System.out.println(variable);
            }
            in.close();
        } catch (Exception e) {// Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
}