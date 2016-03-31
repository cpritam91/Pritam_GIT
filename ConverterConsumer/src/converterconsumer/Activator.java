package converterconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import converterservice.service.ConverterService;
import converterservice.utils.ConverterUtils;

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
		Activator.context = bundleContext;
		System.out.println("Started");
		
		System.out.println("Rs.180 = $" + ConverterUtils.rupeesToDollars(180));
		
		ServiceReference<?> serviceReference = context.getServiceReference(ConverterService.class);
        ConverterService service = (ConverterService) context.getService(serviceReference);
 
        System.out.println("$3 = Rs." + service.dollarToRupees(3));
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Stopped");
	}

}
