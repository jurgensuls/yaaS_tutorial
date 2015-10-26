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

import javax.ws.rs.core.Response;


/**
 * Callback for reacting on a response.
 */
public interface ResponseCallback
{
	/**
	 * Processes the received response.
	 *
	 * @param response the response received
	 */
	void handle(final Response response);
}
