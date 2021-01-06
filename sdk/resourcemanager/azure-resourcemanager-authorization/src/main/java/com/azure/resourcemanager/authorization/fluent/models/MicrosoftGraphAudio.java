// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** audio. */
@Fluent
public final class MicrosoftGraphAudio {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MicrosoftGraphAudio.class);

    /*
     * The title of the album for this audio file.
     */
    @JsonProperty(value = "album")
    private String album;

    /*
     * The artist named on the album for the audio file.
     */
    @JsonProperty(value = "albumArtist")
    private String albumArtist;

    /*
     * The performing artist for the audio file.
     */
    @JsonProperty(value = "artist")
    private String artist;

    /*
     * Bitrate expressed in kbps.
     */
    @JsonProperty(value = "bitrate")
    private Long bitrate;

    /*
     * The name of the composer of the audio file.
     */
    @JsonProperty(value = "composers")
    private String composers;

    /*
     * Copyright information for the audio file.
     */
    @JsonProperty(value = "copyright")
    private String copyright;

    /*
     * The number of the disc this audio file came from.
     */
    @JsonProperty(value = "disc")
    private Integer disc;

    /*
     * The total number of discs in this album.
     */
    @JsonProperty(value = "discCount")
    private Integer discCount;

    /*
     * Duration of the audio file, expressed in milliseconds
     */
    @JsonProperty(value = "duration")
    private Long duration;

    /*
     * The genre of this audio file.
     */
    @JsonProperty(value = "genre")
    private String genre;

    /*
     * Indicates if the file is protected with digital rights management.
     */
    @JsonProperty(value = "hasDrm")
    private Boolean hasDrm;

    /*
     * Indicates if the file is encoded with a variable bitrate.
     */
    @JsonProperty(value = "isVariableBitrate")
    private Boolean isVariableBitrate;

    /*
     * The title of the audio file.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The number of the track on the original disc for this audio file.
     */
    @JsonProperty(value = "track")
    private Integer track;

    /*
     * The total number of tracks on the original disc for this audio file.
     */
    @JsonProperty(value = "trackCount")
    private Integer trackCount;

    /*
     * The year the audio file was recorded.
     */
    @JsonProperty(value = "year")
    private Integer year;

    /*
     * audio
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the album property: The title of the album for this audio file.
     *
     * @return the album value.
     */
    public String album() {
        return this.album;
    }

    /**
     * Set the album property: The title of the album for this audio file.
     *
     * @param album the album value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withAlbum(String album) {
        this.album = album;
        return this;
    }

    /**
     * Get the albumArtist property: The artist named on the album for the audio file.
     *
     * @return the albumArtist value.
     */
    public String albumArtist() {
        return this.albumArtist;
    }

    /**
     * Set the albumArtist property: The artist named on the album for the audio file.
     *
     * @param albumArtist the albumArtist value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
        return this;
    }

    /**
     * Get the artist property: The performing artist for the audio file.
     *
     * @return the artist value.
     */
    public String artist() {
        return this.artist;
    }

    /**
     * Set the artist property: The performing artist for the audio file.
     *
     * @param artist the artist value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withArtist(String artist) {
        this.artist = artist;
        return this;
    }

    /**
     * Get the bitrate property: Bitrate expressed in kbps.
     *
     * @return the bitrate value.
     */
    public Long bitrate() {
        return this.bitrate;
    }

    /**
     * Set the bitrate property: Bitrate expressed in kbps.
     *
     * @param bitrate the bitrate value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Get the composers property: The name of the composer of the audio file.
     *
     * @return the composers value.
     */
    public String composers() {
        return this.composers;
    }

    /**
     * Set the composers property: The name of the composer of the audio file.
     *
     * @param composers the composers value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withComposers(String composers) {
        this.composers = composers;
        return this;
    }

    /**
     * Get the copyright property: Copyright information for the audio file.
     *
     * @return the copyright value.
     */
    public String copyright() {
        return this.copyright;
    }

    /**
     * Set the copyright property: Copyright information for the audio file.
     *
     * @param copyright the copyright value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    /**
     * Get the disc property: The number of the disc this audio file came from.
     *
     * @return the disc value.
     */
    public Integer disc() {
        return this.disc;
    }

    /**
     * Set the disc property: The number of the disc this audio file came from.
     *
     * @param disc the disc value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withDisc(Integer disc) {
        this.disc = disc;
        return this;
    }

    /**
     * Get the discCount property: The total number of discs in this album.
     *
     * @return the discCount value.
     */
    public Integer discCount() {
        return this.discCount;
    }

    /**
     * Set the discCount property: The total number of discs in this album.
     *
     * @param discCount the discCount value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withDiscCount(Integer discCount) {
        this.discCount = discCount;
        return this;
    }

    /**
     * Get the duration property: Duration of the audio file, expressed in milliseconds.
     *
     * @return the duration value.
     */
    public Long duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Duration of the audio file, expressed in milliseconds.
     *
     * @param duration the duration value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the genre property: The genre of this audio file.
     *
     * @return the genre value.
     */
    public String genre() {
        return this.genre;
    }

    /**
     * Set the genre property: The genre of this audio file.
     *
     * @param genre the genre value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    /**
     * Get the hasDrm property: Indicates if the file is protected with digital rights management.
     *
     * @return the hasDrm value.
     */
    public Boolean hasDrm() {
        return this.hasDrm;
    }

    /**
     * Set the hasDrm property: Indicates if the file is protected with digital rights management.
     *
     * @param hasDrm the hasDrm value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withHasDrm(Boolean hasDrm) {
        this.hasDrm = hasDrm;
        return this;
    }

    /**
     * Get the isVariableBitrate property: Indicates if the file is encoded with a variable bitrate.
     *
     * @return the isVariableBitrate value.
     */
    public Boolean isVariableBitrate() {
        return this.isVariableBitrate;
    }

    /**
     * Set the isVariableBitrate property: Indicates if the file is encoded with a variable bitrate.
     *
     * @param isVariableBitrate the isVariableBitrate value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withIsVariableBitrate(Boolean isVariableBitrate) {
        this.isVariableBitrate = isVariableBitrate;
        return this;
    }

    /**
     * Get the title property: The title of the audio file.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The title of the audio file.
     *
     * @param title the title value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the track property: The number of the track on the original disc for this audio file.
     *
     * @return the track value.
     */
    public Integer track() {
        return this.track;
    }

    /**
     * Set the track property: The number of the track on the original disc for this audio file.
     *
     * @param track the track value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withTrack(Integer track) {
        this.track = track;
        return this;
    }

    /**
     * Get the trackCount property: The total number of tracks on the original disc for this audio file.
     *
     * @return the trackCount value.
     */
    public Integer trackCount() {
        return this.trackCount;
    }

    /**
     * Set the trackCount property: The total number of tracks on the original disc for this audio file.
     *
     * @param trackCount the trackCount value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withTrackCount(Integer trackCount) {
        this.trackCount = trackCount;
        return this;
    }

    /**
     * Get the year property: The year the audio file was recorded.
     *
     * @return the year value.
     */
    public Integer year() {
        return this.year;
    }

    /**
     * Set the year property: The year the audio file was recorded.
     *
     * @param year the year value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withYear(Integer year) {
        this.year = year;
        return this;
    }

    /**
     * Get the additionalProperties property: audio.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: audio.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphAudio object itself.
     */
    public MicrosoftGraphAudio withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}