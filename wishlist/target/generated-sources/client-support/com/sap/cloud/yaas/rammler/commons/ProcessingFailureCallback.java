/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package com.sap.cloud.yaas.rammler.commons;



/**
 * Callback for handling exceptions on response processing.
 */
public interface ProcessingFailureCallback
{
	/**
	 * Handles an exception on response processing on client side. When the exception occurs on entity unmarshalling a
	 * {@link javax.ws.rs.ProcessingException} gets passed, not a {@link javax.ws.rs.WebApplicationException}.
	 * 
	 * It will stop the exception from propagating.
	 *
	 * @param throwable the exception happened on client side while processing the response
	 */
	void handleProcessingFailure(final Throwable throwable);
}
