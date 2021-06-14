// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
@file:UseSerializers(
	UUIDSerializer::class,
	LocalDateTimeSerializer::class
)

package org.jellyfin.sdk.model.api

import java.time.LocalDateTime
import java.util.UUID
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers
import org.jellyfin.sdk.model.serializer.LocalDateTimeSerializer
import org.jellyfin.sdk.model.serializer.UUIDSerializer

/**
 * Class UserDto.
 */
@Serializable
public data class UserDto(
	/**
	 * Gets or sets the name.
	 */
	@SerialName("Name")
	public val name: String? = null,
	/**
	 * Gets or sets the server identifier.
	 */
	@SerialName("ServerId")
	public val serverId: String? = null,
	/**
	 * Gets or sets the name of the server.
	 * This is not used by the server and is for client-side usage only.
	 */
	@SerialName("ServerName")
	public val serverName: String? = null,
	/**
	 * Gets or sets the id.
	 */
	@SerialName("Id")
	public val id: UUID,
	/**
	 * Gets or sets the primary image tag.
	 */
	@SerialName("PrimaryImageTag")
	public val primaryImageTag: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance has password.
	 */
	@SerialName("HasPassword")
	public val hasPassword: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance has configured password.
	 */
	@SerialName("HasConfiguredPassword")
	public val hasConfiguredPassword: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance has configured easy password.
	 */
	@SerialName("HasConfiguredEasyPassword")
	public val hasConfiguredEasyPassword: Boolean,
	/**
	 * Gets or sets whether async login is enabled or not.
	 */
	@SerialName("EnableAutoLogin")
	public val enableAutoLogin: Boolean? = null,
	/**
	 * Gets or sets the last login date.
	 */
	@SerialName("LastLoginDate")
	public val lastLoginDate: LocalDateTime? = null,
	/**
	 * Gets or sets the last activity date.
	 */
	@SerialName("LastActivityDate")
	public val lastActivityDate: LocalDateTime? = null,
	/**
	 * Gets or sets the configuration.
	 */
	@SerialName("Configuration")
	public val configuration: UserConfiguration? = null,
	/**
	 * Gets or sets the policy.
	 */
	@SerialName("Policy")
	public val policy: UserPolicy? = null,
	/**
	 * Gets or sets the primary image aspect ratio.
	 */
	@SerialName("PrimaryImageAspectRatio")
	public val primaryImageAspectRatio: Double? = null
)
