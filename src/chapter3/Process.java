package chapter3;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface Process {
     String process(BufferedReader br) throws IOException;
}
