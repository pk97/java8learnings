package chapter3;

import java.io.*;
/*
A file reader usecase to show how we can create our own functional interfaces
to provide dynamic behaviour. in next commit we will see existing function
interfaces.
 */
public class FilerReader {

    public static String processFile() throws IOException {
        try (BufferedReader br =new BufferedReader(new FileReader(""))) {
           return br.readLine();
        }
    }

    public static String processFileBYReading2line() throws IOException {
        try (BufferedReader br =new BufferedReader(new FileReader(""))) {
            return br.readLine() + br.readLine();
        }
    }

    public static String processFunctional(Process p) throws IOException {
        try (BufferedReader br =new BufferedReader(new FileReader(""))) {
            return p.process(br);
        }
    }
}


