// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.apiclient.api.operations

import java.util.UUID
import kotlin.Any
import kotlin.String
import kotlin.Unit
import org.jellyfin.apiclient.api.client.KtorClient
import org.jellyfin.apiclient.api.client.Response
import org.jellyfin.apiclient.model.api.BaseItemDto
import org.jellyfin.apiclient.model.api.MetadataEditorInfo

class ItemUpdateApi(
	private val api: KtorClient
) {
	/**
	 * Updates an item.
	 *
	 * @param itemId The item id.
	 */
	suspend fun updateItem(itemId: UUID, data: BaseItemDto): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val response = api.post<Unit>("/Items/{itemId}", pathParameters, queryParameters, data)
		return response
	}

	/**
	 * Updates an item's content type.
	 *
	 * @param itemId The item id.
	 * @param contentType The content type of the item.
	 */
	suspend fun updateItemContentType(itemId: UUID, contentType: String? = null): Response<Unit> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = mutableMapOf<String, Any?>()
		queryParameters["contentType"] = contentType
		val data = null
		val response = api.post<Unit>("/Items/{itemId}/ContentType", pathParameters, queryParameters,
				data)
		return response
	}

	/**
	 * Gets metadata editor info for an item.
	 *
	 * @param itemId The item id.
	 */
	suspend fun getMetadataEditorInfo(itemId: UUID): Response<MetadataEditorInfo> {
		val pathParameters = mutableMapOf<String, Any?>()
		pathParameters["itemId"] = itemId
		val queryParameters = emptyMap<String, Any?>()
		val data = null
		val response = api.get<MetadataEditorInfo>("/Items/{itemId}/MetadataEditor", pathParameters,
				queryParameters, data)
		return response
	}
}
