package elemental2.vr;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * WARNING !!! THIS PACKAGE WILL BE REMOVED AFTER RELEASE OF ORIGINAL ELEMENTAL2
 * <p>
 * The VREyeParameters interface of the WebVR API represents all the information required to correctly render a scene for a given eye, including field of view information.
 * <p>
 * This interface is accessible through the VRDisplay.getEyeParameters() method.
 * <p>
 * The values in this interface should not be used to compute view or projection matrices. In order to ensure the widest possible hardware compatibility use the matrices provided by VRFrameData.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/15/18.
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class VREyeParameters {

    private VREyeParameters(){

    }

    /**
     * The renderWidth read-only property of the VREyeParameters interface describes the recommended render target width of each eye viewport, in pixels.
     * <p>
     * This is already in device pixel units, so there's no need to multiply by Window.devicePixelRatio before setting to HTMLCanvasElement.width.
     *
     * @return A double, representing the width in pixels.
     */
    @JsProperty(name = "renderWidth")
    public native double getRenderWidth();

    /**
     * The renderHeight read-only property of the VREyeParameters interface describes the recommended render target height of each eye viewport, in pixels.
     * <p>
     * This is already in device pixel units, so there's no need to multiply by Window.devicePixelRatio before setting to HTMLCanvasElement.height.
     *
     * @return A double, representing the height in pixels.
     */
    @JsProperty(name = "renderHeight")
    public native double getRenderHeight();
}
