package com.axellience.vuegwt.client.resources;

import com.axellience.vuegwt.client.jsnative.html.HTMLDocument;
import com.axellience.vuegwt.client.jsnative.html.HTMLElement;

/**
 * Inject the scripts used to manipulate JS object from the Java or convert from
 * Java representation to JS representation in the page
 * Original Source: https://github.com/ltearno/angular2-gwt/
 */
public class VueGwtResourcesInjector
{
    private static boolean injected = false;

    public static void inject()
    {
        if (injected)
            return;
        injected = true;

        HTMLDocument document = HTMLDocument.get();

        HTMLElement jsToolsScriptElement = document.createElement("script");
        jsToolsScriptElement.innerHTML = VueGwtResources.JS_RESOURCES.jsToolsScript().getText();
        document.body.appendChild(jsToolsScriptElement);

        HTMLElement vueGWTToolsScriptElement = document.createElement("script");
        vueGWTToolsScriptElement.innerHTML = VueGwtResources.JS_RESOURCES.vueToolsScript().getText();
        document.body.appendChild(vueGWTToolsScriptElement);

        HTMLElement vueGWTObserverScriptElement = document.createElement("script");
        vueGWTObserverScriptElement.innerHTML = VueGwtResources.JS_RESOURCES.vueGWTObserverScript().getText();
        document.body.appendChild(vueGWTObserverScriptElement);
    }
}