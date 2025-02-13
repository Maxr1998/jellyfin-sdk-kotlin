// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines the MediaBrowser.Model.Configuration.PathSubstitution.
 */
@Serializable
public data class PathSubstitution(
	/**
	 * Gets or sets the value to substitute.
	 */
	@SerialName("From")
	public val from: String,
	/**
	 * Gets or sets the value to substitution with.
	 */
	@SerialName("To")
	public val to: String,
)
