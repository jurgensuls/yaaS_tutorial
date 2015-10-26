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

import javax.ws.rs.client.Entity;


/**
 * An interface for an action builder that is capable of taking a request body.
 *
 * T - the ActionBuilder type
 * K - the type of the payload object
 */
public interface ActionWithPayloadBuilder<T extends ActionBuilder<? extends Object>, K>
{
	/**
	 * Add payload information to the request.
	 *
	 * @param payload the payload
	 * @return new instance of the action builder
	 */
	T withPayload(final Entity<? extends Object> payload);

	/**
	 * Add payload information to the request.
	 *
	 * @param payload the payload
	 * @return new instance of the action builder
	 */
	T withPayload(final K payload);

	/**
	 * Add payload information to the request.
	 *
	 * @param payload the payload
	 * @param mediaType the media type
	 * @return new instance of the action builder
	 */
	T withPayload(final K payload, final String mediaType);
}
