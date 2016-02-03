/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.ice.project.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.ini.ui.internal.IniActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class InputExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return IniActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return IniActivator.getInstance().getInjector(IniActivator.ORG_ECLIPSE_ICE_PROJECT_INPUT);
	}
	
}
