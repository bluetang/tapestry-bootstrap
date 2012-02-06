/*
 * Copyright (c) 2012. Blue Tang Studio LLC. All rights reserved.
 */

package com.trsvax.bootstrap.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.Parameter;

/** Link to trigger the {@link Modal} to show. */
public class ModalLink {

    /** the id of the modal block. */
    @Parameter(required = true, defaultPrefix = BindingConstants.LITERAL)
    private String target;

    /** the text of this link */
    @Parameter(required = true)
    private String text;

    /** the css class of this link */
    @Parameter(value = "btn", defaultPrefix = BindingConstants.LITERAL)
    private String cssClass;

    /**
     *
     * @param writer
     */
    @BeginRender
    void beginRender(MarkupWriter writer) {
        writer.element("a", "class", cssClass, "data-toggle", "modal", "data-target", target);
        writer.write(text);
        writer.end();
    }
}
