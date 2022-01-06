package io.github.apace100.calio;

import io.github.apace100.calio.network.CalioNetworkingClient;
import io.github.apace100.calio.util.ClientTagManagerGetter;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

public class CalioClient implements ClientModInitializer {

    @Override
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {
        Calio.tagManagerGetter = new ClientTagManagerGetter();
        CalioNetworkingClient.registerReceivers();
    }
}
