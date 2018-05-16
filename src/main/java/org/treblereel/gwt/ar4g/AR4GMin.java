package org.treblereel.gwt.ar4g;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import org.treblereel.gwt.ar4g.resources.ARJsTextResource;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/11/18.
 */
public class AR4GMin implements EntryPoint {

    @Override
    public void onModuleLoad() {
        load();
    }

    private static void load() {
        ScriptInjector.fromString(ARJsTextResource.IMPL.getARJSMin().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

    }

}
