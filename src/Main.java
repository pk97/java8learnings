import chapter3.FilerReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilerReader.processFunctional(BufferedReader::readLine);
        FilerReader.processFunctional((br) -> br.readLine() + br.readLine());
        }
    }