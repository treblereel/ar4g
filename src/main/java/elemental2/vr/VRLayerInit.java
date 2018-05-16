package elemental2.vr;

import elemental2.dom.HTMLCanvasElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The VRLayerInit interface (dictionary) of the WebVR API represents a content layer (an HTMLCanvasElement or OffscreenCanvas) that you want to present in a VR display.
 * <p>
 * You can retrieve VRLayerInit objects using VRDisplay.getLayers(), and present them using the VRDisplay.requestPresent() method.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VRLayerInit {

    private VRLayerInit() {

    }

    /**
     * The leftBounds property of the VRLayerInit interface (dictionary) defines the left texture bounds of the canvas whose contents will be presented by the VRDisplay.
     */
    public double[] leftBounds;

    /**
     * The rightBounds property of the VRLayerInit interface (dictionary) defines the right texture bounds of the canvas whose contents will be presented by the VRDisplay.
     */
    public double[] rightBounds;

    /**
     * The source property of the VRLayerInit interface (dictionary) defines the canvas whose contents will be presented by the VRDisplay.
     */
    public HTMLCanvasElement source;

}
