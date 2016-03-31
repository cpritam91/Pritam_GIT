package converterservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import converterservice.service.ConverterService;
import converterservice.service.impl.ConverterServiceImpl;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Convertor Service Started");
		Activator.context = bundleContext;
		ConverterService service = new ConverterServiceImpl();
		context.registerService(ConverterService.class, service, null);
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Convertor Service Stopped");
	}

}
