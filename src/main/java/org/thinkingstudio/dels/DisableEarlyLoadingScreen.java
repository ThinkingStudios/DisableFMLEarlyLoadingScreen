package org.thinkingstudio.dels;

import cpw.mods.modlauncher.api.IEnvironment;
import cpw.mods.modlauncher.api.ITransformationService;
import cpw.mods.modlauncher.api.ITransformer;
import cpw.mods.modlauncher.api.IncompatibleEnvironmentException;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class DisableEarlyLoadingScreen implements ITransformationService {

    @NotNull
    @Override
    public String name() {
        return "DisableEarlyLoadingScreen";
    }

    @Override
    public void initialize(IEnvironment environment) {

    }

    @Override
    public void beginScanning(IEnvironment environment) {

    }

    @Override
    public void onLoad(IEnvironment env, Set<String> otherServices) throws IncompatibleEnvironmentException {
            System.setProperty("fml.earlyprogresswindow","false");
    }

    @NotNull
    @Override
    public List<ITransformer> transformers() {
        return new ArrayList<>(0);
    }
}
