package com.axellience.vuegwt.client;

import com.axellience.vuegwt.client.options.VueComponentOptions;
import com.axellience.vuegwt.client.functions.ChangeTrigger;
import com.axellience.vuegwt.client.functions.OnEvent;
import com.axellience.vuegwt.client.functions.OnNextTick;
import com.axellience.vuegwt.client.functions.OnValueChange;
import com.axellience.vuegwt.client.functions.WatcherRegistration;
import com.axellience.vuegwt.client.jsnative.VueGwtToolsInjector;
import com.axellience.vuegwt.client.jsnative.types.JsArray;
import com.axellience.vuegwt.client.jsnative.types.JsObject;
import com.google.gwt.dom.client.Element;
import jsinterop.annotations.JsType;

/**
 * The Java representation of a Vue Component.
 * Whenever you want to add a component to your application you should extends this class and add the
 * {@link com.axellience.vuegwt.jsr69.component.annotations.Component} annotation.
 * @author Adrien Baron
 */
@JsType
public abstract class VueComponent
{
    static
    {
        // Inject the JS tools in the page
        VueGwtToolsInjector.inject();
    }

    public JsObject $data;
    public Element $el;
    public JsObject $options;
    public VueComponent $parent;
    public VueComponent $root;
    public JsArray<VueComponent> $children;
    public JsObject $slots;
    public JsObject $scopedSlots;
    public JsObject $refs;
    public boolean $isServer;
    public String _uid;

    /**
     * Used to customize {@link VueComponentOptions} for this {@link VueComponent}.
     * <p>
     * This is called once when creating the {@link VueComponentOptions} of our Component.
     * This {@link VueComponentOptions} will be passed to Vue when registering your Component.
     * This can be used to set custom properties for plugins like Vue Router.
     * @param componentOptions The options that we can customize in the method
     */
    public void customizeOptions(VueComponentOptions componentOptions)
    {

    }

    /**
     * Lifecycle hooks
     * By default they are not copied, they are here to facilitate development
     */
    public void beforeCreate()
    {

    }

    public abstract void created();

    public void beforeMount()
    {

    }

    public void mounted()
    {

    }

    public void beforeUpdate()
    {

    }

    public void updated()
    {

    }

    public void activated()
    {

    }

    public void deactivated()
    {

    }

    public void beforeDestroy()
    {

    }

    public void destroyed()
    {

    }

    // Data
    public native WatcherRegistration $watch(String toWatch, OnValueChange onValueChange);

    public native WatcherRegistration $watch(ChangeTrigger changeTrigger,
        OnValueChange onValueChange);

    public native Object $set(Object object, String key, Object value);

    public native Object $set(Object object, String key, boolean value);

    public native Object $set(Object object, String key, byte value);

    public native Object $set(Object object, String key, char value);

    public native Object $set(Object object, String key, float value);

    public native Object $set(Object object, String key, int value);

    public native Object $set(Object object, String key, short value);

    public native Object $set(Object object, String key, double value);

    public native Object $delete(Object object, String key);

    // Events
    public native void $on(String name, OnEvent callback);

    public native void $once(String name, OnEvent callback);

    public native void $off(String name, OnEvent callback);

    public native void $emit(String name, Object... param);

    // Lifecycle
    public native VueComponent $mount();

    public native VueComponent $mount(Element element);

    public native VueComponent $mount(String element);

    public native VueComponent $mount(Element element, boolean hydrating);

    public native VueComponent $mount(String element, boolean hydrating);

    public native void $forceUpdate();

    public native void $nextTick(OnNextTick onNextTick);

    public native void $destroy();
}