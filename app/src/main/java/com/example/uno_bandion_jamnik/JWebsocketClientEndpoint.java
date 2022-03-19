package com.example.uno_bandion_jamnik;


import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.util.Map;

public class JWebsocketClientEndpoint extends WebSocketClient {


    public JWebsocketClientEndpoint(URI serverUri) {
        super(serverUri);
    }

    public JWebsocketClientEndpoint(URI serverUri, Draft protocolDraft) {
        super(serverUri, protocolDraft);
    }

    public JWebsocketClientEndpoint(URI serverUri, Map<String, String> httpHeaders) {
        super(serverUri, httpHeaders);
    }

    public JWebsocketClientEndpoint(URI serverUri, Draft protocolDraft, Map<String, String> httpHeaders) {
        super(serverUri, protocolDraft, httpHeaders);
    }

    public JWebsocketClientEndpoint(URI serverUri, Draft protocolDraft, Map<String, String> httpHeaders, int connectTimeout) {
        super(serverUri, protocolDraft, httpHeaders, connectTimeout);
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
