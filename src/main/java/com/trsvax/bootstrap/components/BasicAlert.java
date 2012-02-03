package com.trsvax.bootstrap.components;

import com.trsvax.bootstrap.environment.AlertEnvironment;
import com.trsvax.bootstrap.environment.AlertType;

import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.AfterRender;
import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Parameter;

/**
 * Display a <a href="http://twitter.github.com/bootstrap/#alerts">Bootstrap alert</a>.
 * @tapestrydoc
 */
@Import(library="classpath:/com/trsvax/bootstrap/bootstrap-alert.js")
public class BasicAlert extends BootstrapComponent {

    /** Type of alert: any value of the {@link AlertType} enum, that is <tt>info</tt>, <tt>warning</tt> or <tt>error</tt> */
	@Parameter(value=AlertEnvironment.type,defaultPrefix="literal")
	private AlertType type;
	
	@BeginRender
	void beginRender(MarkupWriter writer) {
		writer.element("div", "class", String.format("alert%s", formatClass(type)));
		writer.element("a", "class","close","href","#", "data-dismiss","alert");
		writer.write("x");
		writer.end();
	}

	@AfterRender
	void afterRender(MarkupWriter writer) {
		writer.end();
	}
	

}
