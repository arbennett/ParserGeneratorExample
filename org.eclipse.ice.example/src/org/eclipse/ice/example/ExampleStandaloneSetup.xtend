/*
 * generated by Xtext 2.9.1
 */
package org.eclipse.ice.example


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ExampleStandaloneSetup extends ExampleStandaloneSetupGenerated {

	def static void doSetup() {
		new ExampleStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}