/*
 * generated by Xtext
 */
package fr.obeo.releng.ide;

import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.obeo.releng.TargetPlatformBundleActivator;

public class TargetPlatformExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TargetPlatformBundleActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TargetPlatformBundleActivator.getInstance().getInjector(TargetPlatformBundleActivator.TARGET_PLATFORM_LANGUAGE_NAME);
	}
	
}
