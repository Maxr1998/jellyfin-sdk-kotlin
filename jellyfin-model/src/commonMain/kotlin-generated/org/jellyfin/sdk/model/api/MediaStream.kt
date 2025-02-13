// !!        WARNING
// !! DO NOT EDIT THIS FILE
//
// This file is generated by the openapi-generator module and is not meant for manual changes.
// Please read the README.md file in the openapi-generator module for additional information.
package org.jellyfin.sdk.model.api

import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Class MediaStream.
 */
@Serializable
public data class MediaStream(
	/**
	 * Gets or sets the codec.
	 */
	@SerialName("Codec")
	public val codec: String? = null,
	/**
	 * Gets or sets the codec tag.
	 */
	@SerialName("CodecTag")
	public val codecTag: String? = null,
	/**
	 * Gets or sets the language.
	 */
	@SerialName("Language")
	public val language: String? = null,
	/**
	 * Gets or sets the color range.
	 */
	@SerialName("ColorRange")
	public val colorRange: String? = null,
	/**
	 * Gets or sets the color space.
	 */
	@SerialName("ColorSpace")
	public val colorSpace: String? = null,
	/**
	 * Gets or sets the color transfer.
	 */
	@SerialName("ColorTransfer")
	public val colorTransfer: String? = null,
	/**
	 * Gets or sets the color primaries.
	 */
	@SerialName("ColorPrimaries")
	public val colorPrimaries: String? = null,
	/**
	 * Gets or sets the Dolby Vision version major.
	 */
	@SerialName("DvVersionMajor")
	public val dvVersionMajor: Int? = null,
	/**
	 * Gets or sets the Dolby Vision version minor.
	 */
	@SerialName("DvVersionMinor")
	public val dvVersionMinor: Int? = null,
	/**
	 * Gets or sets the Dolby Vision profile.
	 */
	@SerialName("DvProfile")
	public val dvProfile: Int? = null,
	/**
	 * Gets or sets the Dolby Vision level.
	 */
	@SerialName("DvLevel")
	public val dvLevel: Int? = null,
	/**
	 * Gets or sets the Dolby Vision rpu present flag.
	 */
	@SerialName("RpuPresentFlag")
	public val rpuPresentFlag: Int? = null,
	/**
	 * Gets or sets the Dolby Vision el present flag.
	 */
	@SerialName("ElPresentFlag")
	public val elPresentFlag: Int? = null,
	/**
	 * Gets or sets the Dolby Vision bl present flag.
	 */
	@SerialName("BlPresentFlag")
	public val blPresentFlag: Int? = null,
	/**
	 * Gets or sets the Dolby Vision bl signal compatibility id.
	 */
	@SerialName("DvBlSignalCompatibilityId")
	public val dvBlSignalCompatibilityId: Int? = null,
	/**
	 * Gets or sets the comment.
	 */
	@SerialName("Comment")
	public val comment: String? = null,
	/**
	 * Gets or sets the time base.
	 */
	@SerialName("TimeBase")
	public val timeBase: String? = null,
	/**
	 * Gets or sets the codec time base.
	 */
	@SerialName("CodecTimeBase")
	public val codecTimeBase: String? = null,
	/**
	 * Gets or sets the title.
	 */
	@SerialName("Title")
	public val title: String? = null,
	/**
	 * Gets the video range.
	 */
	@SerialName("VideoRange")
	public val videoRange: String? = null,
	/**
	 * Gets the video range type.
	 */
	@SerialName("VideoRangeType")
	public val videoRangeType: String? = null,
	/**
	 * Gets the video dovi title.
	 */
	@SerialName("VideoDoViTitle")
	public val videoDoViTitle: String? = null,
	@SerialName("LocalizedUndefined")
	public val localizedUndefined: String? = null,
	@SerialName("LocalizedDefault")
	public val localizedDefault: String? = null,
	@SerialName("LocalizedForced")
	public val localizedForced: String? = null,
	@SerialName("LocalizedExternal")
	public val localizedExternal: String? = null,
	@SerialName("DisplayTitle")
	public val displayTitle: String? = null,
	@SerialName("NalLengthSize")
	public val nalLengthSize: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance is interlaced.
	 */
	@SerialName("IsInterlaced")
	public val isInterlaced: Boolean,
	@SerialName("IsAVC")
	public val isAvc: Boolean? = null,
	/**
	 * Gets or sets the channel layout.
	 */
	@SerialName("ChannelLayout")
	public val channelLayout: String? = null,
	/**
	 * Gets or sets the bit rate.
	 */
	@SerialName("BitRate")
	public val bitRate: Int? = null,
	/**
	 * Gets or sets the bit depth.
	 */
	@SerialName("BitDepth")
	public val bitDepth: Int? = null,
	/**
	 * Gets or sets the reference frames.
	 */
	@SerialName("RefFrames")
	public val refFrames: Int? = null,
	/**
	 * Gets or sets the length of the packet.
	 */
	@SerialName("PacketLength")
	public val packetLength: Int? = null,
	/**
	 * Gets or sets the channels.
	 */
	@SerialName("Channels")
	public val channels: Int? = null,
	/**
	 * Gets or sets the sample rate.
	 */
	@SerialName("SampleRate")
	public val sampleRate: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is default.
	 */
	@SerialName("IsDefault")
	public val isDefault: Boolean,
	/**
	 * Gets or sets a value indicating whether this instance is forced.
	 */
	@SerialName("IsForced")
	public val isForced: Boolean,
	/**
	 * Gets or sets the height.
	 */
	@SerialName("Height")
	public val height: Int? = null,
	/**
	 * Gets or sets the width.
	 */
	@SerialName("Width")
	public val width: Int? = null,
	/**
	 * Gets or sets the average frame rate.
	 */
	@SerialName("AverageFrameRate")
	public val averageFrameRate: Float? = null,
	/**
	 * Gets or sets the real frame rate.
	 */
	@SerialName("RealFrameRate")
	public val realFrameRate: Float? = null,
	/**
	 * Gets or sets the profile.
	 */
	@SerialName("Profile")
	public val profile: String? = null,
	/**
	 * Gets or sets the type.
	 */
	@SerialName("Type")
	public val type: MediaStreamType,
	/**
	 * Gets or sets the aspect ratio.
	 */
	@SerialName("AspectRatio")
	public val aspectRatio: String? = null,
	/**
	 * Gets or sets the index.
	 */
	@SerialName("Index")
	public val index: Int,
	/**
	 * Gets or sets the score.
	 */
	@SerialName("Score")
	public val score: Int? = null,
	/**
	 * Gets or sets a value indicating whether this instance is external.
	 */
	@SerialName("IsExternal")
	public val isExternal: Boolean,
	/**
	 * Gets or sets the method.
	 */
	@SerialName("DeliveryMethod")
	public val deliveryMethod: SubtitleDeliveryMethod? = null,
	/**
	 * Gets or sets the delivery URL.
	 */
	@SerialName("DeliveryUrl")
	public val deliveryUrl: String? = null,
	/**
	 * Gets or sets a value indicating whether this instance is external URL.
	 */
	@SerialName("IsExternalUrl")
	public val isExternalUrl: Boolean? = null,
	@SerialName("IsTextSubtitleStream")
	public val isTextSubtitleStream: Boolean,
	/**
	 * Gets or sets a value indicating whether [supports external stream].
	 */
	@SerialName("SupportsExternalStream")
	public val supportsExternalStream: Boolean,
	/**
	 * Gets or sets the filename.
	 */
	@SerialName("Path")
	public val path: String? = null,
	/**
	 * Gets or sets the pixel format.
	 */
	@SerialName("PixelFormat")
	public val pixelFormat: String? = null,
	/**
	 * Gets or sets the level.
	 */
	@SerialName("Level")
	public val level: Double? = null,
	/**
	 * Gets or sets whether this instance is anamorphic.
	 */
	@SerialName("IsAnamorphic")
	public val isAnamorphic: Boolean? = null,
)
