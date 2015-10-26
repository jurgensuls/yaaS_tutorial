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

/**
 * Generated parameter dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Mon Oct 26 10:24:16 CET 2015")
public class PagedParameters
{
	@javax.validation.constraints.DecimalMin(value="1")
	@javax.ws.rs.DefaultValue("1")	@javax.ws.rs.QueryParam("pageNumber")
	private java.lang.Integer pageNumber;

	@javax.validation.constraints.DecimalMin(value="1")
	@javax.ws.rs.DefaultValue("16")	@javax.ws.rs.QueryParam("pageSize")
	private java.lang.Integer pageSize;

	public java.lang.Integer getPageNumber()
	{
		return pageNumber;
	}

	public java.lang.Integer getPageSize()
	{
		return pageSize;
	}

	public void setPageNumber(final java.lang.Integer pageNumber)
	{
		this.pageNumber = pageNumber;
	}

	public void setPageSize(final java.lang.Integer pageSize)
	{
		this.pageSize = pageSize;
	}

}
