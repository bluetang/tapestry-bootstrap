package com.trsvax.bootstrap.components;

import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.Block;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;


/**
 * Modal dialog. To use enable the modal, you have to place a control element on the page.
 * <pre><code><a class="btn" data-toggle="modal" herf="#id">Add New Location</a></code></pre>
 * 
 * @tapestrydoc
 * @see <a href="http://twitter.github.com/bootstrap/javascript.html#modals">Bootstrap Modals</a>
 */
@SuppressWarnings("unused")
@Import(library="classpath:/com/trsvax/bootstrap/bootstrap-modal.js")
public class Modal extends BootstrapComponent {

	@Parameter(defaultPrefix = BindingConstants.LITERAL)
    @Property
	private String id;

	@Parameter
	@Property
	private Block header;
	
	@Parameter
	@Property
	private Block footer;

}
