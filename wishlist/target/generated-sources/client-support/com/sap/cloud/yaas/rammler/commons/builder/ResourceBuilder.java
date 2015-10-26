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
package com.sap.cloud.yaas.rammler.commons.builder;

import com.sap.cloud.yaas.rammler.commons.ProcessingFailureCallback;
import com.sap.cloud.yaas.rammler.commons.ResponseCallback;


/**
 * Interface which describes the variants of making the call as well as some common request builder methods.
 */
public interface ResourceBuilder<T extends ResourceBuilder<? extends Object>>
{
	/**
	 * Registers callback to handle any response having no callback registered.
	 *
	 * @param callback callback to register
	 * @return the new instance of the request builder
	 */
	T onDefaultErrorResponse(final ResponseCallback callback);

	/**
	 * Registers a callback to handle any exception in cause of processing the response.
	 *
	 * @param callback callback to register
	 * @return the new instance of the request builder
	 */
	T onProcessingFailure(final ProcessingFailureCallback callback);

	/**
	 * Adds a custom header to the request.
	 *
	 * @param key header key
	 * @param values header values
	 * @return the new instance of the request builder
	 */
	T withHeader(final String key, final Object... values);

	/**
	 * Adds a custom query parameter to the request.
	 *
	 * @param key query parameter key
	 * @param values query parameter values
	 * @return the new instance of the request builder
	 */
	T withQuery(final String key, final Object... values);

	/**
	 * Sets a templated uri parameter value.
	 *
	 * @param key the parameter key
	 * @param value the parameter value
	 * @return the new instance of the request builder
	 */
	T withUriParam(final String key, final Object value);

}
