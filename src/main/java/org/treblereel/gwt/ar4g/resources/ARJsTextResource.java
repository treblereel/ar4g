package org.treblereel.gwt.ar4g.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/26/18.
 */
public interface ARJsTextResource extends ClientBundle{

    ARJsTextResource IMPL = GWT.create(ARJsTextResource.class);


    @Source("js/three.ar.js")
    TextResource getARJS();

    @Source("js/three.ar.min.js")
    TextResource getARJSMin();
}
