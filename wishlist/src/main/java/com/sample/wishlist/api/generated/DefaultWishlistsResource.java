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
package com.sample.wishlist.api.generated;

import java.util.Arrays;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sample.wishlist.client.document.DocumentClient;
import com.sap.cloud.yaas.servicesdk.authorization.AccessToken;
import com.sap.cloud.yaas.servicesdk.authorization.AuthorizationScope;
import com.sap.cloud.yaas.servicesdk.authorization.DiagnosticContext;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionCallback;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionTemplate;




/**
 * Resource class containing the custom logic. Please put your logic here!
 * 
 * @param <AccessToken>
 */
@Component("apiWishlistsResource")
@Singleton
public class DefaultWishlistsResource implements com.sample.wishlist.api.generated.WishlistsResource {
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	private static final String WISHLIST_PATH = "wishlist";

	@Inject
	private DocumentClient documentClient;
	@Inject
	private AuthorizedExecutionTemplate authorizedExecutionTemplate;
	@Value("${CLIENT}")
	private String client;

	/* GET / */
	@Override
	public Response get(PagedParameters paged, final YaasAwareParameters yaasAware) 
	{
		final Response response = authorizedExecutionTemplate.executeAuthorized(
				new AuthorizationScope(yaasAware.getHybrisTenant(), Arrays.asList("hybris.document_view")),
				new DiagnosticContext(yaasAware.getHybrisRequestId(), yaasAware.getHybrisHop()),
				new AuthorizedExecutionCallback<Response>() {
					@Override
					public Response execute(final AccessToken token)
					{
						return documentClient.tenant(yaasAware.getHybrisTenant())
								.clientData(client)
								.type(WISHLIST_PATH)
								.prepareGet()
								.withAuthorization(token.toString())
								.execute();
					}
				});

//				//AuthorizedExecutionCallback<Response>() {
//					@Override
//					public Response execute(AccessToken token) {
//						return documentClient.tenant(yaasAware.getHybrisTenant()).clientData(client).type(WISHLIST_PATH)
//								.prepareGet().withAuthorization(token.toAuthorizationHeaderValue()).execute();
//					}
//
//				});

		if (response.getStatus() == Response.Status.OK.getStatusCode()) {
			return Response.ok().entity(response.readEntity(Wishlist[].class)).build();
		} else {
			return Response.serverError().build();
		}									
	}

	/* POST / */
	@Override
	public Response post(final YaasAwareParameters yaasAware, final Wishlist wishlist) {
		// place some logic here
		return Response.created(uriInfo.getAbsolutePath()).build();
	}

	/* GET /{wishlistId} */
	@Override
	public Response getByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId) {
		/*
		 * Wishlist wishlist = new Wishlist(); wishlist.setTitle("Hello World");
		 */
		// place some logic here
		return Response.ok().entity(new Wishlist()).build();

		/* .entity(wishlist).build(); */
	}

	/* PUT /{wishlistId} */
	@Override
	public Response putByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId,
			final Wishlist wishlist) {
		// place some logic here
		return Response.ok().build();
	}

	/* DELETE /{wishlistId} */
	@Override
	public Response deleteByWishlistId(final YaasAwareParameters yaasAware, final java.lang.String wishlistId) {
		// place some logic here
		return Response.noContent().build();
	}

	public Response getByWishlistIdWishlistItems(final PagedParameters paged, YaasAwareParameters yaasAware,
			String wishlistId) {
		return Response.ok().entity(new java.util.ArrayList<>()).build();
	}

	public Response postByWishlistIdWishlistItems(YaasAwareParameters yaasAware, String wishlistId,
			WishlistItem wishlistItem) {
		return Response.created(uriInfo.getAbsolutePath()).build();
	}

}
