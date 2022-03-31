package com.example.uno_bandion_jamnik;


import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.Map;

public class JWebsocketClientEndpoint extends WebSocketClient {

    URI uri;
    Draft draft;

    public JWebsocketClientEndpoint(URI serverUri) {
        super(serverUri);
        this.uri = serverUri;
    }

    public JWebsocketClientEndpoint(URI serverUri, Draft draft) {
        super(serverUri);
        this.uri = serverUri;
        this.draft = draft;
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {

    }

    @Override
    public void onMessage(String message) {

    }

    @Override
    public void onClose(int code, String reason, boolean remote) {

    }

    @Override
    public void onError(Exception ex) {

    }
}
