package converterservice.service.impl;

import converterservice.service.ConverterService;

public class ConverterServiceImpl implements ConverterService {

	@Override
	public double dollarToRupees(double dlrAmt) {
		return dlrAmt*60;
	}

}
