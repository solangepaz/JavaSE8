package com.example.client;

import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class NetworkClientCallable implements Callable<RequestResponse>  {
    private RequestResponse lookup;

    NetworkClientCallable(RequestResponse rs) {
        this.lookup = rs;
    }

    @Override
    public RequestResponse call() throws Exception
    {
        try (Socket sock = new Socket(lookup.host, lookup.port);
            Scanner scanner = new Scanner(sock.getInputStream())) 
            {
                lookup.response = scanner.next();
                return lookup;
            }
    }
}
