package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import navigators.smart.tom.ServiceProxy;

public class ClienteMain {
    
    public static void main(String[] args) throws IOException {
        
        ServiceProxy clienteProxy = new ServiceProxy(Integer.parseInt(args[0])); 
        
    }
    
}
