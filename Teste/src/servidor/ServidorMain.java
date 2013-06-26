package servidor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import navigators.smart.tom.MessageContext;
import navigators.smart.tom.server.Recoverable;
import navigators.smart.tom.server.SingleExecutable;
import navigators.smart.tom.ServiceReplica;


public class ServidorMain implements SingleExecutable, Recoverable {
    
    private ServiceReplica replica;
    
    public ServidorMain(int id){
        replica = new ServiceReplica(id,this,this);
    }
    
    public static void main(String[] args) throws Exception{
        
        new ServidorMain(Integer.parseInt(args[0]));
    }
    
    @Override
    public byte[] executeOrdered(byte[] bytes, MessageContext mc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public byte[] executeUnordered(byte[] bytes, MessageContext mc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public byte[] getState() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setState(byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
