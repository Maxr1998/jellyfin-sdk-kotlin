package org.jellyfin.apiclient.dsl

import org.jellyfin.apiclient.model.api.*

// https://github.com/jellyfin/jellyfin-androidtv/blob/master/app/src/main/java/org/jellyfin/androidtv/util/ProfileHelper.java
// https://github.com/jellyfin/jellyfin-roku/blob/master/source/utils/deviceCapabilities.brs

/**
 * Note: Does not contain ALL properties from DeviceProfile. Use .build().copy() to add those
 */
public class DeviceProfileBuilder {
	public var name: String = DEFAULT_NAME
	public var maxStreamingBitrate: Int? = DEFAULT_BITRATE
	public var maxStaticBitrate: Int? = DEFAULT_BITRATE

	public var directPlayProfiles: MutableSet<DirectPlayProfile> = mutableSetOf()
	public var transcodingProfiles: MutableSet<TranscodingProfile> = mutableSetOf()

	//public var responseProfiles: MutableSet<ResponseProfile> = mutableSetOf()
	public var codecProfiles: MutableSet<CodecProfile> = mutableSetOf()
	public var containerProfiles: MutableSet<ContainerProfile> = mutableSetOf()
	public var subtitleProfiles: MutableSet<SubtitleProfile> = mutableSetOf()

	public fun build(): DeviceProfile = DeviceProfile(
		name = name,
		id = null,
		identification = null,
		friendlyName = name,
		manufacturer = null,
		manufacturerUrl = null,
		modelName = null,
		modelDescription = null,
		modelNumber = null,
		modelUrl = null,
		serialNumber = null,
		enableAlbumArtInDidl = true,
		enableSingleAlbumArtLimit = false,
		enableSingleSubtitleLimit = false,
		supportedMediaTypes = null,
		userId = null,
		albumArtPn = null,
		maxAlbumArtWidth = Int.MAX_VALUE,
		maxAlbumArtHeight = Int.MAX_VALUE,
		maxIconWidth = null,
		maxIconHeight = null,
		maxStreamingBitrate = maxStreamingBitrate,
		maxStaticBitrate = maxStaticBitrate,
		musicStreamingTranscodingBitrate = null,
		maxStaticMusicBitrate = null,
		sonyAggregationFlags = null,
		protocolInfo = null,
		timelineOffsetSeconds = 0,
		requiresPlainVideoItems = false,
		requiresPlainFolders = false,
		enableMsMediaReceiverRegistrar = false,
		ignoreTranscodeByteRangeRequests = false,
		xmlRootAttributes = null,
		directPlayProfiles = directPlayProfiles.toList(),
		transcodingProfiles = transcodingProfiles.toList(),
		containerProfiles = containerProfiles.toList(),
		codecProfiles = codecProfiles.toList(),
		responseProfiles = emptyList(),
		subtitleProfiles = subtitleProfiles.toList()
	)

	public companion object {
		public const val DEFAULT_NAME: String = "jellyfin-apiclient-java"
		public const val DEFAULT_BITRATE: Int = 8000000 // 1MB
	}
}

public fun createDeviceProfile(init: DeviceProfileBuilder.() -> Unit): DeviceProfile =
	DeviceProfileBuilder().apply(init).build()
