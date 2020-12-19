package org.jellyfin.apiclient.dsl

import org.jellyfin.apiclient.model.api.ClientCapabilities
import org.jellyfin.apiclient.model.api.DeviceProfile
import org.jellyfin.apiclient.model.api.GeneralCommandType

public class ClientCapabilityBuilder {
	// TODO use ENUM
	public val playableMediaTypes: MutableSet<String> = mutableSetOf()

	public val supportedCommands: MutableSet<GeneralCommandType> = mutableSetOf()
	public var supportsMediaControl: Boolean = false
	public var supportsPersistentIdentifier: Boolean = false

	private var deviceProfile: DeviceProfile? = null

	// supported commands - add
	public operator fun GeneralCommandType.unaryPlus() {
		supportedCommands.add(this)
	}

	public operator fun Iterable<GeneralCommandType>.unaryPlus() {
		supportedCommands.addAll(this)
	}

	public operator fun Array<GeneralCommandType>.unaryPlus() {
		supportedCommands.addAll(this)
	}

	// supported commands - remove
	public operator fun GeneralCommandType.unaryMinus() {
		supportedCommands.remove(this)
	}

	public operator fun Iterable<GeneralCommandType>.unaryMinus() {
		supportedCommands.removeAll(this)
	}

	public operator fun Array<GeneralCommandType>.unaryMinus() {
		supportedCommands.removeAll(this)
	}

	// device profile
	public fun deviceProfile(init: DeviceProfileBuilder.() -> Unit) {
		deviceProfile = DeviceProfileBuilder().apply(init).build()
	}

	public fun deviceProfile(name: String, init: DeviceProfileBuilder.() -> Unit) {
		deviceProfile = DeviceProfileBuilder().also { builder ->
			builder.name = name
			builder.init()
		}.build()
	}

	public fun build(): ClientCapabilities = ClientCapabilities(
		playableMediaTypes = playableMediaTypes.toList(),
		supportedCommands = supportedCommands.toList(),
		supportsMediaControl = supportsMediaControl,
		supportsContentUploading = false,
		messageCallbackUrl = null,
		supportsPersistentIdentifier = supportsPersistentIdentifier,
		supportsSync = false,
		deviceProfile = deviceProfile,
		appStoreUrl = null,
		iconUrl = null
	)
}

public fun createCapabilities(init: ClientCapabilityBuilder.() -> Unit): ClientCapabilities =
	ClientCapabilityBuilder().apply(init).build()

