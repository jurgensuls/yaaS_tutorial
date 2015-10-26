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



/**
 * An interface for request builders that are capable of setting the HTTP action at runtime.
 */
public interface HttpActionSettable<T extends AbstractActionBuilder<? extends Object>>
{
	/**
	 * Sets the http method.
	 *
	 * @param theMethod the https method
	 * @return the instance of the request builder
	 */
	T fillMethod(final ActionBuilder.HttpMethod theMethod);
}
